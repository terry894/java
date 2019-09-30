package day9;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
//일반적으로 하나의 파일에 public 클래스 하나 와도 되지만
//public class가 아니라면 여러개 정의 할 수도 있다. 
import java.awt.event.ActionListener;

public class MyWinEx3 extends Frame {
        Button btnRed, btnBlue;
	
        //인터페이스는 항상 상수와 추상 메서드 
        //매서드 바디가 없는 그냥 메서드 
        //
	MyWinEx3(){
		super("신호등버튼");//부모의 매개변수 생성자가 타이틀로 만들어주는 역할을 함 
		setSize(300,300);
		setLocation(100,100);
//		setTitle("신호등 버튼");
		
		//컴포넌트 초기화
		btnRed = new Button("빨강");
		btnBlue = new Button("파랑");
		
		//btnRed.addActionListener(인터페이스를 구현한객체 );
		Handler hd = new Handler();
		
		btnBlue.addActionListener(hd);
		btnRed.addActionListener(hd);
		//액션을 감지하는 버튼을 추가
		//배치관리자를 사용하지 않고 커스텀하게 지정
		setLayout(null);
		
		//모든 컴포넌트는 크기와 위치를 직접 지정해야 한다.
		btnRed.setSize(80,80);
		btnRed.setLocation(30,200);
		
		btnBlue.setSize(80,80);
		btnBlue.setLocation(180,200);
		
		//컴포넌트 배경색 
		//red,blue 소문자 상수 
//		Color c = new Color(255,0,0);
		btnRed.setBackground(Color.red);
	    btnBlue.setBackground(Color.blue);
//	    btnBlue.setBackground(c);
		
		add(btnRed);
		add(btnBlue);
		
		//기본배치 관리자: BorderLayout
		//컴포넌츠에 담기 
//		add(btnwest,"West");//(변수,위치)
//		add(btneast,"East");
		//android activity와 비슷함 
		setVisible(true);
		
		//event 처리
		//1. event source 결정
		//2. event source listener 부착
		//3. event handler 정의 
	}
	
	public static void main(String[] args) {
		MyWinEx3 mw3 = new MyWinEx3();
	}
	class Handler implements ActionListener{//인터페이스를 구현한 객체
		
		@Override
		public void actionPerformed(ActionEvent e) {
			//String name = e.getActionCommand();//출력되는 글자 받아오기
			Object obj = e.getSource();//문자로 비교하면 해석이 힘들기 때문에 obj의 참조값을 비교할수있게 참조값을 받는다 
					System.out.println(obj);
			if(obj == btnRed)//스트링을 비교할때는 == 말고 내용비교인 equals로 비교해야한다 
			{//equalsignorecase 대소문자 무시 비교 
			System.out.println("빨간색 버튼눌림");
			}
			else if(obj == btnBlue){
			System.out.println("파란색 버튼눌림");
			}
		}
	
	}
}





