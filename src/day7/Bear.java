package day7;

public class Bear extends Mammal{

	@Override
	void eating() {
	    System.out.println("꿀단지 냠냠");
		// TODO Auto-generated method stub
	}

	@Override
	void sleeping() {
		System.out.println("쿨쿨");
		// TODO Auto-generated method stub	
	}

//public abstract class Bear extends Mammal 하면 중간 추상화역할을 하며 오버라이딩 구현 안해도됨 
// 우클릭 - source - override..... 클릭  A=abstract , 초록색 동그라미 - public 
// 빨간줄마우스 대고 클릭 
}
