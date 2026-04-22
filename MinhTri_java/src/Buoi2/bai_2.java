package Buoi2;

public class bai_2 {

	public static void main(String[] args) {
       
        String path = "D:/music/bolero/longme.mp3";
        System.out.println("Đường dẫn gốc: " + path);

        try {
            int viTriGachCheo = path.lastIndexOf("/");
            String tenFileCoDuoi = path.substring(viTriGachCheo + 1);
            System.out.println("1. Tên file có đuôi: " + tenFileCoDuoi);
            int viTriDauCham = tenFileCoDuoi.lastIndexOf(".");       
            String tenFileKhongDuoi = tenFileCoDuoi.substring(0, viTriDauCham);
            System.out.println("2. Tên file không đuôi: " + tenFileKhongDuoi);
        } catch (StringIndexOutOfBoundsException e) {         
            System.out.println("-> LỖI RỒI: Đường dẫn hoặc tên file bị sai cấu trúc (ví dụ: file không có đuôi '.mp3').");       
        } catch (NullPointerException e) {    
            System.out.println("-> LỖI RỒI: Đường dẫn đang bị trống, không có gì để cắt cả.");           
        } catch (Exception e) {
                  System.out.println("-> LỖI KHÔNG XÁC ĐỊNH: " + e.getMessage());
        }
    }
}
