package day10;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ButtonByKey extends Frame implements KeyListener{
	Button ctlBtn;
	
	ButtonByKey() {
		
		ctlBtn = new Button("^^");
		setLayout(null);
		ctlBtn.setBounds(150,250,50,50);
		add(ctlBtn);
		//처음부터 버튼에 포커스가 되어있다
		ctlBtn.addKeyListener(this);
		
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("종료합니다");
			    System.exit(0);
			}
		});
//	   addWindowListener(this); //내 클래스에 창 인터페이스 활성화
		setBounds(50, 50, 1200, 1000); // setBounds(x,y,width,height)
		setVisible(true); // 창 눈에 보이도록 설정

	}

	public static void main(String[] args) {
		ButtonByKey sp = new ButtonByKey(); // 객체생성을 통해 생성자를 호출함으로써 Window창 띄움
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {//키보드를 누르고 잇을때
		int key = e.getKeyCode();
		System.out.println(key);
		//버큰의 위치 
		int x = ctlBtn.getX();
		int y = ctlBtn.getY();
		if(key == 39) {
			ctlBtn.setLocation(x+3,y);//->방향 눌르면 이동 
		}
		else if(key == 38)
		{
			ctlBtn.setLocation(x,y-3);//->방향 눌르면 이동 
		}
		else if(key == 40)
		{
			ctlBtn.setLocation(x,y+3);//->방향 눌르면 이동 
		}		
		else if(key == 37)
		{
			ctlBtn.setLocation(x-3,y);//->방향 눌르면 이동 
		}
		else if(key == 32)
		{
			ctlBtn.setLocation(x,y-20);//->방향 눌르면 이동 
			ctlBtn.setLocation(x,y+20);//->방향 눌르면 이동 
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {//키보드를 눌렀다 땔때
		// TODO Auto-generated method stub
		
	}
}
