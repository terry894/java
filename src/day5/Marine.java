package day5;

public class Marine {
	int hp, attack, sight, moveSpeed, attackSpeed, defence;
	int x,y;
	//기본생성자는 클래스이름과 똑같은 이름을 가진다.
	//생성자 :개체의 초기화를 담당하는 메서드
	public Marine() {
		hp = 100;
		attack = 3;
		sight = 4;
		moveSpeed = 2;
		attackSpeed = 2;
		defence = 2;
		x = 0;
		y = 0;
	}
	
	Marine(int hp) {
		//기본생성자를 실행하고  
		this();//생성자 불러옴 
		//이것만 변경해라.
		this.hp = hp;
		//기본생성자와 변경할 생성자의 줄을 바꿀 수는 없다. 무조건 첫라인에 와야 한다.
	}
	
	Marine(int hp, int x, int y) {
		this(hp); // 안에 넣은 생성자를 넣고 그것만 변경하고 나머지는 그대로 해라.
		this.x=x; // 생성자의 변수를 가르키는 것이 아니라 Marine에 전달받은 매개변수를 가르킴 
		this.y=y;
//		this();
//		this.hp = hp;
//		this.x = x;
//		this.y = y;
	}
	
	void 공격하기() {
		System.out.println("뚜뚜뚜~~");
	}
	void 정찰하기() {
		System.out.println("근무중 이상무 ...");
	}
	void 위치고수() {
		System.out.println("Hold....");
	}
	void 스팀팩() {
		moveSpeed += 3;
		attackSpeed +=3;
		System.out.println("뚜뚜뚜~~");
	}
}
