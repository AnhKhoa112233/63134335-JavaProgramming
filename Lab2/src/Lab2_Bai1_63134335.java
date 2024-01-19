/**
 * 
 */
import java.util.Scanner;
/**
 * 
 */
public class Lab2_Bai1_63134335 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		//Nhap a va b	
		System.out.println("Giai phuong trinh bac 1 ax+b=0:");
		System.out.print("Nhap a: ");
		double a= scanner.nextDouble();
		System.out.print("Nhap b: ");
		double b= scanner.nextDouble();
		//Điều kiện 
		if(a==0)
		{
			if(b==0)
			{
				System.out.println("Phuong trinh da cho vo so nghiem");
			}
			else 
			{
				System.out.println("Phuong trinh da cho vo nghiem");
			}
		
		}
		else 
		{
			double x=-b/a;
			System.out.printf("Phuong trinh co nghiem:%.2f",x);
		}
	}

}
