package day9;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyWinEx4 extends Frame implements WindowListener, ActionListener {
	Button btngugu;//has a ����
    // extends Frame is a ����
	MyWinEx4() {
		setLocation(150, 150);
		setSize(500, 300);
		setTitle("������");

		this.addWindowListener(this);//â�� Ŭ���Ҷ� ���� 
		//������Ʈ �ʱ�ȭ
		btngugu = new Button("������ ���");
		setLayout(null);// ��ġ�����ڸ� ������� �ʰ� ����
        //setLayout - �̰ɷ� ���̾ƿ��� ������ 
		btngugu.setLocation(180, 150);
		//������Ʈ�� ũ��� ������ ���� 
		btngugu.setSize(150, 80);
		//������Ʈ�� ����
		add(btngugu);
	    //��ư�� ������ �߰� 
        //Handler2 hd = new Handler2();//Handler Ŭ������ �������� �ʰ� 
		btngugu.addActionListener(this);//ActionListener�� ���� Ŭ������ ���� 

		setVisible(true);
	}

	public static void main(String[] args) {
		MyWinEx4 ex4 = new MyWinEx4();
	}

	@Override
	public void windowOpened(WindowEvent e) {
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("����");
		// TODO Auto-generated method stub
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		// �ٸ� �߰� â�� ��ﶧ ������Ŀ� �۾��� �κ��� ���� �ִ´�
	}

	@Override
	public void windowIconified(WindowEvent e) {}

	@Override
	public void windowDeiconified(WindowEvent e) {}

	@Override
	public void windowActivated(WindowEvent e) {}

	@Override
	public void windowDeactivated(WindowEvent e) {}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
			for (int i = 2; i < 10; i++) {
				System.out.println("3 *" + i + "=" + 3 * i);

			}

		}
		
	}


