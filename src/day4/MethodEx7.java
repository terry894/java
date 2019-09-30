package day4;
//메소드 오버로딩  (오버로딩 - 다중정의) 
//이름은 같지만 타입이나 수가 다른것을 오버로딩 이다.
//add(100);
//add(100, 200);
//add(100, 300.0f, 200);
//쓰는사람이 자료형에 신경쓰지 말고 원하는 대로 출력하기 위해 ex)println()
public class MethodEx7 {
	static int arraySum(int[] m) // 지역변수로 다른 메모리 공간을 쓰기 때문에 이름을 같게 해도된다.
	//배열을 전달받을때 매개변수도 int[] 처럼 배열로 선언해야됨 
	{
		int sum =0 ; 
		for (int i = 0; i < m.length; i++) {
			sum +=m[i];
		}
		return sum; // 배열안에 있는 값의 합을 반환 
	}
	static float arrayAvg(int[] m) {
//		int sum =0 ;
//		for (int i = 0; i < m.length; i++) {
//			sum +=m[i];
//		}// sum에 배열안에 있는 값의 합을 넣음 
//		return (float)sum/m.length; //(형변환) cast 연산자 
	 return arraySum(m)/(float)m.length; // 메소드를 이용해 간결하게 표현 
	}
	public static void main(String[] args) {
		int[] m = {10,20,30,40,50}; // 배열 선언
		
		int sum = arraySum(m); // 반환받은 값이 변수 sum에 들어감 
		
		float avg = arrayAvg(m); 
		System.out.println("배열요소의 합계:" + sum); //sum값 출력
		System.out.println("배열요소의 평균:" + avg); //avg값 출력
	}

}
