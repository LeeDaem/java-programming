package p260918이벤트02;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class AISoftware extends JFrame{
	JLabel label;
	
	
	// 4. 내부 클래스 정의
	class MyListener implements ActionListener {
		int count = 0;
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			count++;
			System.out.println("버튼 클릭" + count);
			label.setText("현재의 카운터 값" + count);
		}
		
	}
	
	// 3. 생성자
	public AISoftware() {
		setTitle("이벤트 리스너 외부클래스");
		setSize(400, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		// 3.1 레이아웃 설정 : FlowLayout
		FlowLayout layout = new FlowLayout();
		setLayout(layout);
		
		
		// 3.2 버튼 생성
		JButton button = new JButton("증가");
		
		// 3.3 레이블 생성
		label = new JLabel("현재의 카운터 값 0");
		
		// 5 버튼에 리스너 객체 연결
		button.addActionListener(new MyListener());
		
		add(label);
		add(button);
		
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> new AISoftware());
	}
}