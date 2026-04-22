package Buoi2;

public class bai_2 {

	public static void main(String[] args) {
        // Tui đổi một chút: dùng biến path, ông có thể thử đổi nó thành "longme" 
        // hoặc để trống "" để xem try-catch nó bắt lỗi như thế nào nhé.
        String path = "D:/music/bolero/longme.mp3";
        System.out.println("Đường dẫn gốc: " + path);

        try {
            // ==========================================
            // YÊU CẦU 1: Lấy "longme.mp3" (Tên file có đuôi)
            // ==========================================
            int viTriGachCheo = path.lastIndexOf("/");
            
            // Cắt từ sau dấu '/' đến hết chuỗi
            String tenFileCoDuoi = path.substring(viTriGachCheo + 1);
            System.out.println("1. Tên file có đuôi: " + tenFileCoDuoi);

            // ==========================================
            // YÊU CẦU 2: Lấy "longme" (Tên file không đuôi)
            // ==========================================
            int viTriDauCham = tenFileCoDuoi.lastIndexOf(".");
            
            // Nếu không có dấu chấm, viTriDauCham sẽ là -1, 
            // lệnh substring bên dưới sẽ chủ động ném ra lỗi để catch chộp lấy.
            String tenFileKhongDuoi = tenFileCoDuoi.substring(0, viTriDauCham);
            System.out.println("2. Tên file không đuôi: " + tenFileKhongDuoi);

        } catch (StringIndexOutOfBoundsException e) {
            // Lỗi này văng ra khi chỉ mục cắt chuỗi bị âm hoặc vượt quá độ dài chuỗi
            System.out.println("-> LỖI RỒI: Đường dẫn hoặc tên file bị sai cấu trúc (ví dụ: file không có đuôi '.mp3').");
            
        } catch (NullPointerException e) {
            // Lỗi này văng ra nếu biến path chưa có dữ liệu (bằng null)
            System.out.println("-> LỖI RỒI: Đường dẫn đang bị trống, không có gì để cắt cả.");
            
        } catch (Exception e) {
            // Màng lưới cuối cùng bắt các lỗi dị thường khác
            System.out.println("-> LỖI KHÔNG XÁC ĐỊNH: " + e.getMessage());
        }
    }
}
