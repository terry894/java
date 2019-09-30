package day9;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyWinEx5 extends Frame implements WindowListener{
	//implements WindowListener 클래스내에서 자체적으로 규현하도록 하기위해 인스턴스 호출 
	MyWinEx5() {
		
		//핸들러 객체를 따로 생성하지말고 내 클래스에서 핸들러 객체의 역할을 할수있도록 구현 
	  
		this.addWindowListener(this);//this.찍으면 연관된 메서드 목록 뜸
		//this.addWindowListener(this): 클래스에서 자체적으로 구현한다 
		//this.addWindowListener(해당 인터페이스를 구현한 객체)
//		this.addActionListener();
		
		setSize(800, 600);
		setLocation(100, 100);
		setVisible(true);
	}

	public static void main(String[] args) {

		MyWinEx5 ex5 = new MyWinEx5();

	}

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("열었을때 호출");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("종료일때 호출");
		System.exit(0);
		//0은 정상종료 , 0이 아닌 다른 값: 비정상종료 
		// TODO Auto-generated method stub
	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("종료후에 호출");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
	System.out.println("아이콘화 일때 호출");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("아이콘에서 돌아올때 호출");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("활성화 일때 호출");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("비활성화 일때 호출");
		// TODO Auto-generated method stub
		
	}

}
