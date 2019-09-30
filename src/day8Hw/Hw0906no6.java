package day8Hw;

public class Hw0906no6 {
	public static void main(String[] args) {

		Object str2 = new Object();
		String str = new String("java");
		String str1 = new String("java"); 

		if (str.equals(str1)) { 
			// String 클래스에서 오버라이딩 하기때문에 object클래스의 equals메서드와 차이가 있다
			//str 참조변수의 내용과 str1 참조변수의 내용을 비교한다
			System.out.println("동일한내용");
		} else {
			System.out.println("다른 내용");
		}
		
		System.out.println(str.toString());
		//할경우 str의 주소값이 나와야 하지만 
		//toString()메서드를 이용해서 내용 "java" 출력
		//object 클래스에서 오버라이딩 하여 사용했다.
		System.out.println(str2.toString());


	}
}
