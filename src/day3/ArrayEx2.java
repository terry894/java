package day3;
// 배열 : 같은 타입의 데이터를 하나의 이름으로 
// 묶어서 처리해 주는 기능 
//참조형 변수 : 주소(참조값)
//배열의 인덱스를 사용해서 배열의 각 요소에 접근 
//인덱스의 번호는 0번 부터 
//배열과 일반 변수와의 구분 [] 여부
//자료형[] 변수명 - int[] m;
//자료형 변수명[]- int m[];
//배열을 선언 만 하면 메모리에 생성은 되지만 값을 담을수 있는 요소는 만들어지지 않음 
//new 연산자에 의해서 배열 요소가 생성되어진다.
//
public class ArrayEx2 {
	public static void main(String[] args) {
	int c[] = new int[5];
	//c 배열의 길이를 출력
	System.out.println("c 배열의 길이:" + c.length);
	
	
	for(int i = 0 ; i<c.length ; i++)// for + ctl +space +enter :자동완성
	{
		c[i] = (i+1)*10; // 배열 [0][1][2][3][4][5] 에 10 20 30 40 50 을 대입 
		System.out.println(c[i]);
	}

	System.out.println("----------------");
	

	} 

}
