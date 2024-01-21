/**
 * 
 */
import java.util.Scanner;
/**
 * 
 */
public class Lab3_Bai2_63134335 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		//Su dung 2 vong lap de xuat bcc tu 1 den 9
		for(int i=1;i<10;i++)		
			for(int j=1;j<11;j++)
			{
				System.out.printf("%d x %d = %d", i,j,i*j);
				System.out.println("");
			}
	}

}
