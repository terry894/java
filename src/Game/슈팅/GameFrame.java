package Game.����;

import java.awt.Canvas;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowListener;

public class GameFrame extends Frame {
 	
//    private Fighter fighter; // has a 
	private Canvas canvas;
	public GameFrame() {
		setSize(600, 400);
		//canvas = new GameCanvas();
//		canvas = new PuzzleCanvas2();
		canvas = new ShuttingCanvas();
		add(canvas);
		
		canvas.setFocusable(true);
		canvas.requestFocus(); //��� ��Ŀ���� �ٷ� ����
		setVisible(true);
		
		addWindowListener(new GameWindowListener());

//		fighter = new Fighter();
	}		
}








