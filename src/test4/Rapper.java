package test4;

public class Rapper {
	public static void main(String[] args) {
		int x = 3;
		float y = 3.5f;
		char c = 'a';
		int n =10;
		Object[] data = new Object[5];
		data[0] = Integer.valueOf(x);//자동오토박싱 
//		data[0] = new Integer(x);//자동오토박싱 
		data[1] = y;
		data[2] = c;
		
		String s = Integer.toString(n); //숫자를 문자형으로 바꿔줌 
		System.out.println(n);
//		String s = String.valueOf(n);
		
//		int x = Integer.parseInt(s);//문자열을 숫자로 바꿔줌
		
		String kor_ = "40";
		String eng_ = "50";
		String math_ = "60";
		
		int kor = Integer.parseInt(kor_);
		int eng = Integer.parseInt(eng_);
		int math = Integer.parseInt(math_);
		
		int total = kor+eng+math;
		System.out.println(total);
		
		String name1 ="아이유";//아이유 상수로 된 객체는 하나만 만들어짐 
		String name2 =new String("아이유");
		System.out.println(name1 == name2); //즈소값 비교 
		System.out.println(name1.equals(name2)); //값을 비교 
		
		
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
//		 3 = 숫자삼
//		'3' = 51 아스키코드
//	    "3" = 문자열
		
		String filename = "photo.png";
		System.out.println(filename.length());
		System.out.println(filename.indexOf("."));//쩜이 있는 위치를 알려줌 
		System.out.println(filename.substring(0, 3));//0에서부터 3글자	
		System.out.println(filename.substring(0, filename.indexOf(".")));
		System.out.println(filename.split("\\.")[0]);
		String str = filename.replace('o', 't');//원본을 바꾸는것이 아니라 새로운 객체 반환
		System.out.println(str);
		
		
		
		

		
	}
}
