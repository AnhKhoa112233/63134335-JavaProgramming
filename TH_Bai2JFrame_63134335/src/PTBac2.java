import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class PTBac2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt_soA;
	private JTextField txt_soB;
	private JTextField txt_soC;
	private JTextField txt_KQ;

	public PTBac2() {
		setTitle("CHƯƠNG TRÌNH GIẢI PHƯƠNG TRÌNH BẬC 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 718, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập số a:");
		lblNewLabel.setBounds(27, 58, 102, 47);
		
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		contentPane.add(lblNewLabel);
		
		txt_soA = new JTextField();
		txt_soA.setBounds(127, 66, 125, 35);
		contentPane.add(txt_soA);
		txt_soA.setColumns(10);
		
		JLabel lblNhpSB = new JLabel("Nhập số b:");
		lblNhpSB.setBounds(323, 58, 102, 47);
		
		lblNhpSB.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		contentPane.add(lblNhpSB);
		
		JLabel lblNhpSC = new JLabel("Nhập số c:");
		lblNhpSC.setBounds(189, 142, 102, 47);
		
		
		lblNhpSC.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		contentPane.add(lblNhpSC);
		
		txt_soB = new JTextField();
		txt_soB.setBounds(440, 66, 125, 35);
		txt_soB.setColumns(10);
		contentPane.add(txt_soB);
		
		txt_soC = new JTextField();
		txt_soC.setBounds(290, 150, 125, 35);
		txt_soC.setColumns(10);
		contentPane.add(txt_soC);
		
		JLabel lblKtQu = new JLabel("Kết quả:");
		lblKtQu.setBounds(57, 353, 102, 47);
		
		lblKtQu.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		contentPane.add(lblKtQu);
		
		txt_KQ = new JTextField();
		txt_KQ.setBounds(169, 342, 444, 73);
		txt_KQ.setColumns(10);
		contentPane.add(txt_KQ);
		
		JButton btn_Tinh = new JButton("TÍNH TOÁN");
		btn_Tinh.setBounds(282, 250, 133, 52);
		btn_Tinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamTinhToan();
			}
		});
		btn_Tinh.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		contentPane.add(btn_Tinh);
	}
	void HamTinhToan() {
	    // Lấy dữ liệu từ điều khiển
	    String str_soA = txt_soA.getText();
	    String str_soB = txt_soB.getText();
	    String str_soC = txt_soC.getText();
	    
	    // Chuyển kiểu
	    double soA = Double.parseDouble(str_soA);
	    double soB = Double.parseDouble(str_soB);
	    double soC = Double.parseDouble(str_soC);
	    
	    // Kiểm tra nếu số A bằng 0
	    if (soA == 0) {
	        if (soB == 0) {
	            if (soC == 0) {
	                txt_KQ.setText("Phương trình có vô số nghiệm.");
	            } else {
	                txt_KQ.setText("Phương trình vô nghiệm.");
	            }
	        } else {
	            double x = -soC / soB;
	            txt_KQ.setText("Phương trình có một nghiệm: x = " + x);
	        }
	    } else {
	        // Tính toán nghiệm cho phương trình bậc 2
	        double delta = soB * soB - 4 * soA * soC;
	        double x1, x2;
	        
	        if (delta > 0) {
	            x1 = (-soB + Math.sqrt(delta)) / (2 * soA);
	            x2 = (-soB - Math.sqrt(delta)) / (2 * soA);
	            txt_KQ.setText("Phương trình có 2 nghiệm: x1 = " + x1 + ", x2 = " + x2);
	        } else if (delta == 0) {
	            x1 = -soB / (2 * soA);
	            txt_KQ.setText("Phương trình có nghiệm kép: x = " + x1);
	        } else {
	            txt_KQ.setText("Phương trình vô nghiệm");
	        }
	    }
	}
}
