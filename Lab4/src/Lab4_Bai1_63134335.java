/**
 * 
 */
import java.util.Scanner;
/**
 * 
 */
public class Lab4_Bai1_63134335 {

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
		// Tao ham tinh thue 
		public double TinhThue()
		{
			return 0.1 * gia;
		}
		//Ham xuat thong tin
		public void XuatSP() {
			System.out.println("Ten san pham: "+ TenSP);
			System.out.println("Gia san pham: "+ gia);
			System.out.println("Giam gia san pham: "+ giamgia);
			System.out.println("Thue san pham: "+ TinhThue());
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//Tao 1 doi tuong SP
			SanPham sanpham1 = new SanPham("Ao Kaki",2000,500);
			sanpham1.XuatSP();
		}
	}
	//Khai báo dl
	

}
