package Game;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Missile {
	private int x;
	private int y;
	
	
	private int vx;
	private int vy;
	private Image img;
	
		
	public Missile(int x, int y) {
		this.x  = x;
		this.y  = y;
		Toolkit tk = Toolkit.getDefaultToolkit();
		img = tk.getImage("res/missile.png");
		// TODO Auto-generated constructor stub
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

	public void update() {
//		x+= vx;
//	    y+=vy;
	    y-=10;
		
	}
	public void draw(Graphics g2, RoleCanvas roleCanvas) {
		g2.drawImage(img, x, y, roleCanvas);
	}
	

}
