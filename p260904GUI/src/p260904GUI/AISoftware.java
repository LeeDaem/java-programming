package p260904GUI;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class AISoftware extends JFrame{
	final int WIDTH = 300;
	final int HEIGHT = 200;
	
	// 기본생성자
	public AISoftware() {
		this.setTitle("이대경");
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(()-> new AISoftware());
	}

}
