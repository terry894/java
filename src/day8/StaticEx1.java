package day8;

public class StaticEx1 {
	public static void main(String[] args) {//정적메소드 new하지않아도 접근가능함 어
		//public: 어디에서든 접근하능
		//static: 인스턴스없이 접근가능함
		//void: 리턴값이 없는
		//String[] args: args라는 문자열을 매개변수로 갖는다
//static변수와 메서드는 바로사용가능 SmartPhone.company
		SmartPhone.company = "하웨이";
		SmartPhone sp;
		System.out.println(SmartPhone.company);//new 하지않아도 이미 메모리에 올라옴 
	
		SmartPhone.playGame();
//		System.out.println(SmartPhone.productName);//접근불가
		SmartPhone sp1 = new SmartPhone("갤럭시 공책10", "010-1234-5678","삼쑹",1248500 );
		SmartPhone sp2 = new SmartPhone("갤럭시접어", "010-1111-5678","삼쑹",2248500 );
		
		sp1.send("010-2222-3333");
		
		System.out.println("제조회사: " + sp1.company);
		System.out.println("제조회사: " + sp2.company);
		
		sp1.company="엘쮜";
		
		
		System.out.println("----------------------");
		//인스턴스는 여러개여도 static 변수는 공용으로 하나 사용 
		System.out.println("제조회사: " + sp1.company);
		System.out.println("제조회사: " + sp2.company);
		
	}
}
