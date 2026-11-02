package p260911Layout02;

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
		
		// 5개 JButton 객체를 저장하는 배열을 생성하여 동서남북, 중앙의 이름을 갖는 JButton객체를 만드시오
		String[] text = {"동", "서", "남", "북", "중앙1", "중앙2"};
		String[] locations = {BorderLayout.EAST, BorderLayout.WEST,
				BorderLayout.SOUTH, BorderLayout.NORTH
				
		};
		// 5개의 JButton 객체를 저장할 배열생성
		JButton[] buttons = new JButton[6];
		
		for(int i = 0; i < 4; i++) {
			buttons[i] = new JButton(text[i]);
			add(buttons[i], locations[i]);
		}
		buttons[4] = new JButton(text[4]);
		buttons[5] = new JButton(text[5]);
		JPanel centerPanel = new JPanel();
		GridLayout gridLayout = new GridLayout(1, 2, 10, 10);
		centerPanel.setLayout(gridLayout);
		centerPanel.add(buttons[4]);
		centerPanel.add(buttons[5]);
		add(centerPanel, BorderLayout.CENTER);
		
		
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(() -> new AISoftware());
	}

}
