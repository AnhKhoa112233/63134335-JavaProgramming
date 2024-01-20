/**
 * 
 */
import java.util.Scanner;
/**
 * 
 */
public class Lab2_Bai4_63134335 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		//Chon chuc nang
		System.out.println("+----------------------------+");
		System.out.println("1.Giai phuong trinh bac nhat");
		System.out.println("2.Giai phuong trinh bac hai");
		System.out.println("3.Tinh tien dien");
		System.out.println("4.Ket thuc");
		System.out.println("+----------------------------+");
		System.out.print("Chon chuc nang:");
		int n= scanner.nextInt();
		//Xu lí
		
			switch(n)
			{
			case 1:	
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
			break;
			case 2:
				System.out.println("Giải phương trình bậc 2 ax^2+bx+c :");
				System.out.print("Nhap a: ");
				double a_1= scanner.nextDouble();
				System.out.print("Nhap b: ");
				double b_1= scanner.nextDouble();
				System.out.print("Nhap c: ");
				double c_1= scanner.nextDouble();
				if(a_1==0) 
				{		
					if(b_1==0)
					{
						if(c_1==0)
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
						double x=-c_1/b_1;
						System.out.printf("Phuong trinh co nghiem:%.2f",x);
					}
				}
				else
				{
					double delta = Math.pow(b_1,2)-4*a_1*c_1;
					if(delta<0)
					{
						System.out.println("Phuong trinh da cho vo  nghiem");
					}
					else if (delta==0)
					{
						double x=-b_1/(2*a_1);
						System.out.printf("Phuong trinh da cho co nghiem duy nhat: %.2f",x);
					}
					else
					{
						double x1= (-b_1+Math.sqrt(delta))/(2*a_1);
						double x2= (-b_1-Math.sqrt(delta))/(2*a_1);
						System.out.printf("Phuong trinh da cho co 2 nghiem phan biet: \n x1= %.2f \n x2= %.2f",x1,x2);
					}
				}
				break;
			case 3:
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
				break;
			default:
				System.out.println("Giá trị không hợp lệ");
			}
		
			 System.exit(0);
		
		
	}

}
