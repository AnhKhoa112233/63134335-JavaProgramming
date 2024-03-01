/**
 * 
 */
import java.util.Scanner;
/**
 * 
 */
public class Lab4_Bai3_63134335 {
	public static class SanPham {
	    private String TenSP;
	    private double gia;
	    private double giamgia;

	    // Hàm tạo có 3 tham số: tên, giá, giảm gi
	    public SanPham(String TenSP, double gia, double giamgia) {
	        this.TenSP = TenSP;
	        this.gia = gia;
	        this.giamgia = giamgia;
	    }

	    // Hàm tạo có 2 tham số: tên và giá (ngầm hiểu không giảm giá)
	    public SanPham(String TenSP, double gia ) {
	        this(TenSP, gia, 0);  // Gọi hàm tạo có 3 tham số và giảm giá mặc định là 0
	    }

	    // Phương thức xuat() với quyền truy cập public
	    public void xuat() {
	        System.out.println("Tên sản phẩm: " + TenSP);
	        System.out.println("Giá sản phẩm: " + gia);
	        System.out.println("Giảm giá: " + giamgia);
	        System.out.println("Thu nhập thuế: " + getThueThuNhap());
	    }

	    // Phương thức getThueThuNhap() với quyền truy cập private
	    private double getThueThuNhap() {
	        // Giả sử có một công thức tính thuế thu nhập nào đó
	        // ở đây, ta chỉ làm mẫu với giả định đơn giản
	        double thueThuNhap = gia * 0.1;  // Ví dụ: 10% giá sản phẩm
	        return thueThuNhap;
	    }

	    public static void main(String[] args) {
	    	
	    	
	        // Tạo sản phẩm có giảm giá
	        SanPham sp1 = new SanPham("Sản phẩm A", 100.0,10);

	        // Tạo sản phẩm không giảm giá (sử dụng hàm tạo thứ 2)
	        SanPham sp2 = new SanPham("Sản phẩm B", 150.0);

	        // Xuất thông tin sản phẩm ra màn hình
	        System.out.println("Thông tin sản phẩm 1:");
	        sp1.xuat();

	        System.out.println("\nThông tin sản phẩm 2:");
	        sp2.xuat();
	    }
	}


}
