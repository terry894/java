package day10;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class SampleWindow extends Frame {
	SampleWindow() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("�����մϴ�");
			    System.exit(0);
			}
		});
//	   addWindowListener(this); //�� Ŭ������ â �������̽� Ȱ��ȭ
		setBounds(100, 100, 600, 400); // setBounds(x,y,width,height)
		setVisible(true); // â ���� ���̵��� ����

	}

	public static void main(String[] args) {
		SampleWindow sp = new SampleWindow(); // ��ü������ ���� �����ڸ� ȣ�������ν� Windowâ ���
	}
}
