package day7;

public class Child extends Parent{
	Child(){
		//overriding물려는 받앗는데 새롭게 다시씀
		super();//부모의 기본 생성자 호출 
		System.out.println("Child클래스의 기본 생성자");
	}
	@Override//메소드이름이 잘못된 경우를 방지하기위해서 사용
	//컴파일러가 해당메소드가 잇는지 부모로 가서 찾아본다.
	//사용후 이름이 틀리면 애러발생
	//annotation이라고 한다 
	public void 노래부르기() {
		
		System.out.println("DNA~~~~~");
	}
	public void 클럽가기() {
		System.out.println("쿵짝쿵짝");
	}
}
