package day10;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//class Test extends WindowAdapter {
//	@Override
//	public void windowClosing(WindowEvent e) {
//		System.out.println("�����մϴ�");
//		System.exit(0);
//	}
//}

public class MyWin extends Frame {
	MyWin() {

//		WindowAdapter wa = new Test(); //
//		WindowAdapter wa = new WindowAdapter() {// �ѹ��� ���� ������ �͸� �̳�Ŭ������ ���� 
//			@Override
//			public void windowClosing(WindowEvent e) {
//				System.out.println("�����մϴ�");
//				System.exit(0);
//			}
//		};// new WindowAdapter(){}; - �͸� �̳� Ŭ���� 
		
		// WindowAdapter wa = �������͸� ������ Ŭ����
//		addWindowListener(wa); // �� Ŭ������ â �������̽� Ȱ��ȭ ()�ȿ� Winow�޼��� ������ ��ü�� �����Ѵ�
//WindowAdapter�� �߻�Ŭ�������� WindowListener�� �� �޼��尡 ���ֱ� ������ window�޼����� �����ߴٰ� �����հ� ()�ȿ� ��ü�� �������ִ� 
//WindowAdapter�� �����θ� �ν��Ͻ�ȭ �Ҽ����⶧���� 
//WindowAdapter�� ����ϰ��մ� testŬ������ �����ؼ� �ν��Ͻ�ȭ �Ͽ� addWinowListener���ٰ� �ִ´�
		
		addWindowListener(new WindowAdapter(){
			//addWindowListener(wa) wa ó�� ��ü�� ���� �ʰ� �ȿ� �մ� �޼��带 �����־ ���� 
			//��� �̳� Ŭ���� ����� ���ϰ����ϰ� �����Ѱ� 
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("�����մϴ�");
				System.exit(0);
			}
		});
		setBounds(100, 100, 600, 400); // setBounds(x,y,width,height)
		setVisible(true); // â ���� ���̵��� ����
	}

	public static void main(String[] args) {
		MyWin sp = new MyWin(); // ��ü������ ���� �����ڸ� ȣ�������ν� Windowâ ���
	}
}
