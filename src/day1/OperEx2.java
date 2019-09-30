package day1;
//산술 연산자
public class OperEx2 {
	//main 시작
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println(" a+b: " + a + b); // ""+ 하면 붙이는 연산자 결과는 1020
		System.out.println(" a+b: " + (a+b)); // 결과는 30
		System.out.println(" a-b: " + (a-b)); // 결과는 10
		System.out.println(" a*b: " + (a*b)); // 결과는 200
		System.out.println(" a/b: " + (a/b)); // 결과는 0 int자료형이기 때문에 소숫점 밑가지 출력 되지 않는다. 
		System.out.println(" a%b: " + (a%b)); // 결과는 10 나머지를 출력한다.
			
		
	}
}
