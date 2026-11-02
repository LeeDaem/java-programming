package p260911Layout04;

import javax.swing.*;
import java.awt.*;
public class AISoftware extends JFrame {
	public AISoftware() {
		setTitle("Piano Key Layout");
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null); // 절대 위치 사용
		
		JButton[] whiteKeys = new JButton[7];
		JButton[] blackKeys = new JButton[6];
		
		for (int i = 0; i < whiteKeys.length; i++) {
			whiteKeys[i] = new JButton();
			whiteKeys[i].setBackground(Color.WHITE);
			whiteKeys[i].setBounds(i * (50 + 10), 50, 50, 150);
			add(whiteKeys[i]);
		}
		
		for (int i =0; i < blackKeys.length; i++) {
			blackKeys[i] = new JButton();
			blackKeys[i].setBackground(Color.black);
//			int blackKeyX = (i * (50 + 10)) + (3 * 50 / 4);
			int blackkeyX = ((i + 1) * 60 - 20);
			blackKeys[i].setBounds(blackkeyX, 50, 30, 100);
			add(blackKeys[i]);
			
		}
		
		
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> new AISoftware());
		}

}