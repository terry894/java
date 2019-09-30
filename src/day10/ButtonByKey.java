package day10;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ButtonByKey extends Frame implements KeyListener{
	Button ctlBtn;
	
	ButtonByKey() {
		
		ctlBtn = new Button("^^");
		setLayout(null);
		ctlBtn.setBounds(150,250,50,50);
		add(ctlBtn);
		//ó������ ��ư�� ��Ŀ���� �Ǿ��ִ�
		ctlBtn.addKeyListener(this);
		
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("�����մϴ�");
			    System.exit(0);
			}
		});
//	   addWindowListener(this); //�� Ŭ������ â �������̽� Ȱ��ȭ
		setBounds(50, 50, 1200, 1000); // setBounds(x,y,width,height)
		setVisible(true); // â ���� ���̵��� ����

	}

	public static void main(String[] args) {
		ButtonByKey sp = new ButtonByKey(); // ��ü������ ���� �����ڸ� ȣ�������ν� Windowâ ���
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {//Ű���带 ������ ������
		int key = e.getKeyCode();
		System.out.println(key);
		//��ū�� ��ġ 
		int x = ctlBtn.getX();
		int y = ctlBtn.getY();
		if(key == 39) {
			ctlBtn.setLocation(x+3,y);//->���� ������ �̵� 
		}
		else if(key == 38)
		{
			ctlBtn.setLocation(x,y-3);//->���� ������ �̵� 
		}
		else if(key == 40)
		{
			ctlBtn.setLocation(x,y+3);//->���� ������ �̵� 
		}		
		else if(key == 37)
		{
			ctlBtn.setLocation(x-3,y);//->���� ������ �̵� 
		}
		else if(key == 32)
		{
			ctlBtn.setLocation(x,y-20);//->���� ������ �̵� 
			ctlBtn.setLocation(x,y+20);//->���� ������ �̵� 
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {//Ű���带 ������ ����
		// TODO Auto-generated method stub
		
	}
}
