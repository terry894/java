package day5;

public class TestMain3 {
	public static void main(String[] args) {
//		클래스명 참조변수 = new 생성자 
		Person p1 = new Person();
		System.out.println(p1.name);
		System.out.println("-----------");
		Person p2 = new Person("세균맨");
		System.out.println(p2.name);
		System.out.println(p2.age);
		System.out.println("-----------");
		Person p3 = new Person("식빵맨", 20);
		System.out.println("이름 :" + p3.name);
		System.out.println("나이 :" + p3.age);																					
		
		
		
		
//		p1.name = "호빵맨";
//		p1.age =100;
//		p1.eye = 2;
//		p1.norse = 1;
//		p1.mouth = 1;
//		p1.gender = "남";
//	    System.out.println(p1.name);
		
//		Person p2 = new Person();
		
//		p2.name ="세균맨";
//		p2.age = 99;
//		p2.eye = 2;
//		p2.norse = 1;
//		p2.mouth = 1;
//		p2.gender = "남";
//		System.out.println(p2.name);
		
	}

}
