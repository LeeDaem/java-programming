package p260911Layout01;

import java.awt.*;
import javax.swing.*;

public class AISoftware extends JFrame {
	
	public AISoftware() {
		setTitle("BorderLayoutTest");
		setSize(300, 150);
		// BorderLayout 객체 생성
		BorderLayout layout = new BorderLayout(10, 10);
		// JFrame에 Layout 설정
		setLayout(layout);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		JButton button = new JButton("북쪽");
		// 5개 JButton 객체를 저장하는 배열을 생성하여 동서남북, 중앙의 이름을 갖는 JButton객체를 만드시오
		String[] text = {"동", "서", "남", "북", "중앙"};
		String[] locations = {BorderLayout.EAST, BorderLayout.WEST,
				BorderLayout.SOUTH, BorderLayout.NORTH, BorderLayout.CENTER
		};
		// 5개의 JButton 객체를 저장할 배열생성
		JButton[] buttons = new JButton[5];
		
		for(int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(text[i]);
			add(buttons[i], locations[i]);
		}
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(() -> new AISoftware());
	}

}
