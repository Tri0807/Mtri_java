package ThucHanhBai4;

import java.util.*;

public class Bai4 {

    public static boolean kiemTraNguyenTo(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> danhSachLe = new ArrayList<Integer>();
        ArrayList<Integer> danhSachChan = new ArrayList<Integer>();
        ArrayList<Integer> danhSachNguyenTo = new ArrayList<Integer>();
        ArrayList<Integer> khongNguyenTo = new ArrayList<Integer>();

        try {
            System.out.print("Nhap so luong phan tu cua mang: ");
            int n = sc.nextInt();

            int[] mang = new int[n];

            System.out.println("Nhap cac phan tu vao mang: ");
            for (int i = 0; i < n; i++) {
                mang[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                int so = mang[i];

                if (so % 2 == 0) {
                    danhSachChan.add(so);
                } else {
                    danhSachLe.add(so);
                }

                if (kiemTraNguyenTo(so) == true) {
                    danhSachNguyenTo.add(so);
                } else {
                    khongNguyenTo.add(so);
                }
            }

            System.out.println("\n=== KET QUA PHAN LOAI ===");

            System.out.print("- Dong 1 (So le): ");
            for (int so : danhSachLe) {
                System.out.print(so + " ");
            }
            System.out.println("=> Tong cong co " + danhSachLe.size() + " so le.");

            System.out.print("- Dong 2 (So chan): ");
            for (int so : danhSachChan) {
                System.out.print(so + " ");
            }
            System.out.println("=> Tong cong co " + danhSachChan.size() + " so chan.");

            System.out.print("- Dong 3 (So nguyen to): ");
            for (int so : danhSachNguyenTo) {
                System.out.print(so + " ");
            }
            System.out.println();

            System.out.print("- Dong 4 (Khong nguyen to): ");
            for (int so : khongNguyenTo) {
                System.out.print(so + " ");
            }
            System.out.println();

        } catch (Exception e) {
            System.out.println("Loi roi! Ong vui long chi nhap so nguyen nha.");
        } finally {
            sc.close();
        }
    }
}