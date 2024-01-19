import java.util.Scanner;

public class Lab1Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scanner = new Scanner(System.in);

	        // Nhập tên 
	        System.out.print("Họ và tên: ");
	        String hoTen = scanner.nextLine();

	        // Nhập điểm TB
	        System.out.print("Điểm TB : ");
	        double diemTB = scanner.nextDouble();

	        // Đóng Scanner sau khi sử dụng
	        scanner.close();

	        // Hiển thị thông tin sinh viên
	        System.out.printf("%s %.2f diem",hoTen,diemTB);
		}
	

}
