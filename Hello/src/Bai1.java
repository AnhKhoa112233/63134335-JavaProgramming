/**
 * 
 */
import java.util.Scanner;

/**
 * 
 */
public class Bai1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // Sử dụng Scanner để đọc dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Nhập tên sinh viên
        System.out.print("Họ và tên: ");
        String tenSinhVien = scanner.nextLine();

        // Nhập điểm ngôn ngữ
        System.out.print("Nhập điểm : ");
        double diemNgonNgu = scanner.nextDouble();

        // Đóng Scanner sau khi sử dụng
        scanner.close();

        // Hiển thị thông tin sinh viên
        System.out.println("\nThông tin sinh viên:");
        System.out.println("Tên: " + tenSinhVien);
        System.out.println("Điểm ngôn ngữ: " + diemNgonNgu);
	}

}
