package Game;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Background {
	private int x;
	private int y;
	private Image image;
	
	public Background() {
	x=0;
	y=0;
	Toolkit tk = Toolkit.getDefaultToolkit();
	image= tk.getImage("res/space.jpg");
	}

	public void draw(Graphics g, RoleCanvas roleCanvas) {

		g.drawImage(image, x, y, 720, 1200, 
				0, 0, 360, 1200, roleCanvas);
		g.drawImage(image, x, y-1200, 720, 1200, 
				0, 0, 360, 1200, roleCanvas);

//		g.drawImage(image, x, y-850, roleCanvas);
//		g.drawImage(image, x, y-2050, roleCanvas);
	}
	
	public void update() {
		y+=5;
		if(y == 1200) {
			y = 0;
		}
		
	}

}
