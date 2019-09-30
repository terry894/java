package day7;

public class Medic extends Terran{
//getter setter 로 이루어져있는 클래스를 - JavaBean 웹 - VO 
    int heal;
	private int mp; //class안에서만 사용 할 수 있는 변수
    
	Medic() { //변수 값을 초기화 하는 생성자
		heal = 5;
		hp = 100;
		mp =20;
		sight = 4;
		moveSpeed = 2;
		defence = 2;

	}
	void 치료하기 (Terran x ){ // 참조형 변수를 받아 hp의 값을 회복시켜주는 역할 
		
		mp -= 5;
		System.out.println("치료합니다");
		
		x.hp += heal ; // 해당 객체의 변수 값을 heal만큼 hp에 추가 
		if(x.hp >100) // 만약 100을 넘긴다면 100으로 설정
			x.hp =100;
	}
	
	//우측마우스 - source - generate getter setter - access modify
//	
//	public int getMp() {//값을 반환 하는 역할을 하는 메서드
//		return this.mp; 
//	}
//	public void setMp(int mp) {//값을 설정 하는역할을 하는 메서드
//		this.mp = mp;
//	}

}
