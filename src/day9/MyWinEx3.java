package day9;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
//�Ϲ������� �ϳ��� ���Ͽ� public Ŭ���� �ϳ� �͵� ������
//public class�� �ƴ϶�� ������ ���� �� ���� �ִ�. 
import java.awt.event.ActionListener;

public class MyWinEx3 extends Frame {
        Button btnRed, btnBlue;
	
        //�������̽��� �׻� ����� �߻� �޼��� 
        //�ż��� �ٵ� ���� �׳� �޼��� 
        //
	MyWinEx3(){
		super("��ȣ���ư");//�θ��� �Ű����� �����ڰ� Ÿ��Ʋ�� ������ִ� ������ �� 
		setSize(300,300);
		setLocation(100,100);
//		setTitle("��ȣ�� ��ư");
		
		//������Ʈ �ʱ�ȭ
		btnRed = new Button("����");
		btnBlue = new Button("�Ķ�");
		
		//btnRed.addActionListener(�������̽��� �����Ѱ�ü );
		Handler hd = new Handler();
		
		btnBlue.addActionListener(hd);
		btnRed.addActionListener(hd);
		//�׼��� �����ϴ� ��ư�� �߰�
		//��ġ�����ڸ� ������� �ʰ� Ŀ�����ϰ� ����
		setLayout(null);
		
		//��� ������Ʈ�� ũ��� ��ġ�� ���� �����ؾ� �Ѵ�.
		btnRed.setSize(80,80);
		btnRed.setLocation(30,200);
		
		btnBlue.setSize(80,80);
		btnBlue.setLocation(180,200);
		
		//������Ʈ ���� 
		//red,blue �ҹ��� ��� 
//		Color c = new Color(255,0,0);
		btnRed.setBackground(Color.red);
	    btnBlue.setBackground(Color.blue);
//	    btnBlue.setBackground(c);
		
		add(btnRed);
		add(btnBlue);
		
		//�⺻��ġ ������: BorderLayout
		//���������� ��� 
//		add(btnwest,"West");//(����,��ġ)
//		add(btneast,"East");
		//android activity�� ����� 
		setVisible(true);
		
		//event ó��
		//1. event source ����
		//2. event source listener ����
		//3. event handler ���� 
	}
	
	public static void main(String[] args) {
		MyWinEx3 mw3 = new MyWinEx3();
	}
	class Handler implements ActionListener{//�������̽��� ������ ��ü
		
		@Override
		public void actionPerformed(ActionEvent e) {
			//String name = e.getActionCommand();//��µǴ� ���� �޾ƿ���
			Object obj = e.getSource();//���ڷ� ���ϸ� �ؼ��� ����� ������ obj�� �������� ���Ҽ��ְ� �������� �޴´� 
					System.out.println(obj);
			if(obj == btnRed)//��Ʈ���� ���Ҷ��� == ���� ������� equals�� ���ؾ��Ѵ� 
			{//equalsignorecase ��ҹ��� ���� �� 
			System.out.println("������ ��ư����");
			}
			else if(obj == btnBlue){
			System.out.println("�Ķ��� ��ư����");
			}
		}
	
	}
}





