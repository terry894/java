package day6;

public class TestMain5 {
	public static void main(String[] args) {
		
		Person p1 = new Person();
		Person p2 = new Person("홍길동",20,"남",175.0f,60.0f);
		// person 생성자가 멤버변수값을 
		//"홍길동",20,"남",175.0f,60.0f 로 초기화한 참조변수 p2
		System.out.println(p1.name);// p1 참조변수가 가르키는 멤버변수 name 호출
	    System.out.println(p2.name);
	    System.out.println(p2.cm);
	 	
	}

}
