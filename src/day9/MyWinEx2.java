package day9;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWinEx2 extends Frame{
	//�ڷ��� ������
	Button btnNorth,btnSouth,btnEast,btnWest,btnCenter;

	MyWinEx2(){
		
		//������Ʈ �ʱ�ȭ ���ϸ� null point exception new ���ؼ� ������ �ַ� �߻� 
		btnNorth = new Button("Noth");
		btnSouth = new Button("south");
		btnEast = new Button("east");
		btnWest = new Button("west");
		btnCenter = new Button("center");
		
		//�����̳ʿ� ����
		add(btnNorth, "North");
		add(btnSouth, "South");
		add(btnEast, "East");
		add(btnWest, "West");
		add(btnCenter, "Center");
		
		setTitle("����������");
		
		Handler1 hd1 = new Handler1(); 
		btnCenter.addActionListener(hd1);
		//btnCenter�� ���̱� ���� ���� ������ �Ǿ�� �Ѵ�.
//		btnCenter.addActionListener(������ ���� Ŭ����);
		//addActionListener�� ������ �����Ǹ�
		//Handler�����ؼ� hd1�� ��ӵǾ��ִ� �޼��带 ȣ���ϵ��� ���ش� 
		
		
		//�����̳ʿ��� ������Ʈ�� ��ġ�ϴ� �ΰ��� ���
		//1. ��ġ�����ڿ� ���� ��ġ ��ġ������ - ���̾ƿ�
		//  Frame�� �⺻ ��ġ�����ڴ� ���� ���̾ƿ�
		//�������̾ƿ� ==>FlowLayout ���� ����
		
		//FlowLayout ��ü���� - ���帣���� ������ �Ʒ���  �¿��� ��� ��ġ 
		//������ġ ��ġ�� âũ�⿡ ���� ��ȭ�� ���ֱ� ���ؼ� �÷ο� ���̾ƿ��� ����
//        FlowLayout f1 = new FlowLayout();
//		
//		//���� �����̳ʿ� ��ġ�����ڸ� ����
//        setLayout(f1);
		
		//2.
//		btn = new Button("�� Ŭ���غ�");
//		btn1 = new Button("�Ķ���");
//		add(btn);//container�� component�� ��ܾ� �����ִ�
//		add(btn1);
		
		
		setSize(400,400);
		setLocation(300,300);
		
		setVisible(true);//�׻� �ǹؿ� �θ� ȭ���� ��鸮�°� �Ⱥ���
	
	}
	

	public static void main(String[] args) {
		MyWinEx2 ex2 = new MyWinEx2();
	
	}
}//class end 



class Handler1 implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("�����ư����");
	}
}