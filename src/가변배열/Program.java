package �����迭;

import java.util.Scanner;

import test3.Exam;

public class Program {
	
	
	public static void main(String[] args) {
		GList<Exam> list = new GList();
		//Ÿ���� ������ �ش�Ÿ���� ����Ҽ��ִ� Ŭ������ �ٲ�
		//GList <Integer> list = new GList();
		//list.add(2); �� ���� �� ����
		
		list.add(new Exam());
		//������ ��� ���� �����ϼ��ִ� 
		//���� �Լ��� ����Ϸ��� ������ ��ȯ�ؾ� �Ѵ� 
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
		//�ε����� ����  �� �������� ���� 
      for (int i = 0; i < list.size(); i++) {
    	  System.out.println("data:" + list.get(i));
	  }
	}

	private static void input(ObjectList list) {
	Scanner sc = new Scanner(System.in);
	System.out.print("�Է�:");	
	list.add(sc.nextInt());
	}
}
