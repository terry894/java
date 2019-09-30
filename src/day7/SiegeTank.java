package day7;

public class SiegeTank extends Terran{
     
	int attack; 
	//기본생성자는 클래스이름과 똑같은 이름을 가진다.
	//생성자 :개체의 초기화를 담당하는 메서드
	SiegeTank() {
		hp = 100;
		attack = 10;
	}
	
//	SiegeTank(int hp) {
//		//기본생성자를 실행하고  
//		this();//생성자 불러옴 
//		//이것만 변경해라.
//		this.hp = hp;
//		//기본생성자와 변경할 생성자의 줄을 바꿀 수는 없다. 무조건 첫라인에 와야 한다.
//	}
	
//	SiegeTank(int hp, int x, int y) { // 생성자 오버로딩 
//		this(hp); // 안에 넣은 생성자를 넣고 그것만 변경하고 나머지는 그대로 해라.
//		this.x=x;
//		this.y=y;
//		this();
//		this.hp = hp;
//		this.x = x;
//		this.y = y;
//	}
	

	void 공격하기(Terran x) // 매개변수를 참조값으로 받음  그래야 값이 변동됨 
	{ //자식의 참조값을 부모에 담을수 잇음 따라서 Terran x 가능 
	  //이걸 통해 다른 유닛도 공격가능 
		//Medic x, Marine x 로 따로 메소드 만들 필요없음 
	    System.out.println(x);
	    x.hp -= attack; 
	    x.status();
	}



}

	

