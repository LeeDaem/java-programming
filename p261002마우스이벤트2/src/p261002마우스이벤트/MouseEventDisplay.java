package p261002마우스이벤트;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class MouseEventDisplay extends JFrame {
	// 1. 무지개 색상 배열 정의
	private final Color[] colors = {
		Color.RED,                        // 빨
		Color.ORANGE,                     // 주
		Color.YELLOW,                     // 노
		Color.GREEN,                      // 초
		Color.BLUE,                       // 파
		new Color(0, 0, 128),             // 남 (Navy/Indigo)
		new Color(128, 0, 128)            // 보 (Purple)
	};
	
	// 2. 현재 색상 위치를 기억할 인덱스 변수
	private int colorIndex = 0;
	
	public MouseEventDisplay() {
		setTitle("클릭으로 색깔 바꾸기 (빨주노초파남보)");
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 멤버 변수로 선언하지 않고 지역 변수 panel을 사용할 때
		// 익명 클래스 내부 참조를 위해 final로 지정해주면 좋습니다.
		final JPanel panel = new JPanel();
		
		// 초기 배경색 지정 (첫 번째 색상: 빨강)
		panel.setBackground(colors[colorIndex]);
		
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// 다음 색상 인덱스로 이동 (6 다음에 클릭하면 다시 0으로 순환)
				colorIndex = (colorIndex + 1) % colors.length;
				
				// 패널 배경색 변경
				panel.setBackground(colors[colorIndex]);
			}
		});
		
		add(panel);
		setVisible(true); 
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> new MouseEventDisplay());
	}
}
