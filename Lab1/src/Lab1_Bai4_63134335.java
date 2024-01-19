/**
 * 
 */
import java.util.Scanner;
/**
 * 
 */
public class Lab1_Bai4_63134335 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner (System.in);
		//Nhap cac he so a,b,c cua pt bac 2
		System.out.println("Nhap cac he so cua pt bac 2.");
		System.out.print("Nhap a: ");
		double a= scanner.nextDouble();
		System.out.print("Nhap b: ");
		double b= scanner.nextDouble();
		System.out.print("Nhap c: ");
		double c= scanner.nextDouble();
		//Tinh delta
		double delta= Math.pow(b, 2)-4*a*c;
		//Tinh can delta
		double can= Math.sqrt(delta);
		//Xuat ket qua ra man hinh
		System.out.printf("Ket qua Delta: %.2f", delta);
		System.out.printf("Ket qua can Delta: %.2f", can);
		}

}
