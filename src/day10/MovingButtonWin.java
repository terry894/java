package day10;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MovingButtonWin extends Frame implements MouseMotionListener {
    Button btnYes,btnNo;
	Label lb;
	
	MovingButtonWin() {
        //this.btnYes = new Button("YES"); �����ڴ� ������� �ʱ�ȭ ��������ϱ� ������ 
		//btnYes = new Button("YES"); �� �ؾ� �ʱ�ȭ
		//Button btnYes = new Button("YES"); �� �������� btnYes�� �ǹ����⶧���� ������ ����� null -> nullpointexception �߻�
	    lb= new Label("����� �߻���ٰ� �����Ͻʴϱ�?");
		btnYes = new Button("YES");
		btnNo = new Button("NO");
		setLayout(null);
		
	    lb.setBounds(100, 50, 300, 60);
	    lb.setBackground(Color.red);
	    
	    btnYes.setBounds(100,350,100,100);		
	    btnNo.setBounds(300,350,100,100);		
        add(btnYes);
        add(btnNo);
        add(lb);
        
        addMouseMotionListener(this); // ���콺 ������ ������
        
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("�����մϴ�");
			    System.exit(0);
			}
		});
//	   addWindowListener(this); //�� Ŭ������ â �������̽� Ȱ��ȭ
		setBounds(100, 100, 800, 600); // setBounds(x,y,width,height)
		setVisible(true); // â ���� ���̵��� ����
	}

	public static void main(String[] args) {
		MovingButtonWin sp = new MovingButtonWin(); // ��ü������ ���� �����ڸ� ȣ�������ν� Windowâ ���
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) { //���콺�� �����϶� ���� ȣ��Ǵ� �޼���
		// TODO Auto-generated method stub
		int x = e.getX();
		int y = e.getY();
		//System.out.println("���콺 ��ġ:("+x+","+y+")");
		int bx = btnYes.getX();
		int by = btnYes.getY();
		//System.out.println("��ư ��ġ:("+bx+","+by+")");
		double d = 
		Math.sqrt((bx-x)*(bx-x) + (by-y)*(by-y));//Math.sqrt�� double�� ��ȯ  
		System.out.println("��ư�� ���콺�� �Ÿ� :" + d);
		if(d<120) {
			btnYes.setLocation((int)Math.random()*600,(int)Math.random()*400);
		}
	}
}
