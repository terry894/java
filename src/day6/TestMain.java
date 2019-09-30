package day6;
//import day5.Marine;//5일자 패키지의 클래스를 호출
//main에 Marin하고 ctrl + shift + 5 해야함 

public class TestMain {
	public static void main(String[] args) {
//      day5.Marine m; 이런식으로도 사용가능	
		Marine m1 = new Marine(); // marine의 참조 변수 m1 
		Marine m2 = new Marine(); // marine의 또다른 참조변수 m2 
		Medic me = new Medic();   // Medic의 참조 변수 me
		
		System.out.println("m2 :" + m2); // m2의 주소값 출력
		m1.공격하기(m2);  //m1 메서드 attack이 실행되어 m2의 hp를 깍는 역할
		m2.status();
		
		me.치료하기(m2); //me 메서드 heal이 실행되워 m2의 hp를 회복
		m2.status();
		
		m1.공격하기(me); // m1이 attack을 사용해서 me의 hp를 깍는다
		me.status();
	
		
		
		//medic
		//마린과  생성자 동일 치료하기 메서드 , 치료력
		
								
	}
}
