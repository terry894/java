package day8Hw;

public class Hw0906no7 {
	public static void main(String[] args) {
		String str = "java oracle";
		//String Ŭ���� �޼��� ����
		
		//4��° ����(�迭�� �ε���)
		char ch =  str.charAt(3);
		System.out.println(ch);
		
		String str2 ="������";
		
		//���ڿ��� ����
		String str3= str.concat(str2);
		//stringŬ������ concat�޼ҵ� ����
		System.out.println(str3);
		
		String str4 = "������".concat("�ݿ���");
		System.out.println(str4);
		
		//�ż��� ����...
		//�ż��� ü�δ� 
		String msg = "������".concat("�ݿ���")
				.concat("������")
				.concat("�����")
				.concat("������")
				.concat("�Ͽ���");
		//�޼��忡 �޼��带 �����ؼ� ��� ��ް���
		
		System.out.println(msg);
		
		//���ڰ� ������ true ������ false
		boolean flag = str.contains("java");
		System.out.println(flag);
		
		
		//equalsIgnoreCase():
		//�빮�� �ҹ��ڸ� �����ϰ� ���Ѵ�
		boolean isSame= 
				str.equalsIgnoreCase("JAVA ORACLE");
		System.out.println(isSame);
		
		//�ش� ������ ��ġ�� ���� 
		//�� �迭�� �ε����̹Ƿ� 0����
		
		int position = str.indexOf('r');
		System.out.println("r ��ġ:" + position);
		
		//���ڿ��� ���� : length()
		System.out.println(str.length());
		
		//���ڿ��� �κ����� : substring
		//substring(2,6) : 2������ 6�� ������ ���� 
		
		String str5 = str.substring(2,6);
		System.out.println(str5);
		
		//���ڿ��� char�迭�� �����ϴ� �޼���
		char[] ch2 = str.toCharArray();
		
		//�迭�� �ݺ�����ؼ� ȭ�鿡 ���
		for (int i = 0; i < ch2.length; i++) {
			System.out.print(ch2[i]);
		}
		System.out.println();
		
		int a =20;
		
		//valueOf �޼��带 ���ؼ� ���ڿ� ����ȯ
		String value = String.valueOf(a);
		
		System.out.println(value);
		
		//id + @ + ������: id �� ����
		String email = "dagda@hanafos.com";
			
		//���
		System.out.println(email.substring(0, email.indexOf('@')));
	}

}
