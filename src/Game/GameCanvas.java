package Game;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
//������ ���� - Frame ,���� - Component  
public class GameCanvas extends Canvas {
//Canvas��� Ʋ�� ��� 
	@Override
	public void paint(Graphics g) { //Ʋ���� ����
		super.paint(g);

		Toolkit tk = Toolkit.getDefaultToolkit();
	    Image img = tk.getImage("res/foto9.jpg");
	    {
	    int x = 0;
	    int y = 0;
	    int w = 200;
	    int h = 200;
	    
	    g.drawImage(img, x, y, x+w, y+h,//ȭ��
	    		0,0,200,200,this);//����ȭ�� 0,0���� 200,200������ ũ���� ������ ���� 0,0,200,200������ ������ ���� �̹��� 

	    }
	    { // ����ȭ �ؼ� �ڵ带 �ι� �����ִ�. 
	    int x = 200;
	    int y = 0;
	    int w = 200;
	    int h = 200;
	    
	    g.drawImage(img, x, y, x+w, y+h,
	    		0,200,200,400,this);
	    }
	    { // ����ȭ �ؼ� �ڵ带 �ι� �����ִ�. 
	    int x = 0;
	    int y = 200;
	    int w = 200;
	    int h = 200;
	    
	    g.drawImage(img, x, y, x+w, y+h,
	    		200,0,400,200,this);
	    }
	    
	    
	    { // ����ȭ �ؼ� �ڵ带 �ι� �����ִ�. 
	    int x = 200;
	    int y = 200;
	    int w = 200;
	    int h = 200;
	    
	    g.drawImage(img, x, y, x+w, y+h,
	    		200,200,400,400,this);
	    }

	    		
	    
	    
	    

	    
    //g.drawImage(img, 100, 0, this);
    //g.drawLine(100, 100, 200, 200);		
    //super.paint(g); �θ� ��������� ��� �θ������ ȣ�� 
	//�ؿ��ٰ� ���� ��ĥ
	}
	
}
