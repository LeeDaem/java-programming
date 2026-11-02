package p260904GUI3Panel;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class AISoftware extends JFrame{
	final int WIDTH = 300;
	final int HEIGHT = 200;
	//1. 생성자
	public AISoftware() {
		//2. Frame 사이즈 300, 200
		this.setTitle("이대경");
		setSize(WIDTH, HEIGHT);
		//3. 종료 처리 메소드 활용
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//4. 배치관리자를 설정
		this.setLayout(new FlowLayout());
		//4.1 배경 색 변경
		getContentPane().setBackground(Color.green);
		//5. JPanel 객체 생성
		JPanel panel = new JPanel();
		JPanel panel2 = new JPanel();
		//6. 버튼 1 객체 생성
		JButton button1 = new JButton("버튼 1");
		//7. 버튼 2 객체 생성
		JButton button2 = new JButton("버튼 2");
		JButton button3 = new JButton("버튼 3");
		JButton button4 = new JButton("버튼 4");
		//8. 프레임에 패널 객체 추가
		this.add(panel);
		this.add(panel2);
		//9. 패널에 버튼 객체들 추가
		panel.add(button1);
		panel.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		//9.1 패널의 배경색을 변경
		panel.setBackground(Color.yellow);
		panel2.setBackground(Color.blue);
		//10. 프레임 보이게 하기
		this.setVisible(true);
	}
	
	



	public static void main(String[] args) {
		SwingUtilities.invokeLater(()-> new AISoftware());
		
	}

}
