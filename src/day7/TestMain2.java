package day7;

public class TestMain2 {
	public static void main(String[] args) {
		Marine m = new Marine();
		Medic me = new Medic();
		SiegeTank st = new SiegeTank();
		
		st.공격하기(m);
		m.공격하기(me);
		//st.공격하기(me);
		
	}

}
