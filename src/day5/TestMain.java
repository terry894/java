package day5;

public class TestMain {

	public static void main(String[] args) {
		//설계도를 가지고 객체를 만들어 본다
		//클래스명 참조변수 ;
		//heap에 method와 변수가 저장된다 
		//stack에  주소값을 가진 변수 p 가 저장 된다
		Person p; //참조형 변수 4byte
		p= new Person();
		System.out.println(p);
		//객체가 가지고 있는 변수에 값을 할당 
		p.name = "홍길동";
		p.age = 20;
		p.eye = 2;
		p.norse = 1;
		p.mouth = 1;
		p.gender= "남";
		
		System.out.println("이름:" + p.name);
		System.out.println("나이:" + p.age);
		System.out.println("눈:" + p.eye);
		System.out.println("코:"+ p.norse);
		
	    p.eating();
	    p.thinking();
	
}
}
