package day9Hw;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Hw0909no3 extends Frame implements WindowListener {
	
	Button btExport, btExit;
	TextField tf;
	Label lb;
	Hw0909no3() {
		setLayout(null);
		Button btExport = new Button("���");
		add(btExport);
		btExport.setSize(160, 60);
		btExport.setLocation(30, 110);
		Button btExit = new Button("����");
		add(btExit);
		btExit.setSize(160, 60);
		btExit.setLocation(210, 110);
		
		HandlerExport hdExport = new HandlerExport();
		btExport.addActionListener(hdExport);
		
		HandlerExit hdExit = new HandlerExit();
		btExit.addActionListener(hdExit);
		
		TextField tf = new TextField();
		add(tf);
		tf.setSize(160, 60);
		tf.setLocation(210, 30);
		
		Label lb = new Label("��");
		add(lb);
		lb.setAlignment(1);
		lb.setSize(160, 60);
		lb.setLocation(30, 30);
		
		addWindowListener(this);
		setTitle("���������");
		setSize(400, 200);
		setLocation(200, 200);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		Hw0909no3 hw3 = new Hw0909no3();
	}


	@Override
	public void windowActivated(WindowEvent arg0) {}
	@Override
	public void windowClosed(WindowEvent arg0) {}
	@Override
	public void windowClosing(WindowEvent arg0) {
		System.out.println("â�ݱ⸦ ������");
		System.exit(0);
	}
	@Override
	public void windowDeactivated(WindowEvent arg0) {}
	@Override
	public void windowDeiconified(WindowEvent arg0) {}
	@Override
	public void windowIconified(WindowEvent arg0) {}
	@Override
	public void windowOpened(WindowEvent arg0) {}
	
}

class HandlerExport implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
			for (int i = 1; i < 10; i++) {
			System.out.println("3 * "+i+" = "+(3*i));
		}
	}

}

class HandlerExit implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("�����ư�� ������");
		System.exit(0);
	}
}