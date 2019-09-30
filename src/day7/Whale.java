package day7;

public class Whale extends Mammal implements Flyable{
	//인터페이스는 전혀상관 없는 클래스에도 사용할수있다.
	Whale()
	{
		species = "푸들";
		color = "하얀색";
		tail = 1;
		age = 3;
		
	}
@Override
	public void eating() {
		System.out.println("새우 냠냠 ");
	}


@Override
	public void sleeping() {
		System.out.println("바다위에서 쿨쿨");
	}
    public void swimming() {
    	System.out.println("어푸어푸");
    }
	@Override
	public void fly() {
		System.out.println("날으는 고래");
		// TODO Auto-generated method stub
		
	}
	
}
