package day6;


import java.awt.Color;
import java.awt.Frame; // ctrl + shift + o
//import day5.GuGuDan 처럼 import를 이용해 어디에 있는 Frame인지 설명해야한다

public class TestMain7 extends Frame{
	TestMain7(){
		   setVisible(true); // 부모 클래스 Frame 에 잇는 메소드 기능 호출 
		   setSize(400, 300);
		   setBackground(Color.blue); //파란 배경 창 띄우기 
	}
	public static void main(String[] args) {
       // Frame 
	   TestMain7 t7 = new TestMain7();
	}
}
