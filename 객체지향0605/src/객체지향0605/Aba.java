package 객체지향0605;

import javax.swing.JFrame;

import MyPackage.Abb;

public class Aba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("홍길동");
		
		Abb obj = new Abb();
		System.out.print(obj.a);
		// System.out.print(obj.b);
		
		Abc obj1 = new Abc();
		System.out.print(obj1.a); // public 
		System.out.print(obj1.b); // default	같은 패키지 내애서는 보임. 
		// System.out.print(obj1.c); // private 	다른 클래스에서는 안보임.
		
		
		JFrame f = new JFrame("이대경#1");
		f.setSize(500, 400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}
