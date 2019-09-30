package Game;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;


public class Kid {

	  
     private int x;
     private int y;
     private int vx;
     private int vy;
     private int dx;
     private int dy;
     
     private int w;
     private int h;
     private final static  int OFFSET_LEFT =32;
     private static final  int OFFSET_TOP =32;//static 블록 따로 만들지 말기
     private int timeForReady = 0;
     Missile missile;
     Image img;
     int imageindex;
     
//     static {
//    	 
//     }
     public Kid() {
    	 imageindex =3;
    	 vx=0;
    	 vy=0;
    	 x =250;
    	 y= 300;
    	 w = h =64;
    	 Toolkit tk = Toolkit.getDefaultToolkit();
    	 img = tk.getImage("res/fighter1.png");
     }
     
     public void update() {
     x+=vx;
     y+=vy;
     
     if(timeForReady >0)
    	 timeForReady--;
     
//  	 y+=vy;	 
     }


	public void draw(Graphics g, RoleCanvas roleCanvas) {
//		g.drawImage(img, x, y, roleCanvas);x + 2*w, y, x+3*w, y+h,
		int sx = w*imageindex;
		g.drawRect(x-OFFSET_LEFT,y-OFFSET_TOP,w,h);
		g.drawImage(img,
				// 화면 좌표
				x-OFFSET_LEFT ,
				y-OFFSET_TOP,
				x+w-OFFSET_LEFT ,
				y+h-OFFSET_TOP,
				//이미지 좌표
				sx,0, sx+w,h,
				roleCanvas);
	}

	public void move(Direction direction) {
		switch(direction) {
		case LEFT:
			vx = -3;
			vy = 0;
			imageindex--;
			if(imageindex <0 )
			{imageindex =0;}
			break;
		case RIGHT:
			vx = 3;
			vy = 0;
			imageindex++;
			if(imageindex >6 )
			{imageindex =6;}
			break;
		case UP:
			vy = -3;
			vx = 0;
			break;
		case DOWN:
			vy = 3;
			vx = 0;
			break;
		}
		
	}
	public Missile fire() { 
		
		if(timeForReady == 0) {
		timeForReady = 20;
		return new Missile(x-10,y-32);//미사일을 만들어서 반환 
		}
		return null;
	
	}
	

	public void move(int x, int y) {
//	dx=x;
//	dy=y;
		
		
		
	}
}
