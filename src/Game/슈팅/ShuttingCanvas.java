package Game.슈팅;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class ShuttingCanvas extends Canvas implements MouseListener, KeyListener {
//인터페이스는 사용할자원이 모여있는곳에다가 구현하는것이좋다
	private Figther figther;
	private EnemyFighter enemyFighter;
//	private Bullet bullet;

//	private int x;
//	private int y;
//	private int enemyx;
//	private int enemyy;
//	private Image img,eimg ;
	public ShuttingCanvas() {
		addMouseListener(this);// 마우스 리스너(인터페이스)를 구현한 객체를 넣어준다
		addKeyListener(this);

		enemyFighter = new EnemyFighter();
		figther = new Figther();
//		bullet = new Bullet();
//		x = figther.getX();
//		y = figther.getY();
//		x = 100;
//		y = 100;
//		enemyx = 0;
//		enemyy = 0;

//		Toolkit tk = Toolkit.getDefaultToolkit();
//		img = tk.getImage("res/fighter.png");
//		eimg = tk.getImage("res/enemy.png");
//
		new Thread(() ->{// 화면 갱신
			
			while (true) {

				try {
					figther.update();
					figther.bulUpdate();
					
					Thread.sleep(17);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				repaint(); //계속 다시 그린다 
			}
			
		}).start();
//	
	}
	@Override
	public void paint(Graphics g) {
		int x = figther.getX();
		int y = figther.getY();
//		bullet.draw(g, this);
		enemyFighter.draw(g, this);
		figther.draw(g, this);
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		figther.move(e.getX(), e.getY());
//		figther.setX(e.getX());
//		figther.setY(e.getY());
		repaint();
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

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		int x = figther.getX();
		int y = figther.getY();
		switch (e.getKeyCode()) {
		case 37: // 왼
			x -= 3;
			break;
		case 38: // 위
			y -= 3;
			break;
		case 39: // 오
			x += 3;
			break;
		case 40: // 아
			y += 3;
			break;
		// 키보드의 코드번호 가져옴
		}
		figther.move(x, y);
		repaint();
//		if (e.getKeyCode() == 32) {
//			figther.fire(y);	
//		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
