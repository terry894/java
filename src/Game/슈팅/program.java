package Game.슈팅;

import java.awt.Frame;

public class program {
	public static void main(String[] args) {
		GameFrame game= new GameFrame();
//		
//		class A implements Runnable{//이너클래스
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				
//			}
//		}//단순히 Runnable을 구현할 목적으로 class A 사용 
//		//인터페이스 구현할때 제일 많이 씀 
//		//인터페이
//		Thread th =new Thread(new Runnable() { //익명클래스
//			//딱한번만 쓸 수 있음 
//			//쓸데없는 이름 'A'를 사용하는 대신 new (new Runnable() {}
//			//로 대신 사용 원래는 인터페이스를 new로 선언 할 수 없다.  
// 			@Override
//			public void run() {
//				printList();
//			}//새로운 쓰레드에서 printList();실행  비동기식 
//		});
//
//	 Thread th1 = new Thread(()->printList());//람다식 
//	 //new Runnable 인터페이스생략 
//	 //새로운 라인에서 비동기식으로 실행 System.out.printf("sub:%d\n",i+1);
//	 th1.start();
//	 //인터페이스는 정의하지말고 쉽게 구현해서 꽂을수있어야함 
//		for(int i=0; i<10;i++) {
//			System.out.printf("main:%d\n",i+1);
//		}
		//		Frame frame = new GameFrame();
	}
	

	private static void printList() {
		for (int i = 0; i < 10; i++) {
			System.out.printf("sub:%d\n",i+1);
		}
		
	}

}
