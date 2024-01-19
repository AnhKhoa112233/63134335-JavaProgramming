/**
 * 
 */
import java.util.Scanner;
/**
 * 
 */
public class Lab2_Bai2_63134335 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		//Nhap a,b,c 
		System.out.println("Giải phương trình bậc 2 ax^2+bx+c :");
		System.out.print("Nhap a: ");
		double a= scanner.nextDouble();
		System.out.print("Nhap b: ");
		double b= scanner.nextDouble();
		System.out.print("Nhap c: ");
		double c= scanner.nextDouble();
		if(a==0) 
		{
			if(b==0)
			{
				if(c==0)
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
				double x=-c/b;
				System.out.printf("Phuong trinh co nghiem:%.2f",x);
			}
		}
		else
		{
			double delta = Math.pow(b,2)-4*a*c;
			if(delta<0)
			{
				System.out.println("Phuong trinh da cho vo  nghiem");
			}
			else if (delta==0)
			{
				double x=-b/(2*a);
				System.out.printf("Phuong trinh da cho co nghiem duy nhat: %.2f",x);
			}
			else
			{
				double x1= (-b+Math.sqrt(delta))/(2*a);
				double x2= (-b-Math.sqrt(delta))/(2*a);
				System.out.printf("Phuong trinh da cho co 2 nghiem phan biet: \n x1= %.2f \n x2= %.2f",x1,x2);
			}
		}
	}

}
