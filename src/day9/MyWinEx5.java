package day9;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyWinEx5 extends Frame implements WindowListener{
	//implements WindowListener Ŭ���������� ��ü������ �����ϵ��� �ϱ����� �ν��Ͻ� ȣ�� 
	MyWinEx5() {
		
		//�ڵ鷯 ��ü�� ���� ������������ �� Ŭ�������� �ڵ鷯 ��ü�� ������ �Ҽ��ֵ��� ���� 
	  
		this.addWindowListener(this);//this.������ ������ �޼��� ��� ��
		//this.addWindowListener(this): Ŭ�������� ��ü������ �����Ѵ� 
		//this.addWindowListener(�ش� �������̽��� ������ ��ü)
//		this.addActionListener();
		
		setSize(800, 600);
		setLocation(100, 100);
		setVisible(true);
	}

	public static void main(String[] args) {

		MyWinEx5 ex5 = new MyWinEx5();

	}

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("�������� ȣ��");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("�����϶� ȣ��");
		System.exit(0);
		//0�� �������� , 0�� �ƴ� �ٸ� ��: ���������� 
		// TODO Auto-generated method stub
	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("�����Ŀ� ȣ��");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
	System.out.println("������ȭ �϶� ȣ��");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("�����ܿ��� ���ƿö� ȣ��");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("Ȱ��ȭ �϶� ȣ��");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("��Ȱ��ȭ �϶� ȣ��");
		// TODO Auto-generated method stub
		
	}

}
