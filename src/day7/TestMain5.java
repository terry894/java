package day7;

public class TestMain5 {
	
	public static void main(String[] args) {
		Rabit r = new Rabit();
		Dog d = new Dog();
		Whale w = new Whale();
		Horse h = new Horse();
		
		r.eating();
		d.eating();
		w.eating();
		
		h.eating();
		h.sleeping();
		h.runnung();
		
		h.fly();
		w.fly();
		//다형성
	    //동일한 조작방법으로 동작시키지만 
		//대상에 따라 다른 실행하게 하는것
		//ex)게임캐릭터의 조작방법을 단순화 시킬수 있다
		Flyable f = h;
        f.fly();
        f = w;
        f.fly();
	}
	
}
