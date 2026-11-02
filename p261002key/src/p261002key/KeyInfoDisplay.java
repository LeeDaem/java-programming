package p261002key;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

class MyListener implements KeyListener {
	JLabel mlabel;
	public MyListener(JLabel mlabel) {
		this.mlabel = mlabel;
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getKeyChar());
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		String keyName = KeyEvent.getKeyText(e.getKeyCode());
		int keyCode = e.getKeyCode();
		char keyChar = e.getKeyChar();
		boolean isActionkey = e.isActionKey();
		
		// 정보 출력
		String info = String.format("<html>키 정보:<br>" + "Key Name: %s<br>" + 
									"KeyCode: %d<br>" + "Key Char: %c<br>" + 
									"Is Action Key: %b<br></html>", keyName, 
									keyCode, keyChar, isActionkey);
		mlabel.setText(info);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("keyReleased 콜백함수 호출");
	}
	
}

public class KeyInfoDisplay extends JFrame {
	JLabel label;
	
	// 생성자
	public KeyInfoDisplay () {
		// Frame 설정
		setTitle("키 정보 보여주기");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);		// 절대 위치
		label = new JLabel("<html>키를 누르면 정보가 출력됩니다.<br><br></html>",
				SwingConstants.CENTER);
		label.setBounds(10, 10, 260, 150);		// 절대 위치와 크기 설정
		add(label);
		
		addKeyListener(new MyListener(label));
		
		
		setVisible(true);
		setFocusable(true);	// 포커스 가능하게 설정
		requestFocus();		// 포커스를 가진다
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(()-> new KeyInfoDisplay());
	}

}
