package day6;

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
	
	Marine(int hp, int x, int y) { // 생성자 오버로딩 
		this(hp); // 안에 넣은 생성자를 넣고 그것만 변경하고 나머지는 그대로 해라.
		this.x=x;
		this.y=y;
//		this();
//		this.hp = hp;
//		this.x = x;
//		this.y = y;
	}
	
	void status()
	{//상태를 나타내는 메서드
		System.out.print("체력:" + hp + "\t");
		System.out.print("(x,y):" + x + " :" + y + "\t" );
	    System.out.print("방어력:" + defence);
	}
	
	
	void 공격하기(Marine x) // 매개변수를 참조값으로 받음  그래야 값이 변동됨 
	{
	    System.out.println("메서드 안쪽의 Marine:" + x );	 // 열쇠를 복사해준것과 같다 
	    System.out.println("뚜뚜뚜");
	    x.hp -= attack; 
	}
	void 공격하기(Medic x) { // Medic을 공격 하는 메서드
		System.out.println("뚜뚜뚜~~");
		x.hp -= attack;
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
