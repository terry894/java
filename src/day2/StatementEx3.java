package day2;

import java.io.IOException;
//����ڷ� ���� �Է¹ޱ�
public class StatementEx3 {
	
	public static void main(String[] args) throws IOException {
		/*System.out.println("���ڸ� �Է��ϼ���");
		int dan = System.in.read();
		dan -= 48; // 0 �ƽ�Ű �ڵ� ���� 48 �̱⶧���� 
		System.out.println(dan); // �Է��Ѵ�� ���ڸ� �������� ���ؼ� - 48�� �Ѵ�.
		*/
		System.out.println("���ڸ� �Է��ϼ���");
		int dan = System.in.read(); //dan�� ����ڰ� �Է��� ���� ���� 
		dan -= 48;
		for ( int i = 1 ; i <=9; i++ )
		{	
			System.out.println(dan+ " * "+i+"="+ (dan*i)); // �Է¹��� ������ ������ ��� 
		}
	}
}

