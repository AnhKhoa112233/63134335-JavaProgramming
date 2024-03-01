import java.util.Scanner;

public class Lab4_Bai4_63134335 {
    public static class SanPham {
        private String tenSP;
        private double gia;
        private double giamGia;

        public SanPham(String tenSP, double gia, double giamGia) {
            this.tenSP = tenSP;
            this.gia = gia;
            this.giamGia = giamGia;
        }

        public SanPham(String tenSP, double gia) {
            this(tenSP, gia, 0);
        }

        public void xuat() {
            System.out.println("Tên sản phẩm: " + tenSP);
            System.out.println("Giá sản phẩm: " + gia);
            System.out.println("Giảm giá: " + giamGia);
            System.out.println("Thu nhập thuế: " + getThueThuNhap());
        }

        private double getThueThuNhap() {
            double thueThuNhap = gia * 0.1;  // Ví dụ: 10% giá sản phẩm
            return thueThuNhap;
        }

        // Getter và setter cho tenSP
        public String getTenSP() {
            return tenSP;
        }

        public void setTenSP(String tenSP) {
            this.tenSP = tenSP;
        }

        // Getter và setter cho gia
        public double getGia() {
            return gia;
        }

        public void setGia(double gia) {
            this.gia = gia;
        }

        // Getter và setter cho giamGia
        public double getGiamGia() {
            return giamGia;
        }

        public void setGiamGia(double giamGia) {
            this.giamGia = giamGia;
        }

        public static void main(String[] args) {
            SanPham sp1 = new SanPham("Sản phẩm A", 100.0, 10);
            SanPham sp2 = new SanPham("Sản phẩm B", 150.0);

            System.out.println("Thông tin sản phẩm 1:");
            sp1.xuat();

            System.out.println("\nThông tin sản phẩm 2:");
            sp2.xuat();
        }
    }
}
