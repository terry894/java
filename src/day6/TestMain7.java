package day6;


import java.awt.Color;
import java.awt.Frame; // ctrl + shift + o
//import day5.GuGuDan ó�� import�� �̿��� ��� �ִ� Frame���� �����ؾ��Ѵ�

public class TestMain7 extends Frame{
	TestMain7(){
		   setVisible(true); // �θ� Ŭ���� Frame �� �մ� �޼ҵ� ��� ȣ�� 
		   setSize(400, 300);
		   setBackground(Color.blue); //�Ķ� ��� â ���� 
	}
	public static void main(String[] args) {
       // Frame 
	   TestMain7 t7 = new TestMain7();
	}
}
