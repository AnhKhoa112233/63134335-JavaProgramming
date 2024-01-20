/**
 * 
 */
import java.util.Scanner;
/**
 * 
 */
public class Lab2_Bai3_63134335 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		int tien;
		//Nhap so điện sử dụng
		System.out.print("Nhap so dien su dung: ");
		int dien= scanner.nextInt();
		//Tinh tien
		if(dien<50)
		{
			 tien= dien*1000;
		}
		else
		{
			 tien=50*1000+(dien-50)*1200;
		}
		//Xuat kq
		System.out.printf("So tien dien da su dung la: %d VND", tien);
	}

}
