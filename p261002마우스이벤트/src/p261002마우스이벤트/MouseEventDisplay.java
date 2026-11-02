package p261002마우스이벤트;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class MouseEventDisplay extends JFrame {
	JLabel infoLabel;
	JPanel panel;
	public MouseEventDisplay() {
		setTitle("Mouse Event Display");
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		// 라벨
		infoLabel = new JLabel("Mouse Event Display", SwingConstants.CENTER);
		Font font = new Font("Arial", Font.PLAIN, 18);
		infoLabel.setFont(font);
		add(infoLabel, BorderLayout.NORTH);
		
		// 패널
		panel = new JPanel();
		panel.setBackground(Color.yellow);
		add(panel, BorderLayout.CENTER);
		
		
		// 리스너 등록
		MyListener1 myListener1 = new MyListener1();
		panel.addMouseListener(myListener1);
		
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(()-> new MouseEventDisplay());
	}
	
	class MyListener1 implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			int x; int y;
			x = e.getX();
			y = e.getY();
			infoLabel.setText("Mouse Clicked at (" + x + ", " + y + ")");
			
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			panel.setBackground(getForeground());
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			panel.setBackground(Color.green);
			
		}
		
	}
}
