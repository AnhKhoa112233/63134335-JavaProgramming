/**
 * 
 */
import java.util.Scanner;
/**
 * 
 */
public class Lab4_Bai2_63134335 {

	/**
	 * @param args
	 */
	//Tao lop 
	public static class SanPham{
		private String TenSP;
		private double gia;
		private double giamgia;
		public SanPham(String TenSP,double gia, double giamgia ) {
			this.TenSP= TenSP;
			this.gia= gia;
			this.giamgia=giamgia;
		}
		// Tao phuong thuc tinh thue 
		public double TinhThue()
		{
			return 0.1 * gia;
		}
		//Ham xuat thong tin
		public void XuatSP() {
			System.out.println("Ten san pham: "+ TenSP);
			System.out.println("Gia san pham: "+ gia);
			System.out.println("Giam gia san pham: "+ giamgia);
			System.out.println("Ten san pham: "+ TinhThue());
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//Tao 1 doi tuong SP
			Scanner scanner = new Scanner(System.in);
			//Nhap tt san pham thu nhat
			System.out.println("Nhap thong tin cho san pham 1: ");
			System.out.print("Tên sản phẩm: ");
			String TenSP1= scanner.nextLine();
			System.out.print("Giá sản phẩm: ");
			double  gia1= scanner.nextDouble();
			System.out.print("Giảm giá sản phẩm: ");
			double  giamgia1= scanner.nextDouble();
			//Tao 1 đối tượng
			SanPham sanpham1= new SanPham (TenSP1,gia1,giamgia1);
			System.out.println("Nhap thong tin cho san pham 2: ");
			scanner.nextLine(); 
			System.out.print("Tên sản phẩm: ");
			String TenSP2= scanner.nextLine();
			System.out.print("Giá sản phẩm: ");
			double  gia2= scanner.nextDouble();
			System.out.print("Giảm giá sản phẩm: ");
			double  giamgia2= scanner.nextDouble();
			//Tao 1 đối tượng
			SanPham sanpham2= new SanPham (TenSP2,gia2,giamgia2);
			scanner.close();

            // Xuất thông tin của hai đối tượng sản phẩm
            System.out.println("\nThong tin san pham 1:");
            sanpham1.XuatSP();

            System.out.println("\nThong tin san pham 2:");
            sanpham2.XuatSP();
		}
	}
	//Khai báo dl
	

}
