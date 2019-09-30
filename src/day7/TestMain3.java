package day7;
//class :모두 사용자 정의형 type
//클래스가 다른 클래스라면 참조값을 줄수 없다.
//
public class TestMain3 {
	public static void main(String[] args) {
		Parent p1 = new Parent();
		System.out.println(p1.name);//parent name에 아무것도 안들어가 있기 때문에 일단 null
		
		p1.잔소리하기();
		p1.노래부르기();
		System.out.println("--------------------");
		Child c1 = new Child();
		System.out.println(c1.name);
		
		c1.노래부르기();
		c1.잔소리하기();
		c1.클럽가기();
		
		Marine m1 = new Marine();
		//m1 = p1; p1에 잇는 참조값이 m1에 할당되어 m1은 p1의 참조값을 가지게 된다.이렇게 쓸수없다
		Parent p2;
		p2 = p1;//같은 클래스끼리는 참조값을 줄수 있음 
		p2.노래부르기();
		
		Parent p3;
		p3 = c1; //부모자식관계는 자식의 참조값을 부모에게 줄수잇다
		p3.노래부르기();//자식의 메소드가 호출된다 
		//c1=p1 자식의 참조변수에 부모의 참조값을 담을 수 없디
		//왜냐하면 c1.클럽가기()라는 메소드를 실행해야하기때문 자식에게는  클럽가기라는 메소드가 있는데 제거는 불가능 
		
//		Child c2;
//		p2 = c1 ;
//		c2 = (Child)p2; //강제 형변환을 통해 사용가능하게함 
//		c2.클럽가기();
		
	
	}
	
	
}
