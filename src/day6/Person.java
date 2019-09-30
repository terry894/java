package day6;
//person 클래스를 초기화 하고 getter, setter 설정
//자바의 최상위 클래스 
public class Person extends Object{
	//모든 클래스의 상위 클래스로 Object가 있다 생략가능 
	String name;
	String sex;
	int age;
	float cm;
	float kg;
	
	Person(){
		System.out.println("Person클래스의 기본생성자");
	}//매개변수가 있는 생성자가 있으면 따로 만들어 주어야 한다. 
	public Person(String name ,int age) {
		this.name = name ;
		this.age = age;
		System.out.println("매개변수 2개짜리 생성자");
	}
	Person(String name, int age, String sex, float cm, float kg) {
		super(); //object클래스의 생성자 호출, 생략한다
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.cm = cm;
		this.kg = kg;
		System.out.println("Person클래스의 매개변수 생성자");
	}//매개변수가 있는 생성자 - 멤버변수를 초기화 함  

	

}
