/**

 */
 import java.util.Scanner;
/**
 * 
 */
public class Lab3_Bai1_63134335 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		int n;
		boolean ok=true;
		//Nhap so nguyen tu ban phim 
		do {
			System.out.print("Nhap so nguyen (n>0):");
			 n=scanner.nextInt();		
			}while(n<0);
		//Ham kiem tra SNT
		for(int i=2;i<n;i++)
		{
			if(n%i==0) {
				ok=false;
				break;
			}
			i++;
		}
		if(ok==false) {
			System.out.print("So nhap vao khong phai la SNT");
		}
		else
			System.out.print("So nhap vao la SNT");
	}

}
