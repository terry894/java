package day8;

public class Police {
	String name;
	String position;
	int age;
	Weapon w;// A has a B 인 경우 사용 
	
	Police(){
		name ="포돌이";
		position = "순경";
		age =20;
	}
	
	Police(Weapon w){
		name ="포돌이";
		position = "순경";
		age =20;
		this.w = w;
        //this.g = g; // 생성자를 통해 참조변수를 초기화 하지 않으면 null값이 들어가 있음 
	}

	public void setW(Weapon w) { // 나중에 지급해 주고 싶을때 setter사용 
		this.w = w;
	}

	public void Patrol(){
		System.out.println("두리번 두리번");
	}
	public void donutEating() {
		System.out.println("냠냠");
	}
	public void arrest() {
	System.out.println("당신은 묵비권을 행사...");	
	}
	public void attack() {
		if(w!=null) w.fire();
		else System.out.println("총없어 ");
		//has a b 일때
	    //상속대신 사용 fire()w
//		System.out.println("때찌");
		}
	}
	
	
	

