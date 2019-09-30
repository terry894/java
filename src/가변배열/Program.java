package 가변배열;

import java.util.Scanner;

import test3.Exam;

public class Program {
	
	
	public static void main(String[] args) {
		GList<Exam> list = new GList();
		//타입을 넣으면 해당타입을 사용할수있는 클래스로 바뀜
		//GList <Integer> list = new GList();
		//list.add(2); 를 담을 수 잇음
		
		list.add(new Exam());
		//모든것을 담는 것은 단점일수있다 
		//서비스 함수를 사용하려면 형식을 변환해야 한다 
//		((Exam)list.get(2)).input();
		list.get(2).input();		
		
//		Object[] data = new Object[3];
//		int cnt = 0;
		int exit = 0;
		Scanner sc = new Scanner(System.in);
		
			do {
//		input(data,cnt);
//		input(list);
//		cnt ++;
//    	System.out.println("index:"+cnt);
//		print(data, cnt);
//    	print(list);
		System.out.println("go?(1or0):");
		exit = sc.nextInt();

     	}while(exit != 1);  
			
	}

	private static void print(ObjectList list) {
		//인덱스의 값이  곧 데이터의 개수 
      for (int i = 0; i < list.size(); i++) {
    	  System.out.println("data:" + list.get(i));
	  }
	}

	private static void input(ObjectList list) {
	Scanner sc = new Scanner(System.in);
	System.out.print("입력:");	
	list.add(sc.nextInt());
	}
}
