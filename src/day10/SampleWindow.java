package day10;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class SampleWindow extends Frame {
	SampleWindow() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("종료합니다");
			    System.exit(0);
			}
		});
//	   addWindowListener(this); //내 클래스에 창 인터페이스 활성화
		setBounds(100, 100, 600, 400); // setBounds(x,y,width,height)
		setVisible(true); // 창 눈에 보이도록 설정

	}

	public static void main(String[] args) {
		SampleWindow sp = new SampleWindow(); // 객체생성을 통해 생성자를 호출함으로써 Window창 띄움
	}
}
