package day10;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MovingButtonWin extends Frame implements MouseMotionListener {
    Button btnYes,btnNo;
	Label lb;
	
	MovingButtonWin() {
        //this.btnYes = new Button("YES"); 생성자는 멤버들을 초기화 시켜줘야하기 때문에 
		//btnYes = new Button("YES"); 로 해야 초기화
		//Button btnYes = new Button("YES"); 은 지역변수 btnYes가 되버리기때문에 생성자 벗어나면 null -> nullpointexception 발생
	    lb= new Label("당신은 잘생겼다고 생각하십니까?");
		btnYes = new Button("YES");
		btnNo = new Button("NO");
		setLayout(null);
		
	    lb.setBounds(100, 50, 300, 60);
	    lb.setBackground(Color.red);
	    
	    btnYes.setBounds(100,350,100,100);		
	    btnNo.setBounds(300,350,100,100);		
        add(btnYes);
        add(btnNo);
        add(lb);
        
        addMouseMotionListener(this); // 마우스 움직임 감지기
        
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("종료합니다");
			    System.exit(0);
			}
		});
//	   addWindowListener(this); //내 클래스에 창 인터페이스 활성화
		setBounds(100, 100, 800, 600); // setBounds(x,y,width,height)
		setVisible(true); // 창 눈에 보이도록 설정
	}

	public static void main(String[] args) {
		MovingButtonWin sp = new MovingButtonWin(); // 객체생성을 통해 생성자를 호출함으로써 Window창 띄움
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) { //마우스가 움직일때 마다 호출되는 메서드
		// TODO Auto-generated method stub
		int x = e.getX();
		int y = e.getY();
		//System.out.println("마우스 위치:("+x+","+y+")");
		int bx = btnYes.getX();
		int by = btnYes.getY();
		//System.out.println("버튼 위치:("+bx+","+by+")");
		double d = 
		Math.sqrt((bx-x)*(bx-x) + (by-y)*(by-y));//Math.sqrt는 double형 반환  
		System.out.println("버튼과 마우스의 거리 :" + d);
		if(d<120) {
			btnYes.setLocation((int)Math.random()*600,(int)Math.random()*400);
		}
	}
}
