package day9;

import java.awt.Frame;

public class MyWinEx1 extends Frame {
        
	
	MyWinEx1(){
		//Super(); �θ��� �⺻ ������ ȣ�� 
		//�θ�Ŭ������ �⺻�����ڰ� �վ�� �� 
       setSize(800,600); // �ʺ� 800px ���� 600px
       setVisible(true);        //ȭ�鿡 ���̱� 

       setTitle("�������� ������"); //Ÿ��Ʋ �����
       //���� ��� 0,0 ->X+ ->y+
       setLocation(200,100);    //x�� 200px y�� 100px ��ŭ �̵�
       //ȣ�����ڸ��� ����ɼ��ְ� 
       //ȿ������ ���
	}
	public static void main(String[] args) {
		MyWinEx1 mw1 = new MyWinEx1(); //Frame�� �ִ� �ʵ�� �޼��� �ҷ����� 
//		mw1.setSize(300, 200);//mw1 ������ �޼��� �ҷ����� 
//		mw1.setVisible(true);
//		
	}
}
