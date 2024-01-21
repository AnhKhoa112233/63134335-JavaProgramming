/**
 * 
 */
import java.util.Scanner;

/**
 * 
 */
public class Lab3_Bai4_63134335 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scanner = new Scanner(System.in);
		  System.out.print("Nhập số lượng sinh viên: ");
	        int n = scanner.nextInt();
	        //Khoi tao mang ho ten, diem, hoc luc
	        String[] HoTen = new String[n];
	        double[] diem= new double[n];
	        String[]HocLuc = new String[n];
	        //Nhap TT sinh vien
	        for(int i=0;i<n;i++)
	        {
	        	System.out.println("Nhap thong tin sinh vien thu"+(i+1)+":");
	        	System.out.print("Ho ten:");
	        	scanner.nextLine(); // Đọc bỏ dòng trống
	        	HoTen[i]=scanner.nextLine();
	        	System.out.print("Diem:");
	        	diem[i]=scanner.nextDouble();
	        	HocLuc[i]=XepLoai(diem[i]);
	        }
	        //Xuat tt sinh vien 
	        System.out.print("Danh sach sinh vien");
	        for(int i=0;i<n;i++)
	        {
	        	System.out.printf("\nHo ten:%s",HoTen[i]);
	        	System.out.printf("\nDiem:%.2f",diem[i]);
	        	System.out.printf("\nXep loai:%s",HocLuc[i]);
	        }
	        //goi Ham sap xep tang dan theo diem
	        SapXep(HoTen,diem,HocLuc);
	        //Xuat ds sau khi sap xep
	        System.out.print("\nDanh sach sinh vien sau khi sap xep");
	        for(int i=0;i<n;i++)
	        {
	        	System.out.printf("\nHo ten:%s",HoTen[i]);
	        	System.out.printf("\nDiem:%.2f",diem[i]);
	        	System.out.printf("\nXep loai:%s",HocLuc[i]);
	        }
	}
	//Ham Xep loai hoc luc
	private static String XepLoai(double diem) {
        if (diem < 5) {
            return "Yếu";
        } else if (diem < 6.5) {
            return "Trung bình";
        } else if (diem < 7.5) {
            return "Khá";
        } else if (diem < 9) {
            return "Giỏi";
        } else {
            return "Xuất sắc";
        }
    }
	//Ham sap xep theo diem
	private static void SapXep(String[] HoTen,double[] diem,String [] HocLuc) {
		//Goi n la do dai chuoi cua mang diem
		int n= diem.length;
		for(int i=0;i<n-1;i++)
			for(int j=i+1;j<n;j++)
			{
				if(diem[i]>diem[j])
				{
					//Hoan doi tt sinh vien
					String tempHoTen=HoTen[i];
						HoTen[i]=HoTen[j];
						HoTen[j]=tempHoTen;
					double tempdiem=diem[i];
					diem[i]=diem[j];
					diem[j]=tempdiem;
					String tempHocLuc= HocLuc[i];
						HocLuc[i]=HocLuc[j];
						HocLuc[j]=tempHocLuc;
				}
			}
	}
}
