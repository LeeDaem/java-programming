package p260904GUI3Panel;
import java.awt.*;
import java.util.Random;

import javax.swing.*;

import p260904GUI3Panel.AISoftware;


public class AISoftware extends JFrame{
	
	public AISoftware () {
		//프레임 기본설정
		setTitle("FlowLayoutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(320, 180);
		FlowLayout layout = new FlowLayout(FlowLayout.LEFT, 10, 15);
		this.setLayout(layout);
		
		for(int i = 0; i < 500; i++) {
			JButton button = new JButton("버튼" + i);
			button.setBackground(Color.yellow);
			
			Random random = new Random();
			Color randomColor = new Color (random.nextInt(256), random.nextInt(256), random.nextInt(256));
			button.setBackground(randomColor);
			
			add(button);
		}
		
		setVisible(true);
	}
	
	



	public static void main(String[] args) {
		SwingUtilities.invokeLater(()-> new AISoftware());		
		
	}

}
