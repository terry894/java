package day9;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyWinEx4 extends Frame implements WindowListener, ActionListener {
	Button btngugu;//has a 관계
    // extends Frame is a 관계
	MyWinEx4() {
		setLocation(150, 150);
		setSize(500, 300);
		setTitle("구구단");

		this.addWindowListener(this);//창을 클릭할때 감지 
		//컴포넌트 초기화
		btngugu = new Button("구구단 출력");
		setLayout(null);// 배치관리자를 사용하지 않게 설정
        //setLayout - 이걸로 레이아웃을 지정해 
		btngugu.setLocation(180, 150);
		//컴포넌트에 크기와 사이즈 지정 
		btngugu.setSize(150, 80);
		//컴포넌트에 부착
		add(btngugu);
	    //버튼에 리스너 추가 
        //Handler2 hd = new Handler2();//Handler 클래스로 구현하지 않고 
		btngugu.addActionListener(this);//ActionListener도 현재 클래스로 구현 

		setVisible(true);
	}

	public static void main(String[] args) {
		MyWinEx4 ex4 = new MyWinEx4();
	}

	@Override
	public void windowOpened(WindowEvent e) {
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("종료");
		// TODO Auto-generated method stub
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		// 다른 추가 창을 띄울때 종료된후에 작업할 부분을 여기 넣는다
	}

	@Override
	public void windowIconified(WindowEvent e) {}

	@Override
	public void windowDeiconified(WindowEvent e) {}

	@Override
	public void windowActivated(WindowEvent e) {}

	@Override
	public void windowDeactivated(WindowEvent e) {}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
			for (int i = 2; i < 10; i++) {
				System.out.println("3 *" + i + "=" + 3 * i);

			}

		}
		
	}


