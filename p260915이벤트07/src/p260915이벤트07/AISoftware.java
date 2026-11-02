package p260915이벤트07;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class AISoftware extends JFrame {
	private JTextField txtField;
	private JButton[] buttons = new JButton[9];

	public AISoftware() {
		setTitle("키패드 예제");
		setSize(350, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());

		// 상단 입력창 (JTextField)
		txtField = new JTextField();
		txtField.setEditable(false); // 키보드 직접 입력 방지 (버튼으로만 입력)
		add(txtField, BorderLayout.NORTH);

		// 중앙 키패드 패널 (3x3 Grid)
		JPanel keyPanel = new JPanel();
		keyPanel.setLayout(new GridLayout(3, 3));

		// 공통 이벤트 리스너
		MyKeyListener listener = new MyKeyListener();

		// 1~9까지 버튼 생성 및 패널 추가
		for (int i = 0; i < 9; i++) {
			buttons[i] = new JButton(String.valueOf(i + 1));
			buttons[i].addActionListener(listener);
			keyPanel.add(buttons[i]);
		}

		add(keyPanel, BorderLayout.CENTER);

		setVisible(true);
	}

	// 키패드 버튼 클릭 이벤트 리스너
	class MyKeyListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// e.getActionCommand()로 눌린 버튼의 텍스트("1", "2" 등)를 가져옴
			String actionCommand = e.getActionCommand();
			
			// 기존 텍스트 뒤에 눌린 숫자 텍스트를 이어 붙임
			txtField.setText(txtField.getText() + actionCommand);
		}
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> new AISoftware());
	}
}