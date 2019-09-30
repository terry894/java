package day7;

public class TestMain4 {
	public static void main(String[] args) {
		//Parent p1 = new Parent(); // stack - p1 heap - Parent메서드와 변수
		//Parent p1 ; // heap에 메모리 공간을 만들지 않기 위해
		//Child c1 = new Child(); c1이라는 참조변수 메모리 낭비
		//p1 = c1; // 이럴경우 p1 의 heap에 들어가 있는 메모리가 낭비 
		//Parent p1 = new Child(); // 상속관계일때 가능하다 c1이라는 참조변수 메모리 절약과 new Parent()-> heap 메모리 절약
		//g.c 더이상 참조받지 않는 메모리를 처리해줌
		//객체형변환 
		//Child c1 = new Child();
		//Parent p2;
		//p2=c1; //부모참조 변수에 자식의 참조값을 할당 
		//Child c2;
		//c2 = (Child)p2; // 자식은 부모의 참조값을 받을수 없지만 (Child)로 강제로 형변환해서 가능하게함  
		//c2.클럽가기();// 
		
		Terran t;
		Marine m = new Marine();		
		Medic me = new Medic();
		Ghost g = new Ghost();
		
//		t=m;
//		t.이동하기();
//		
//		System.out.println("------------");
//		t=me;
//		t.이동하기();
		SiegeTank st = new SiegeTank();
		//t=m;
		System.out.println(m);
		st.공격하기(m);
		st.공격하기(me);
		st.공격하기(g);
		
		me.치료하기(m);
		me.치료하기(me);
		me.치료하기(st);
		
	}

}
