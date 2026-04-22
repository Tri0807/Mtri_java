package Buoi2; 

import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Buoi_2 { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rd = new Random();
        boolean keepPlaying = true;
        System.out.println("=== GAME ĐOÁN SỐ BẢN NÂNG CẤP [a...b] ===");
        while (keepPlaying) {
            int a = 0, b = 0;
            boolean validRange = false;
            System.out.println("\n--- BƯỚC 1: THIẾT LẬP ĐỘ KHÓ ---");
            while (!validRange) {
                try {
                    System.out.print("Nhập giá trị bắt đầu (a): ");
                    a = scanner.nextInt();
                    System.out.print("Nhập giá trị kết thúc (b): ");
                    b = scanner.nextInt();
                    if (a >= b) {
                        System.out.println("Lỗi: Giá trị 'b' phải lớn hơn 'a'. Ông nhập lại đi!");
                    } else {
                        validRange = true; 
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Lỗi: Phải nhập số nguyên, không được gõ chữ!");
                    scanner.nextLine(); 
                }
            }

            int targetNumber = a + rd.nextInt(b - a + 1);
            int maxAttempts = 7;
            int currentAttempt = 0;
            boolean isWin = false;
            System.out.println("\n--- BƯỚC 2: BẮT ĐẦU ĐOÁN ---");
            System.out.println("Máy đã bí mật chọn một số từ " + a + " đến " + b + ".");
            System.out.println("Ông có tối đa 7 lần đoán. Vô!");

            while (currentAttempt < maxAttempts) {
                System.out.print("\nLần đoán thứ " + (currentAttempt + 1) + " - Nhập số ông đoán: ");
                int guess = -1;

                try {
                    guess = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Lỗi: Vui lòng nhập một con số!");
                    scanner.nextLine(); 
                    continue; 
                }
                currentAttempt++;

                if (guess == targetNumber) {
                    isWin = true;
                    System.out.println("🎉 WIN WIN WIN! Ông đã đoán trúng số " + targetNumber + " chỉ sau " + currentAttempt + " lần.");
                    break;
                } else if (guess < targetNumber) {
                    System.out.println("-> Sai rồi! Số máy tính chọn LỚN HƠN " + guess + ".");
                } else {
                    System.out.println("-> Sai rồi! Số máy tính chọn NHỎ HƠN " + guess + ".");
                }

                if (currentAttempt < maxAttempts) {
                    System.out.println("   (Ông còn " + (maxAttempts - currentAttempt) + " lần đoán)");
                }
            }

            if (!isWin) {
                System.out.println("\n💀 GAME OVER nha thím! Chơi tới 7 lần mà vẫn trật.");
                System.out.println("Số bí mật của máy là: " + targetNumber);
            }

            System.out.print("\nÔng có muốn làm ván nữa không? (Nhập 'C' để Có, phím khác để Nghỉ): ");
            String answer = scanner.next();
            if (!answer.equalsIgnoreCase("C")) {
                keepPlaying = false;
                System.out.println("Cảm ơn ông đã chơi! Tắt máy nghỉ ngơi thôi.");
            }
        }
        
        scanner.close();
    }
}