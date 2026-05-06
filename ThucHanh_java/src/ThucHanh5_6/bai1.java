package ThucHanh5_6;

public class bai1  {
    private String ho;
    private String ten;
    private int soSP;
    public bai1(String ho, String ten, int soSP) {
        this.ho = ho;
        this.ten = ten;
        if (soSP < 0) {
            this.soSP = 0;
        } else {
            this.soSP = soSP;
        }
    }
    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoSP() {
        return soSP;
    }

    public void setSoSP(int soSP) {
        if (soSP < 0) {
            this.soSP = 0;
        } else {
            this.soSP = soSP;
        }
    }
    public double getLuong() {
        double donGia = 0;
        if (this.soSP < 100) {
            donGia = 10000;      
        } else if (this.soSP <= 200) {
            donGia = 12000;               } else {
            donGia = 15000;      
        }
        // ------------------------------------------------------------------------
        
        return this.soSP * donGia;
    }
    public void xuatThongTin() {
        System.out.println("Nhan vien: " + this.ho + " " + this.ten 
                           + " | So SP: " + this.soSP 
                           + " | Luong: " + this.getLuong());
    }
    public static void main(String[] args) {
        System.out.println("=== KIEM TRA CLASS NHAN VIEN ===");
        bai1 nv1 = new bai1("Nguyen", "Teo", -5);
        nv1.xuatThongTin();
        bai1 nv2 = new bai1("Tran", "Ty", 150);
        nv2.xuatThongTin();
        System.out.println("\n--- Sau khi dung ham Set sua thong tin nhan vien 1 ---");
        nv1.setTen("Ti");
        nv1.setSoSP(300);
        nv1.xuatThongTin();
    }
}