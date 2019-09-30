package day7;
// 이건 상속용 
// instance 화 하는 클래스가 아님  ex)Mammal m1 = new Mammal
// 추상클래스  추상화를 위해 만든 클래스 

//추상 클래스     : 조감도 - 대략적인 설계도 이런식으로 구성할거야 
//클래스            : 객체를 만들기 위한 설계도
public abstract class Mammal {//ex)Mammal m1 = new Mammal 못하도록 막음
	String species, color;
	int head, tail, age;
	
	
	//이 메서드는 사용시 반드시 오버라이드해서 사용하세요
	//abstact메소드는 자식클래스를 만들때 꼭구현해야한다는 의미를 가지고 있다.  
	abstract void eating(); //abstract메서드 추상 메서드는 구현한게 없음 override해서 쓰라는 표시
	abstract void sleeping();
		//System.out.println("쿨쿨"); 어차피 오버라이딩할거 그냥 만들기만 하자 
}
