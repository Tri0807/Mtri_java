package ThucHanhBai4;
import java.util.ArrayList;
import java.util.Collections; 
import java.util.Scanner;

public class Bai1{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> ds = new ArrayList<String>();
        int luaChon = 0;

     
        do {
            System.out.println("\n========== MENU QUAN LY ==========");
            System.out.println("1. Them Sinh vien");
            System.out.println("2. Xuat danh sach Sinh vien");
            System.out.println("3. Sua Sinh vien");
            System.out.println("4. Xoa Sinh vien chua ten bat ky");
            System.out.println("5. Tim Sinh vien ma ten co chu 'An'");
            System.out.println("6. Sap xep Sinh vien");
            System.out.println("7. Xuat ra so luong Sinh vien");
            System.out.println("0. Thoat chuong trinh");
            System.out.print("=> Ong chon chuc nang nao (0-7): ");
            try {
                luaChon = sc.nextInt();
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("Loi roi: Phai nhap so nguyen!");
                sc.nextLine(); 
            }

            switch (luaChon) {
                case 1:
                    System.out.print("Nhap ho ten Sinh vien muon them: ");
                    String tenThem = sc.nextLine();
                    ds.add(tenThem);
                    System.out.println("=> Da them thanh cong!");
                    break;

                case 2: 
                    System.out.println("--- DANH SACH LOP ---");
                    if (ds.isEmpty()) {
                        System.out.println("Danh sach dang trong tronic, chua co ai.");
                    } else {
                    
                        for (int i = 0; i < ds.size(); i++) {
                            System.out.println((i + 1) + ". " + ds.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.print("Nhap vi tri Sinh vien can sua (Tu 1 den " + ds.size() + "): ");
                    int viTriSua = sc.nextInt();
                    sc.nextLine(); 
                    if (viTriSua >= 1 && viTriSua <= ds.size()) {
                        System.out.print("Nhap ten moi: ");
                        String tenMoi = sc.nextLine();
                        ds.set(viTriSua - 1, tenMoi);
                        System.out.println("=> Da sua thanh cong!");
                    } else {
                        System.out.println("=> Vi tri khong ton tai!");
                    }
                    break;

                case 4: 
                    System.out.print("Nhap tu khoa hoac ten muon xoa: ");
                    String tuKhoaXoa = sc.nextLine();
                    boolean xoaThanhCong = false;

                    
                    for (int i = ds.size() - 1; i >= 0; i--) {
                        if (ds.get(i).contains(tuKhoaXoa)) {
                            ds.remove(i);
                            xoaThanhCong = true;
                        }
                    }

                    if (xoaThanhCong) {
                        System.out.println("=> Da xoa cac Sinh vien co chua chu '" + tuKhoaXoa + "'.");
                    } else {
                        System.out.println("=> Khong tim thay ai co ten do de xoa.");
                    }
                    break;

                case 5: 
                    System.out.println("--- Ket qua tim kiem chua chu 'An' ---");
                    boolean timThay = false;
                    for (String ten : ds) {
                        if (ten.contains("An") || ten.contains("an")) {
                            System.out.println("- " + ten);
                            timThay = true;
                        }
                    }
                    if (timThay == false) {
                        System.out.println("=> Khong co ai ten An trong lop.");
                    }
                    break;

                case 6:
                    Collections.sort(ds);
                    System.out.println("=> Da sap xep danh sach theo thu tu A-Z (Alphabet).");
                    break;

                case 7: 
                    System.out.println("=> Tong so Sinh vien hien tai: " + ds.size() + " nguoi.");
                    break;

                case 0:
                    System.out.println("=> Dang thoat chuong trinh. Hen gap lai ong nha!");
                    break;

                default:
                    System.out.println("=> Chuc nang khong ton tai! Ong chon lai tu 0-7 nha.");
                    break;
            }

        } while (luaChon != 0);

        sc.close();
    }
}