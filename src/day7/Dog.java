package day7;

public class Dog extends Mammal{
	String  name;
	int head;
	
	Dog()
	{
		species = "Çªµé";
		name = "±è°úÀå";
		color = "ÇÏ¾á»ö";
		head = 1;
		tail = 1;
		age = 3;
		
	}
	
	@Override
	public void eating() {
		System.out.println("»ç·á ³È³È ");
	}
	
	@Override
	public void sleeping() {
		System.out.println("ÄğÄğ");
	}
    public void running() {
    	System.out.println("ÇíÇí");
    }
	
}
