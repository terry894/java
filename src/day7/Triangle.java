package day7;

public class Triangle extends Figure {
	int width, height; 
	
	Triangle(){
		width = 10;
		height = 20;
	}
	
	
	public Triangle(int width, int height) {
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
		return (width*height)/2; 
	}
	
}
