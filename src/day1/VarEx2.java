package day1;

public class VarEx2 {
	public static void main(String[] args) {
		byte b1 = 10;
		byte b2 = 20;
		int c = b1 + b2 ; //자료형이 담을수 있는 데이터가 넘치면 오버플로우 발생 따라서 더 큰 자료형에 담아야 한다.
		System.out.println(b1 + b2); // 결과 값 30
		System.out.println("-----");
		int a = 100;
		long b = 20011111111L; //long형 변수에 1233L처럼 long형상수를 넣음
		//형변환 (자료형) 
		int k =(int)(a + b); //큰 자료형을 작은 자료형에 담으면 오버플로우 발생 
		//강제로 형변환하면 짤리는 데이터 값의 경우 데이터가 깨짐
	}
}
