package day8;
//������
public class StringEx1 {
	public static void main(String[] args) {
     String str = new String("java");
     String str1 = new String("java"); //new��¿����ڸ� ���� ���� ������ش�
     
     if(str == str1) {
    	 System.out.println("���ϰ�ü");
     }
     else {
    	 System.out.println("�ٸ���ü");
     }
     
     if(str.equals(str1))
     {	 System.out.println("�����ѳ���");
	}else {
		System.out.println("�ٸ� ����");
	}
     //�ּҾ��
     System.out.println(str1.getClass().getName() + '@' + Integer.toHexString(str1.hashCode()));
     
     
     System.out.println("---------------------");
     
     String str3 ="java";
     String str4 ="java"; //�⺻������ ����� ������ ��ü
     
     if(str == str1) {
    	 System.out.println("���ϰ�ü");
     }
     else {
    	 System.out.println("�ٸ���ü");
     }
     System.out.println(str1.getClass().getName() + '@' + Integer.toHexString(str.hashCode()));
     System.out.println(str1.getClass().getName() + '@' + Integer.toHexString(str1.hashCode()));
     
     
     if(str3.equals(str4)) {
    	 System.out.println("������ ����");
     }
     else {
    	 System.out.println("�ٸ����� ");
     }
     
     str4="ORACLE";
     
     System.out.println(str3);
     System.out.println(str4);
     
     String str2 ="*";//heap ������ string Ŭ���� �޼ҵ� 11�� ���� 
     
//     for(int i=0; i<100; i++) {// 11���� 100������  �޸� ���� �ӵ� ������ 
//    	 str+= "*";
//     }
//    		 
     //. Ŭ�������� �����ִ� �޼ҵ带 ������
     
     
     //String�� ������ �̷��� ���������� 
     //���Ǹ� ���ؼ� �⺻�� ó�� ����ϰ� �ٲ���� String str ="sad";
     //System.out.println(str.toString());
     //������ str�� �ּҰ� ���;� ������ toString()�޼ҵ带 �̿��ؼ� "java"��� 
     //toString �޼����  object Ŭ������ �ִ� �� �������̵� �Ѱ� 

	}
}
