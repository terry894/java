package test4;

public class Rapper {
	public static void main(String[] args) {
		int x = 3;
		float y = 3.5f;
		char c = 'a';
		int n =10;
		Object[] data = new Object[5];
		data[0] = Integer.valueOf(x);//�ڵ�����ڽ� 
//		data[0] = new Integer(x);//�ڵ�����ڽ� 
		data[1] = y;
		data[2] = c;
		
		String s = Integer.toString(n); //���ڸ� ���������� �ٲ��� 
		System.out.println(n);
//		String s = String.valueOf(n);
		
//		int x = Integer.parseInt(s);//���ڿ��� ���ڷ� �ٲ���
		
		String kor_ = "40";
		String eng_ = "50";
		String math_ = "60";
		
		int kor = Integer.parseInt(kor_);
		int eng = Integer.parseInt(eng_);
		int math = Integer.parseInt(math_);
		
		int total = kor+eng+math;
		System.out.println(total);
		
		String name1 ="������";//������ ����� �� ��ü�� �ϳ��� ������� 
		String name2 =new String("������");
		System.out.println(name1 == name2); //��Ұ� �� 
		System.out.println(name1.equals(name2)); //���� �� 
		
		
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
//		 3 = ���ڻ�
//		'3' = 51 �ƽ�Ű�ڵ�
//	    "3" = ���ڿ�
		
		String filename = "photo.png";
		System.out.println(filename.length());
		System.out.println(filename.indexOf("."));//���� �ִ� ��ġ�� �˷��� 
		System.out.println(filename.substring(0, 3));//0�������� 3����	
		System.out.println(filename.substring(0, filename.indexOf(".")));
		System.out.println(filename.split("\\.")[0]);
		String str = filename.replace('o', 't');//������ �ٲٴ°��� �ƴ϶� ���ο� ��ü ��ȯ
		System.out.println(str);
		
		
		
		

		
	}
}
