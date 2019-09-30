package day7;

public class Terran {

	int hp, sight, moveSpeed, attackSpeed, defence;
	int x,y;
	
	
	void status()
	{//상태를 나타내는 메서드
		System.out.print("체력:" + hp + "\t");
		System.out.print("(x,y):" + x + " :" + y + "\t" );
	    System.out.print("방어력:" + defence);
	}
	
	void 이동하기() {
		System.out.println("무브무브");
	}
	
	void 정찰하기() {
		System.out.println("근무중 이상무 ...");
	}
	void 위치고수() {
		System.out.println("Hold....");
	}
}
