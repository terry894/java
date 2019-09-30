package day10;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//class Test extends WindowAdapter {
//	@Override
//	public void windowClosing(WindowEvent e) {
//		System.out.println("종료합니다");
//		System.exit(0);
//	}
//}

public class MyWin extends Frame {
	MyWin() {

//		WindowAdapter wa = new Test(); //
//		WindowAdapter wa = new WindowAdapter() {// 한번만 쓰고 버릴때 익명 이너클래스를 생성 
//			@Override
//			public void windowClosing(WindowEvent e) {
//				System.out.println("종료합니다");
//				System.exit(0);
//			}
//		};// new WindowAdapter(){}; - 익명 이너 클래스 
		
		// WindowAdapter wa = 윈도우어뎁터를 구현한 클래스
//		addWindowListener(wa); // 내 클래스에 창 인터페이스 활성화 ()안엔 Winow메서들 구현한 객체가 들어가야한다
//WindowAdapter란 추상클래스에는 WindowListener에 들어갈 메서드가 들어가있기 때문에 window메서들을 구현했다고 볼수잇고 ()안에 객체를 넣을수있다 
//WindowAdapter는 스스로를 인스턴스화 할수없기때문에 
//WindowAdapter를 상속하고잇는 test클래스를 구현해서 인스턴스화 하여 addWinowListener에다가 넣는다
		
		addWindowListener(new WindowAdapter(){
			//addWindowListener(wa) wa 처럼 객체를 쓰지 않고 안에 잇는 메서드를 직접넣어서 구현 
			//대신 이너 클래스 기능을 제일간단하게 구현한것 
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("종료합니다");
				System.exit(0);
			}
		});
		setBounds(100, 100, 600, 400); // setBounds(x,y,width,height)
		setVisible(true); // 창 눈에 보이도록 설정
	}

	public static void main(String[] args) {
		MyWin sp = new MyWin(); // 객체생성을 통해 생성자를 호출함으로써 Window창 띄움
	}
}
