package Game;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Puzzle {
//데이터 구조화: 그릇을 생성
	private int x;
	private int y;
	private int w;
	private int h;

	private int sx;
	private int sy;
	Image img;

	public Puzzle() {
		Toolkit tk = Toolkit.getDefaultToolkit();
		img = tk.getImage("res/foto9.jpg");
		w = 200;
		h = 200;
	}
	
	public void setPos(int i) {
		x = (i % 3) * 200;
		y = (i / 3) * 200;
	}
	
	public void setSrc(int i) {
		sx = (i % 3) * 200;
		sy = (i / 3) * 200;	
    }
	
//	public void drawImage(Graphics g, PuzzleCanvas puzzle) {
//		g.drawImage(img, x + 5, y + 5, x + w, y + h, // 화면
//				sx + 5, sy + 5, sx + w, sy + h, puzzle);
//	}
}
