import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class LoginFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt_TenDangNhap;
	private JTextField txt_MatKhau;

	public LoginFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 726, 465);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TÊN ĐĂNG NHẬP:");
		lblNewLabel.setBounds(34, 65, 169, 50);
		
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		contentPane.add(lblNewLabel);
		
		txt_TenDangNhap = new JTextField();
		txt_TenDangNhap.setBounds(191, 73, 340, 37);
		contentPane.add(txt_TenDangNhap);
		txt_TenDangNhap.setColumns(10);
		
		JLabel lblMtKhu = new JLabel("MẬT KHẨU:");
		lblMtKhu.setBounds(34, 160, 169, 50);
		lblMtKhu.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		contentPane.add(lblMtKhu);
		
		txt_MatKhau = new JTextField();
		txt_MatKhau.setBounds(191, 160, 340, 37);
		txt_MatKhau.setColumns(10);
		contentPane.add(txt_MatKhau);
		
		JButton btn_DangNhap = new JButton("ĐĂNG NHẬP");
		btn_DangNhap.setBounds(241, 271, 192, 66);
		btn_DangNhap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XuLiDangNhap();
			}
		});
		btn_DangNhap.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		contentPane.add(btn_DangNhap);
	}
	void XuLiDangNhap() {
		//Lay ten DN va mat khau
		String strten=txt_TenDangNhap.getText();
		String strMatKhau=txt_MatKhau.getText();
		//Xu li
		if(strten.equals("63CNTT")&& strMatKhau.equals("123")) {
			//Hien trang chu
			HomePage homePage= new HomePage();
			homePage.setVisible(true);
			//an form dang nhap
			this.setVisible(false);
		}
		else {
			//Bao loi
			//Xoa du lieu nhap
			txt_TenDangNhap.setText("");
			txt_MatKhau.setText("");
			//Hien thong bao
			JOptionPane hopThoai = new JOptionPane();
			hopThoai.showMessageDialog(this,"Đăng nhập thất bại" );
			
		}
	}
}
