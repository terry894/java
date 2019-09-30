package day6;

public class Human {
	//이름,나이 , 성별 , 전화번호,직업
    //먹기(), 말하기(), 숨쉬기(), 상태보기()
	
	//홍길동  20  남  010-1234-578 도적
	
	int age;
	String name, sex, phone, job;
	
	Human(){
		name = "홍길동";
		age = 20;
		sex = "남";
		phone = "010-1234-5678";
		job = "도적";		
	}
	
    Human(int age, String name, String sex, String phone, String job) {
    	//우측 마우스 -> source ->generate .. using field 로 만들어줌 
		this.age = age;
		this.name = name;
		this.sex = sex;
		this.phone = phone;
		this.job = job;
	}

//	Human(String name, int age, String phone, String job, String sex)
//	{ 
//		this.name = name;
//		this.age = age;
//		this.job = job;
//		this.phone = phone;
//		this.sex = sex;
//	}
	
	void eating() { //먹는것을 나타내는 메서드
		System.out.println("쩝쩝");
	}
	
	void talking() { //말하는 메서드
		System.out.println("어쩌구저쩌구");
	}
	void breathing() { //숨쉬는 메서드
		System.out.println("흠파");
	}
	void status() { //상태를 나타내는 메서드
		System.out.println("이름: " + name);
		System.out.println("직업: " + job);
		System.out.println("나이: " + age);
		System.out.println("전화번호: "  + phone);
	}
	
}
