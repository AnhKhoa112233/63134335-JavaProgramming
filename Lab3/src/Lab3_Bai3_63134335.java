/**
 * 
 */
import java.util.Arrays;
import java.util.Scanner;
/**
 * 
 */
public class Lab3_Bai3_63134335 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ham nhap mang 
		int []arr =NhapMang();
		//Ham xep va xuat Mang
		XepXuat(arr);
		//Ham xuat phan tu nho nhat cua mang
		MinMang(arr);
		//Ham tong tb cong cac so chia het cho 3
		TongTBChia3 (arr);
	}
	// Ham nhap mang
	private static int [] NhapMang()
	{
		Scanner scanner=new Scanner(System.in);
		int a[],n;
		//Nhap mang
		System.out.print("Nhap vao so phan tu cua mang: ");
		n=scanner.nextInt();
		//Tao so pt theo n
		int [] arr= new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.printf("Nhap a[%d]:", i);
			arr[i]=scanner.nextInt();
		}
		return arr;
	}
	//Ham sep va xuat mang
	private static void XepXuat(int [] arr) {
		Arrays.sort(arr);
		System.out.println("Mang sau khi sap xep: "+Arrays.toString(arr));
	}
	//Ham gtnn cua mang
	private static void MinMang(int [] arr) {
		int min =arr[0];
		for(int i=0 ;i<arr.length;i++)
		{
			if(arr[i]<min)	min=arr[i];
		}
		   System.out.println("Phần tử có giá trị nhỏ nhất: " + min);
	}
	private static void TongTBChia3(int [] arr) {
		int sum=0;
		int count =0;
		for (int value : arr)
		{
			if(value %3 ==0)
			{
				sum+=value;
				count ++;
			}
		}
		if(count >0) {
			double TB =(double )sum/count;
			 System.out.println("Trung bình cộng các phần tử chia hết cho 3: " + TB);
        } else {
            System.out.println("Không có phần tử nào chia hết cho 3 trong mảng.");
        
		}
	}
}
