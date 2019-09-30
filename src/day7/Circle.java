package day7;

public class Circle extends Figure {
	
	int r;
	Circle(){
		r= 3;
	}

	public Circle(int r) {
		super();
		this.r = r;
	}
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	
	
	 @Override
	double getCalArea(){ //get주로 반환을 하는 역할을 한다 매개변수X
		return (r*r*3.14);
	}
	
	

}
