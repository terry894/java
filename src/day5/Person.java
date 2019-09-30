package day5;
//class : object를 생성하기 위한 설계도 

//1. member 변수
//2. member method

//object : 사물
//빵틀 -class
//붕어빵 -객체
public class Person {
	String name;
	int age;
	String gender;
	int eye;
	int norse;
	int mouth;

	// 생성자 : 객체의 초기화를 담당  만들어짐과 동시에 초기화 
	// 클래스명과 동일
	// 리터타입이 없지만 void 키워드도 사용하지 않는다. 
	// 아무런 매개변수도 없는 생성자를 기본생성자 
	// 따로 지정하지 않으면 JVM이 적어도 기본셍성자는 존재하는 것으로 간주 
	// 그변수의 기본값으로 초기화  ex) int=0 ,float=0.0f
	
	Person() { 
		name = "호빵맨";
		age = 100;
		eye = 2;
		norse = 1;
		mouth = 1;
		gender = "남";
		System.out.println("이부분은 생성자....");
	}
	
	Person(String a ){//초기화를 쉽게 하는 방법
		name = a;
		eye = 2;
		norse = 1;
		mouth = 1;
		gender = "남";
		System.out.println("String 매개변수를 갖는 생성자 ....");
		
	}
	
	Person(String a , int b)
	{
		name = a;
		age =b;
		eye = 2;
		norse = 1;
		mouth = 1;
		gender = "남";
		System.out.println("String 매개변수를 2개 갖는 생성자 ....");
		
	}

	void eating() {
		System.out.println("냠냠냠");
	}

	void talking() {
		System.out.println("까ㅏㄹ깔,,하하");
	}

	void thinking() {
		System.out.println("나생고존");
	}

}
