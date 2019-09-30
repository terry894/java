package day9Hw;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Hw0909no4 extends Frame implements WindowListener {
	Button bt;
	TextField ft;

	Hw0909no4() {
		addWindowListener(this);

		TextField ft = new TextField();
		ft.setBounds(25, 50, 430, 80);
		add(ft);
		Button bt1 = new Button("1");
		Button bt2 = new Button("2");
		Button bt3 = new Button("3");
		Button bt4 = new Button("4");
		Button bt5 = new Button("5");
		Button bt6 = new Button("6");
		Button bt7 = new Button("7");
		Button bt8 = new Button("8");
		Button bt9 = new Button("9");
		Button bt0 = new Button("0");
		Button bt00 = new Button("00");
		Button btPlus = new Button("+");
		Button btMinus = new Button("-");
		Button btEquals = new Button("=");
		Button btmultiply = new Button("*");
		Button btdivision = new Button("/");
		bt7.setBounds(25, 165, 100, 100);
		add(bt7);
		bt8.setBounds(135, 165, 100, 100);
		add(bt8);
		bt9.setBounds(245, 165, 100, 100);
		add(bt9);
		btPlus.setBounds(355, 165, 100, 100);
		add(btPlus);
		bt4.setBounds(25, 275, 100, 100);
		add(bt4);
		bt5.setBounds(135, 275, 100, 100);
		add(bt5);
		bt6.setBounds(245, 275, 100, 100);
		add(bt6);
		btMinus.setBounds(355, 275, 100, 100);
		add(btMinus);
		bt1.setBounds(25, 385, 100, 100);
		add(bt1);
		bt2.setBounds(135, 385, 100, 100);
		add(bt2);
		bt3.setBounds(245, 385, 100, 100);
		add(bt3);
		btmultiply.setBounds(355, 385, 100, 100);
		add(btmultiply);
		bt0.setBounds(25, 495, 100, 100);
		add(bt0);
		bt00.setBounds(135, 495, 100, 100);
		add(bt00);
		btEquals.setBounds(245, 495, 100, 100);
		add(btEquals);
		btdivision.setBounds(355, 495, 100, 100);
		add(btdivision);
		setLayout(null);
		setBackground(Color.lightGray);
		setSize(480, 620);
		setLocation(300, 300);
		setTitle("°è»ê±â");
		setVisible(true);
	}

	public static void main(String[] args) {
		Hw0909no4 hw4 = new Hw0909no4();
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
