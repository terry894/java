package ����;

public class Program {
	
	
	public static void main(String[] args) {
		
		try {
			Thread.sleep(1000);
		int sum = Calculater.add(10004,3);
		System.out.printf("sum:%d\n",sum);
		}
		//Ū���ϰ� ó���� ���ܴ� �տ� �;��Ѵ�
		
		catch(�ʹ�Ŀ�� e) {
			System.out.println("aaa"+e.getMessage());
			//������ �ݾƾ� �ϴ��ڵ� �� �ʿ� 
			//�޼����� ������� e.getMessage()�� ���ؼ� return�� ����
			
		}
        catch(Exception aaa) { //��� ���ܸ� �Ѳ�����  ���⼭ ó�� 
	    	System.out.println("�˼�");
	    } 
		finally {
			System.out.println("finally");
		}//� ���ܰ� �߻��ϵ� �����İ��� �� 
		
		
		System.out.println("����");
	}
}
