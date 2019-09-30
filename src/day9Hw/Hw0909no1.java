package day9Hw;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class Hw0909no1 extends Frame {
	Button btn;

	Hw0909no1() {
		for (int i = 1; i < 51; i++) {
			btn = new Button();
			add(btn);
		}

		FlowLayout f1 = new FlowLayout();
		setLayout(f1);
		setSize(800, 600);
		setLocation(50, 50);
		setTitle("50개짜리 버튼 창");
		setVisible(true);
	}

	public static void main(String[] args) {
		Hw0909no1 hw = new Hw0909no1();

	}

}
