package day7;

public class Square extends Figure {
	int width, height; 
	
	Square(){
		width = 10;
		height = 20;
	}
	
	
	public Square(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	
	
	public int getWidth() {
		return width;
	}



	public void setWidth(int width) {
		this.width = width;
	}



	public int getHeight() {
		return height;
	}



	public void setHeight(int height) {
		this.height = height;
	}


    @Override
	double getCalArea(){
		return width*height;
	}

}
