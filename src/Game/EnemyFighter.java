package Game;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.List;

public class EnemyFighter {
	private int x ;
	private int y ;
	private int vx ;
	private int sx;
	Image img;
	private Missile missiles;
	
	public EnemyFighter() {
		  Toolkit tk = Toolkit.getDefaultToolkit();
		   img = tk.getImage("res/enemy.png");
		x=0;
		y=0;
		vx=1;
//		public EnemyFighter(int enemyx, int enemyy, Image eimg) {
//			this.x = enemyx;
//			this.y = enemyy;
//			this.img = eimg;
//		}
//		
		// TODO Auto-generated constructor stub
	}
	public void enemyUpdate() {
		 if (x > 300)
		      vx = -1;
		   else
		      x +=vx;
		   
		   if (x < 0)
		      vx = 1;
		   else
		      x += vx;  
	}
	
	public void explosion(Missile missiles) {
		int mx;
		int my;
		mx = missiles.getX();
		my = missiles.getY();
		if( mx> x-20 &&
			mx< x+20 &&
			my< y-20 &&
			my< y+20 
				) 
		{
			
			
		}
		
	}
	
	
	public void draw(Graphics g2, RoleCanvas roleCanvas) {
		// TODO Auto-generated method stub
		g2.drawImage(img, x, y, roleCanvas);

	}

	
	
}
