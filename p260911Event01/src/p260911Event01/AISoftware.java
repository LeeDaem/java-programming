package p260911Event01;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyListener implements ActionListener {
	int count = 0;
	@Override
	public void actionPerformed(ActionEvent e) {
		count++;
		System.out.println("버튼 누름" + count);
		
	}
	
}

public class AISoftware extends JFrame {
	public AISoftware() {
		setTitle("버튼 이벤트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		
		JButton button = new JButton("클릭하세요");
		// 이벤트 리스너 객체 생성
		MyListener myListener = new MyListener();
		// 리스너 객체를 이벤트 객체에 연결
		button.addActionListener(myListener);
		
		
		
		add(button);
		setVisible(true);
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> new AISoftware());
	}
}
