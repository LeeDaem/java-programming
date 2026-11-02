package p260918이벤트04;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class AISoftware extends JFrame {
	JLabel label;
	int count;
	// 1 생성자
		public AISoftware() {
			
			setTitle("이벤트 리스너 익명클래스");
			setSize(400, 150);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
			// 3.1 레이아웃 설정 : FlowLayout
			FlowLayout layout = new FlowLayout();
			setLayout(layout);
			
			
			// 3.2 버튼 생성
			JButton button = new JButton("증가");
			
			// 3.3 레이블 생성
			label = new JLabel("현재의 카운터 값 0");
			// 5버튼에 리스터 연결
			button.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					count++;
					System.out.println("버튼 클릭" + count);
					label.setText("카운터" + count);
				}
			});
			
			add(label);
			add(button);
			
			setVisible(true);
			
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(() -> new AISoftware());
	}

}
