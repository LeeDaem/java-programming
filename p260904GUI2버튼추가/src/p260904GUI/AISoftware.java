package p260904GUI;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class AISoftware extends JFrame{
	final int WIDTH = 300;
	final int HEIGHT = 200;
	
	// 기본생성자
	public AISoftware() {
		this.setTitle("이대경");
		setSize(WIDTH, HEIGHT);
		// 종료처리 매소드 활용
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 배치관리자를 설정
		this.setLayout(new FlowLayout());
		
		// JFrame 컨테이너의 배경색을 노랑으로 변경
//		Container container = this.getContentPane();
//		container.setBackground(Color.yellow);
		// 한줄요약
		this.getContentPane().setBackground(Color.blue);
		
		// 버튼 추가
		JButton button = new JButton("확인");
		this.add(button);
		button = new JButton("취소");
		this.add(button);
			
		
	
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(()-> new AISoftware());
	}

}
