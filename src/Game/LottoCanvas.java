package Game;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class LottoCanvas extends Canvas {
	private static Image img;
	private int[] lotto = { 1, 3, 5, 9, 10, 12 };

	public LottoCanvas() {
	
	}

	@Override
	public void paint(Graphics g) {
		int returnlotto=0 ;
        int x1=0;
		Toolkit tk = Toolkit.getDefaultToolkit();
		img = tk.getImage("res/cards.png");
		for (int i = 0; i < lotto.length; i++) {
//			int x = i*62;
//			int y = 0;
//			int w = 62;    
//			int h = 80;
//			//x1 += (lotto[i]-1)*62;
//			int sx = ((lotto[i]-1)*62);
//			int sy = 0;
//			  g.drawImage(img, x, y, x+w, y+h, // ȭ��
//			    sx, sy, sx+w, sy+h, this);// ����ȭ�� 0,0���� 200,200������ ũ���� ������ ���� 0,0,200,200������ ������ ���� �̹���			  
			int x;
			int y = 0 ;
			int w = 62;
			int h = 80;
		}
	}
	
	
	
}

