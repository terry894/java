package Game;

import java.awt.Canvas;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class GameFrame extends Frame {

//    private Fighter fighter; // has a 

	private Canvas canvas;

	public GameFrame() {
		int x = 3;
		float y = 3.5f;
		char c = 'a';
		Object[] data = new Object[5];
		data[0] = x;
		data[1] = y;
		data[2] = c;

		setSize(720, 850);

//		canvas = new Canvas(); 

		// canvas = new GameCanvas();
//		canvas = new PuzzleCanvas2();
//		canvas[0] = new PuzzleCanvas();
//		add(canvas[0]);
		canvas = new RoleCanvas();
		add(canvas);

		canvas.setFocusable(true);
		canvas.requestFocus(); // 대상에 포커스를 바로 적용

		setVisible(true);

//		fighter = new Fighter();
	}
}
