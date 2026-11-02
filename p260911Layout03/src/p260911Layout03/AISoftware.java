package p260911Layout03;

import javax.swing.*;
import java.awt.*;
public class AISoftware extends JFrame {
	JButton b1, b2, b3;
	Container cPane;
	CardLayout layoutm;
	public AISoftware() {
		setTitle("CardLayoutTest");
		setSize(300, 150);
		layoutm = new CardLayout();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ContentPane 가져오기
		cPane = getContentPane();
		cPane.setLayout(layoutm);
		
		b1 = new JButton("Card #1");
		b2 = new JButton("Card #2");
		b3 = new JButton("Card #3");
		cPane.add(b1);
		cPane.add(b2);
		cPane.add(b3);
		// 버튼 액션 설정
		b1.addActionListener(e -> layoutm.next(cPane));
		b2.addActionListener(e -> layoutm.next(cPane));
		b3.addActionListener(e -> layoutm.next(cPane));
		setVisible(true);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> new AISoftware());
	}

}
