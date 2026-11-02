package p260918이벤트06;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class AISoftware extends JFrame {
	private JPanel panel;
	private JButton yellowBtn;
	private JButton pinkBtn;

	public AISoftware() {
		setTitle("이벤트 예제");
		setSize(350, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 패널 생성 및 배치 관리자 설정
		panel = new JPanel();
		panel.setLayout(new FlowLayout());

		// 버튼 생성
		yellowBtn = new JButton("노란색");
		pinkBtn = new JButton("핑크색");

		// 단 하나의 이벤트 리스너 생성
		MyColorListener listener = new MyColorListener();

		// 두 버튼에 동일한 이벤트 리스너 등록
		yellowBtn.addActionListener(listener);
		pinkBtn.addActionListener(listener);

		// 패널에 버튼 추가
		panel.add(yellowBtn);
		panel.add(pinkBtn);

		// 프레임에 패널 추가
		add(panel);

		setVisible(true);
	}

	// 배경색을 변경하는 이벤트 리스너 (내부 클래스)
	class MyColorListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// e.getSource()를 이용해 어떤 버튼이 눌렸는지 구별
			Object source = e.getSource();

			if (source == yellowBtn) {
				panel.setBackground(Color.YELLOW);
			} else if (source == pinkBtn) {
				panel.setBackground(Color.PINK);
			}
		}
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> new AISoftware());
	}
}