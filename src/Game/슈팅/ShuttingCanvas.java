package Game.����;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class ShuttingCanvas extends Canvas implements MouseListener, KeyListener {
//�������̽��� ������ڿ��� ���ִ°����ٰ� �����ϴ°�������
	private Figther figther;
	private EnemyFighter enemyFighter;
//	private Bullet bullet;

//	private int x;
//	private int y;
//	private int enemyx;
//	private int enemyy;
//	private Image img,eimg ;
	public ShuttingCanvas() {
		addMouseListener(this);// ���콺 ������(�������̽�)�� ������ ��ü�� �־��ش�
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
		new Thread(() ->{// ȭ�� ����
			
			while (true) {

				try {
					figther.update();
					figther.bulUpdate();
					
					Thread.sleep(17);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				repaint(); //��� �ٽ� �׸��� 
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
		case 37: // ��
			x -= 3;
			break;
		case 38: // ��
			y -= 3;
			break;
		case 39: // ��
			x += 3;
			break;
		case 40: // ��
			y += 3;
			break;
		// Ű������ �ڵ��ȣ ������
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
