



package day7;
//implements Flyable 이라는 인터페이스를 부여 
public class Horse extends Mammal implements Flyable{
	
	@Override//범위는 해당범위 위에만 지정
	public void eating() {
		System.out.println("각설탕 냠냠");
	}
	
	@Override
	public void sleeping() {
		System.out.println("누워 자요");
	}
	
	
	
	public void runnung() {
		System.out.println("이이잉~~");
	}

	@Override
	public void fly() {
		System.out.println("펄럭펄럭 날아요");
		// TODO Auto-generated method stub
		
	}

}
