package Game.����;

import java.awt.Frame;

public class program {
	public static void main(String[] args) {
		GameFrame game= new GameFrame();
//		
//		class A implements Runnable{//�̳�Ŭ����
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				
//			}
//		}//�ܼ��� Runnable�� ������ �������� class A ��� 
//		//�������̽� �����Ҷ� ���� ���� �� 
//		//��������
//		Thread th =new Thread(new Runnable() { //�͸�Ŭ����
//			//���ѹ��� �� �� ���� 
//			//�������� �̸� 'A'�� ����ϴ� ��� new (new Runnable() {}
//			//�� ��� ��� ������ �������̽��� new�� ���� �� �� ����.  
// 			@Override
//			public void run() {
//				printList();
//			}//���ο� �����忡�� printList();����  �񵿱�� 
//		});
//
//	 Thread th1 = new Thread(()->printList());//���ٽ� 
//	 //new Runnable �������̽����� 
//	 //���ο� ���ο��� �񵿱������ ���� System.out.printf("sub:%d\n",i+1);
//	 th1.start();
//	 //�������̽��� ������������ ���� �����ؼ� �������־���� 
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
