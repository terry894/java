package day9;
//import java.lang.StringBuffer; �� �����Ǿ��ִ� 

public class StringBufferEX {
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		//�����ͺ��̽� �������� ����Ѵ�
		sb.append("SELECT *");
		sb.append("FROM emp *");
		sb.append("WHERE deptmo=10 *");
		//append�� ����ϸ� �޸𸮸� �� �����ʰ� �̾ ���ڿ� ���� 
		System.out.println(sb.toString());
		
		System.out.println(sb.reverse());
		//���ڿ� ����
	}
}
