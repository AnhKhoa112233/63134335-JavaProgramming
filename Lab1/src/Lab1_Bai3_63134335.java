/**
 * 
 */
import java.util.Scanner;
/**
 * 
 */
public class Lab1_Bai3_63134335 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		//Nhap canh lap phuong
		System.out.print("Nhap canh khoi lap phuong:");
		double canh = scanner.nextDouble();
		//Tinh dien tich
		double thetich= Math.pow(canh, 3);
		//Xuat ket qua
		System.out.printf("The tich khoi lap phuong: %.2f",thetich);
	}

}
