package day9;

import java.awt.Frame;

public class MyWinEx1 extends Frame {
        
	
	MyWinEx1(){
		//Super(); 부모의 기본 생성자 호출 
		//부모클래스에 기본생성자가 잇어야 함 
       setSize(800,600); // 너비 800px 높이 600px
       setVisible(true);        //화면에 보이기 

       setTitle("내가만든 윈도우"); //타이틀 만들기
       //좌측 상단 0,0 ->X+ ->y+
       setLocation(200,100);    //x로 200px y로 100px 만큼 이동
       //호출하자마자 실행될수있게 
       //효율적인 사용
	}
	public static void main(String[] args) {
		MyWinEx1 mw1 = new MyWinEx1(); //Frame에 있는 필드와 메서드 불러오기 
//		mw1.setSize(300, 200);//mw1 변수로 메서드 불러오기 
//		mw1.setVisible(true);
//		
	}
}
