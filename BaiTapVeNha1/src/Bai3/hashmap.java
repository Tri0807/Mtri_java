package Bai3;
import java.util.*;

public class hashmap {
public static void main(String[] args) {
	
		HashMap<Integer, String> ds = new HashMap<Integer, String>();
		Scanner sc = new Scanner(System.in);
		
		try {	
			System.out.print("Nhap so luong sach ban dau: ");
			int n = sc.nextInt();
			
			for (int i = 0 ; i < n ; i++) {
				System.out.println("--- Nhap cuon thu " + (i + 1) + " ---");
				System.out.print("Nhap Ma sach (So nguyen): ");
				int maSach = sc.nextInt();
				
				sc.nextLine();
				
				System.out.print("Nhap Ten sach (Chuoi): ");
				String tenSach = sc.nextLine();
				
				ds.put(maSach, tenSach);
			}
			
			System.out.println("\n=== DANH SACH CAC CUON SACH ===");
		
			for (Integer key : ds.keySet()) {
				System.out.println("Ma sach: " + key + " | Ten sach: " + ds.get(key));
			}
			
			System.out.println("\n=== SUA THONG TIN SACH ===");
			System.out.print("Nhap Ma sach can sua: ");
			int maSua = sc.nextInt();

			if (ds.containsKey(maSua)) {
				sc.nextLine();
			    System.out.print("Nhap ten sach MOI: ");
			    String tenMoi = sc.nextLine();
	
			    ds.put(maSua, tenMoi);
			    System.out.println("=> Sua thanh cong!");
			} else {
				System.out.println("=> Ma sach khong ton tai!");
			}
			
			System.out.println("Danh sach sau khi sua:");
			for (Integer key : ds.keySet()) {
				System.out.println("Ma: " + key + " | Ten: " + ds.get(key));
			}
		
			System.out.println("\n=== XOA SACH ===");
			System.out.print("Nhap Ma sach can xoa: ");
			int maXoa = sc.nextInt();

			if (ds.containsKey(maXoa)) {
			    ds.remove(maXoa); 
			    System.out.println("=> Xoa thanh cong!");
			} else {
				System.out.println("=> Ma sach khong ton tai!");
			}
			
			System.out.println("Danh sach sau khi xoa:");
			for (Integer key : ds.keySet()) {
				System.out.println("Ma: " + key + " | Ten: " + ds.get(key));
			}
			System.out.println("\n=== TIM KIEM SACH ===");
			System.out.print("Nhap Ma sach can tim kiem: ");
			int maTimKiem = sc.nextInt();

			if (ds.containsKey(maTimKiem)) {
			    System.out.println("=> TIM THAY: Ma sach " + maTimKiem + " co ten la '" + ds.get(maTimKiem) + "'");
			} else {
				System.out.println("=> Ma sach khong ton tai!");
			}
			
		} catch(Exception ex) {
			System.out.println("Loi nhap du lieu! (Co the do ong nhap chu vao cho bat nhap so)");
		} finally {
            sc.close();
        }
	}
}


