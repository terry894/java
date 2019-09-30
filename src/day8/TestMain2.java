package day8;

public class TestMain2 {
	 public static void main(String[] args) {
		 //Police p 만 쓰면 steak p 공간에 null
		 //NULLpointException 애러 참조값을 찾아갈수없다 
		 //밑에애러부터 봐야한다 
		 //찾아가보면 참조변수 값이 null 임 
		 //stack last in first out
		 Gun g = new Gun();
		 SniperGun s = new SniperGun();
		 Bazooka b = new Bazooka();
		 
		 Police p = new Police(g);
		 //Police p = new Police(g); // 생성자를 통해 참조변수 지급  
		 p.setW(b); // 나중에 지급해 주고 싶을때 setter사용 
		 p.attack();
		 
		 
		 p.setW(s);
		 p.attack();

	
//		Gun g = new Gun();
//		 g.fire();
//		 g.fire();
//		 g.fire();
//		 g.fire();
//		 g.fire();
//		 g.fire();
//		 g.fire();
//		 g.fire();
//		 g.fire();
//		 g.fire();
//		 g.fire();
//		 g.fire();
//		 g.fire();
//		 g.reload();
//		 g.fire();
//		 g.fire();
//		 g.fire();
	}

}
