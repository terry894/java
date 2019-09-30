package day6;

//모든 자바변수는 모두 초기화 해야된다.
public class SuperMan extends Person {
	int 빨간망또;

	SuperMan() {
		// super(); //부모의 생성자를 호출 제일 상단에 적어야함 생략가능함
		// 항상 자식 생성자는 부모 생성자를 호출
		this.빨간망또 = 1; // this. 이 생략
		System.out.println("SuperMan 기본 생성자");
		// 멤버변수를 가르키는 this
//super.name = "헐";//부모를 가르키는 키워드 

	}

	// Person클래스의 확장판 기존에 있던것에 기능을 추가
	// Person 클래스의 변수 메서드를 가지고 있음
	SuperMan(String name, int age, int 빨간망또) {
		super(name,age); //부모의 매개변수 생성자를 호출한다 
		this.빨간망또 = 빨간망또;
		System.out.println("SuperMan 매개변수 3개짜리 생성자 ");
	}

	public void 비행하기() {
		System.out.println("슈우우웅 ~~~~");
	}

	public void 레이저발사() {
		System.out.println("지지이이잉~~");
	}

}
