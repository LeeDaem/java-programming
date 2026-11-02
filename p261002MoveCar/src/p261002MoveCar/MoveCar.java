package p261002MoveCar;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class MoveCar extends JFrame {
	int img_x = 150;
	int img_y = 150;
	JButton button;
	
	MoveCar() {
		setTitle("Move Car");
		setSize(600, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		button = new JButton("");
		
		// 클래스 패스 기준으로 이미지 파일 로드 (src 폴더 내부 또는 패키지 폴더 안)
		URL imgURL = getClass().getResource("Car.png");
		if (imgURL != null) {
			button.setIcon(new ImageIcon(imgURL));
		} else {
			// 프로젝트 루트 폴더에 있을 경우 대비
			button.setIcon(new ImageIcon("Car.png"));
		}
		
		button.setLocation(img_x, img_y);
		button.setSize(200, 100);
		panel.add(button);
		
		add(panel);
		
		setVisible(true); // 프레임을 먼저 화면에 표시
		
		panel.setFocusable(true);
		panel.requestFocus(); // 화면이 그려진 후 포커스 요청
		panel.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent e) {
			int keycode = e.getKeyCode();
			switch (keycode) {
			case KeyEvent.VK_UP: img_y -= 10; break;
			case KeyEvent.VK_DOWN: img_y += 10;break;
			case KeyEvent.VK_LEFT: img_x -= 10; break;
			case KeyEvent.VK_RIGHT: img_x += 10;break;
			}
			button.setLocation(img_x, img_y);
			}
			public void keyReleased(KeyEvent arg0) { }
			public void keyTyped(KeyEvent arg0) { }
			});
		add(panel);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> new MoveCar());
	}
	
	
	//2. 내부클래스
	class MyLitener implements KeyListener {

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			int keycode = e.getKeyCode();
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
}