package p2609044GUILabel;

import java.awt.*;
import javax.swing.*;


public class AISoftware extends JFrame{
	private JPanel panel;
	private JLabel label1, label2;
	
	public AISoftware() {
		setTitle("레이블 테스트");
		setSize(400, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		ImageIcon image = new ImageIcon("C:\\java.png");
		label1 = new JLabel("2301073");
		label1.setIcon(image);
		label1.setForeground(Color.blue);
		label1.setFont(new Font("Airal", Font.ITALIC, 30));
		panel1.setBackground(Color.yellow);
		
		label2 = new JLabel("이대경");
		label2.setFont(new Font("맑은 고딕", Font.ITALIC, 50));
		label2.setForeground(Color.yellow);
		panel2.setBackground(Color.blue);
		
		panel1.add(label1);
		panel2.add(label2);
		panel.add(panel1);
		panel.add(panel2);
		
		add(panel);
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(()-> new AISoftware());	

	}

}
