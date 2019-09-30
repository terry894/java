package day7;

public class Ghost extends Terran {
	int 핵;
	
	//Superclass에서 browser에서 지정가능 

	
	public void fire() {
		
		if(핵>0)
		{
			핵--;
			System.out.println("뉴클리어 디렉티드");
		}
		
	
	}
}
