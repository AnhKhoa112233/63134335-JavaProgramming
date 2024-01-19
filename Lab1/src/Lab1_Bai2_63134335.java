/**
 * 
 */
import java.util.Scanner;
/**
 * 
 */
public class Lab1_Bai2_63134335 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		//Nhap chieu dai hcn
		System.out.print("Nhap chieu dai: ");
		double dai= scanner.nextDouble();
		//Nhap chieu rong hcn
		System.out.print("Nhap chieu rong: ");
		double rong= scanner.nextDouble();
		double chuvi = (dai+rong)*2;
		double dientich=dai*rong;
		double Canhnhonhat=Math.min(dai, rong);
		//Xuat ket qua 
		System.out.printf("Chu vi hcn: %.2f",chuvi);
		System.out.printf("\nDien tich hcn: %.2f", dientich);
		System.out.printf("\nCanh nho nhat hcn la: %.4f", Canhnhonhat);
	}

}
