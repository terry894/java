package Game;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import 가변배열.ObjectList;

public class RoleCanvas extends Canvas implements MouseListener, KeyListener {
	
	private int cnt;
    private int xx;
	private Kid kid;
	private Background bg;
	private EnemyFighter enemy;

//	private Missile[] missiles;
//	private ObjectList missile;
	private List<Missile> missiles;
	//List = 저장소 

	

	public RoleCanvas() {

		    cnt =0;
		    enemy = new EnemyFighter();
			kid = new Kid();
			bg = new Background();
//			missiles = new Missile[10];
			missiles = new ArrayList<>();
		
		addMouseListener(this);
		addKeyListener(this);		
		
		new Thread(()->{	
		while(true) {		
			try {			
				
				enemy.enemyUpdate();
//				enemy.explosion(missile);
				bg.update();
				kid.update();	
//				enemy.enemyUpdate();						
//				if (cnt == 10 ) {
//					for (int i = 0; i < 10; i++) {
//						missiles[i] = null;
//					}
//					cnt =0;
//				}
//				for(int i = 0 ; i<=cnt ; i++) {
//				if(missiles[i] != null)
//				missiles[i].update();
//			}
				for(Missile m : missiles)
					m.update();
//				{
//					Missile m = (Missile)o;
//					((Missile)o).update(); //missiles객체가 가지고 있는 다른 메소드를 사용하기 위해 object객체 형변환
//				}
				for(int i=0; i<missiles.size();i++) {
					missiles.get(i).update();
//					((Missile)missiles.get(i)).update();
				}
				
				
				Thread.sleep(10);
				}
			catch(InterruptedException e){
				e.printStackTrace();
				}
	           repaint();
			}
		}).start();
		
	}
	@Override
	public void paint(Graphics g) {
		
		Image bufImage = createImage(this.getWidth(),this.getHeight());
		Graphics g2 = bufImage.getGraphics();

		bg.draw(g2,this);	
		kid.draw(g2,this);
		enemy.draw(g2,this);
		
		for(int i=0; i<missiles.size();i++) {
			missiles.get(i).draw(g2,this);
		}
		
		
//		
//		for(Object o : missiles)
//		{
////			Missile m = (Missile)o;
//			((Missile)o).draw(g2,this);
//		}
//		for(int i = 0 ; i<=cnt ; i++) {
//		if(missiles[i] != null)
//		{missiles[i].draw(g2,this);}
//		}
		g.drawImage(bufImage,0,0,this);
	}
	//다른곳에 그려서 가지고 온다 -버퍼링
	

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode()) {
		case KeyEvent.VK_LEFT:
			kid.move(Direction.LEFT);	
		     break;
		case KeyEvent.VK_RIGHT:
			kid.move(Direction.RIGHT);
		     break;	
		case KeyEvent.VK_UP:
			kid.move(Direction.UP);
		     break;
		case KeyEvent.VK_DOWN:
			kid.move(Direction.DOWN);
		     break;	
		case KeyEvent.VK_SPACE:

//			 missiles[cnt] = kid.fire();
//			 cnt += 1;
			Missile m = kid.fire();
			if(m != null)
				missiles.add(m);
			
		    break;	
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {

	}
	
	@Override
	public void update(Graphics g) {
  paint(g);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}
	

}
