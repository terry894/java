package day9Hw;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Hw0909no2 extends Frame implements WindowListener {
	Button bt, btExit;

	Hw0909no2() {
		for (int i = 1; i < 51; i++) {
			bt = new Button();
			add(bt);
		}
		btExit = new Button("����");
		add(btExit);
		FlowLayout f1 = new FlowLayout();
		setLayout(f1);
		setSize(800, 600);
		setLocation(50, 50);
		setTitle("50��¥�� ��ư â");
		setVisible(true);
		addWindowListener(this);
		Handler hd = new Handler();
		btExit.addActionListener(hd);
	}

	public static void main(String[] args) {
		Hw0909no2 hw2 = new Hw0909no2();

	}

@Override
public void windowActivated(WindowEvent e) {}
@Override
public void windowClosed(WindowEvent e) {}
@Override
public void windowClosing(WindowEvent e) {
	System.exit(0);
}
@Override
public void windowDeactivated(WindowEvent e) {}
@Override
public void windowDeiconified(WindowEvent e) {}
@Override
public void windowIconified(WindowEvent e) {}
@Override
public void windowOpened(WindowEvent e) {}
}
class Handler implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent btExit) {
		System.out.println("�����մϴ�.");
		System.exit(0);
	}

}