package Buoi2;
import java.util.Scanner;

public class Bai_3 {
    public static boolean Panlyndrome(String s) {       
        s = s.toLowerCase();         
        int length = s.length();        
        for (int i = 0; i < length / 2; i++) {
            char charDau = s.charAt(i);
            char charCuoi = s.charAt(length - 1 - i);          
            if (charDau != charCuoi) {
                return false; 
            }
        }
        return true; 
    } 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       
        System.out.println("=== GAME KIỂM TRA CHUỖI ĐỐI XỨNG ===");       
        try {
            System.out.print("Ông nhập vào một chuỗi (ví dụ: radar, madam...): ");
            String input = scanner.nextLine();           
            boolean ketQua = Panlyndrome(input);            
            System.out.println("\n--- KẾT QUẢ ---");
            if (ketQua == true) {
                System.out.println("🎉 Tuyệt vời! Chữ '" + input + "' LÀ chuỗi đối xứng.");
            } else {
                System.out.println("❌ Rất tiếc! Chữ '" + input + "' KHÔNG PHẢI là chuỗi đối xứng.");
            }       
        } catch (Exception e) {
            System.out.println("Lỗi bất ngờ rồi: " + e.getMessage());
        } finally {
            scanner.close(); // Đóng đồ nghề
            System.out.println("-----------------");
        }
    }
}