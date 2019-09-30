package Game;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
//윈도우 뼈대 - Frame ,내용 - Component  
public class GameCanvas extends Canvas {
//Canvas라는 틀을 사용 
	@Override
	public void paint(Graphics g) { //틀에서 수정
		super.paint(g);

		Toolkit tk = Toolkit.getDefaultToolkit();
	    Image img = tk.getImage("res/foto9.jpg");
	    {
	    int x = 0;
	    int y = 0;
	    int w = 200;
	    int h = 200;
	    
	    g.drawImage(img, x, y, x+w, y+h,//화면
	    		0,0,200,200,this);//현재화면 0,0에서 200,200까지의 크기의 공간에 사진 0,0,200,200까지의 공간을 붙임 이미지 

	    }
	    { // 지역화 해서 코드를 두번 쓸수있다. 
	    int x = 200;
	    int y = 0;
	    int w = 200;
	    int h = 200;
	    
	    g.drawImage(img, x, y, x+w, y+h,
	    		0,200,200,400,this);
	    }
	    { // 지역화 해서 코드를 두번 쓸수있다. 
	    int x = 0;
	    int y = 200;
	    int w = 200;
	    int h = 200;
	    
	    g.drawImage(img, x, y, x+w, y+h,
	    		200,0,400,200,this);
	    }
	    
	    
	    { // 지역화 해서 코드를 두번 쓸수있다. 
	    int x = 200;
	    int y = 200;
	    int w = 200;
	    int h = 200;
	    
	    g.drawImage(img, x, y, x+w, y+h,
	    		200,200,400,400,this);
	    }

	    		
	    
	    
	    

	    
    //g.drawImage(img, 100, 0, this);
    //g.drawLine(100, 100, 200, 200);		
    //super.paint(g); 부모껄 쓰고싶을때 사용 부모생성자 호출 
	//밑에다가 스면 덧칠
	}
	
}
