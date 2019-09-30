package day9;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWinEx2 extends Frame{
	//자료형 변수명
	Button btnNorth,btnSouth,btnEast,btnWest,btnCenter;

	MyWinEx2(){
		
		//컴포넌트 초기화 안하면 null point exception new 안해서 나오는 애러 발생 
		btnNorth = new Button("Noth");
		btnSouth = new Button("south");
		btnEast = new Button("east");
		btnWest = new Button("west");
		btnCenter = new Button("center");
		
		//컨테이너에 부착
		add(btnNorth, "North");
		add(btnSouth, "South");
		add(btnEast, "East");
		add(btnWest, "West");
		add(btnCenter, "Center");
		
		setTitle("샘플윈도우");
		
		Handler1 hd1 = new Handler1(); 
		btnCenter.addActionListener(hd1);
		//btnCenter가 쓰이기 전에 먼저 선언이 되어야 한다.
//		btnCenter.addActionListener(구현한 구현 클래스);
		//addActionListener는 감지기 감지되면
		//Handler를통해서 hd1이 약속되어있는 메서드를 호출하도록 해준다 
		
		
		//컨테이너에서 컴포넌트를 배치하는 두가지 방법
		//1. 배치관리자에 의해 배치 배치관리자 - 레이아웃
		//  Frame의 기본 배치관리자는 보더 레이아웃
		//보더레이아웃 ==>FlowLayout 으로 변경
		
		//FlowLayout 객체생성 - 물흐르듯이 위에서 아래로  좌에서 우로 배치 
		//컴포넌치 위치를 창크기에 따라 변화게 해주기 위해서 플로우 레이아웃을 쓴다
//        FlowLayout f1 = new FlowLayout();
//		
//		//현재 컨테이너에 배치관리자를 지정
//        setLayout(f1);
		
		//2.
//		btn = new Button("날 클릭해봐");
//		btn1 = new Button("파랑색");
//		add(btn);//container에 component가 담겨야 볼수있다
//		add(btn1);
		
		
		setSize(400,400);
		setLocation(300,300);
		
		setVisible(true);//항상 맨밑에 두면 화면이 흔들리는게 안보임
	
	}
	

	public static void main(String[] args) {
		MyWinEx2 ex2 = new MyWinEx2();
	
	}
}//class end 



class Handler1 implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("가운데버튼눌림");
	}
}