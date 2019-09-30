package Game.슈팅;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

//import Game.Bullet;

public class Figther {
	private Image img;
//	private Bullet bullet;
	private int x;
	private int y;
	private int vx;
	private int vy;
	private int dx;
	private int dy;
	private int buly; 
	
	
	Toolkit tk = Toolkit.getDefaultToolkit();
	
	public Figther(int x, int y, Image img) {
//		bullet = new Bullet();
		this.x = x;
		this.y = y;
		this.img = img;

	}

	public Figther() {
		img = tk.getImage("res/fighter.png");
		x = 100;
		y = 100;
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

	public Image getImg() {
		return img;
	}

	public void setImg(Image img) {
		this.img = img;
	}
	
	
	
	public void draw(Graphics g, ShuttingCanvas shuttingCanvas) {
		g.drawImage(img, x, y, shuttingCanvas);
		
	}
	
//	public void fire(int y) {
//		bullet.move(y);
//	}

	
	public void move(int x, int y) {
		dx = x;//목적지
		dy = y;
		float w = dx-this.x;
		float h = dy-this.y;
		float d = (float)Math.sqrt(w*w + h*h);
		System.out.println(d);
		vx =(int)((w/d) *10);
		vy =(int)((h/d) *10);
	}
	public void bulUpdate() {
		
		
		
	}
	
	public void update() {
		x+=vx;
		y+=vy;
//		//vx,vy의 크기를 가지는 박스에 도달하면 멈춤 
		if( (x>(dx-20)) &&
			(x<(dx+20)) &&
		    (y>(dy-20)) &&
		    (y<(dy+20))
		)
		{
			vx = 0;
			vy = 0;
		}

	}
	


}
