package Game.½´ÆÃ;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class EnemyFighter {
	
	private int enemyx;
	private int enemyy;
	private Image eimg;
	public EnemyFighter() {
		Toolkit tk = Toolkit.getDefaultToolkit();
		eimg = tk.getImage("res/fighter1.png");
	    enemyy=0;
	    enemyx=0;	
	}
	
	public EnemyFighter(int enemyx, int enemyy, Image eimg) {
		this.enemyx = enemyx;
		this.enemyy = enemyy;
		this.eimg = eimg;
	}
	public int getEnemyx() {
		return enemyx;
	}
	public void setEnemyx(int enemyx) {
		this.enemyx = enemyx;
	}
	public int getEnemyy() {
		return enemyy;
	}
	public void setEnemyy(int enemyy) {
		this.enemyy = enemyy;
	}
	public Image getEimg() {
		return eimg;
	}
	public void setEimg(Image eimg) {
		this.eimg = eimg;
	}
	public void draw(Graphics g , ShuttingCanvas shuttingCanvas)
	{
		g.drawImage(eimg, enemyx, enemyy, shuttingCanvas);
	}

}
