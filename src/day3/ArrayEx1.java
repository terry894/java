package day3;

public class ArrayEx1 {
	public static void main(String[] args) {
		// 배열: apt형 변수
		// 접근이 효율적
		// 동일한 사이즈에 연속된 공간에 할당되는 변수 stack
		// 자료형 [] 변수명
		int[] m;// stack이란 장소에 32bit(항상 같음)크기의 공간이 생김 m은 주소를 가르킴 주소값만 담김
		m = new int[3]; // heap에 int크기의 변수3개의 공간 만듬
		System.out.println(m); // 값이 있는 곳의 주소값을 가지고 있는 변수 : 참조 변수
		System.out.println(m[0]);// 자료형의 기본값 - 0으로 만드는 값

		// 주석 ctrl + /
		// 여러줄 주석 ctl + shift + /
		// 주석해제 ctl + shift + \
		System.out.println("m.length: " + m.length); // m.length 배열의 크기를 알려줌

		for (int i = 0; i < m.length; i++) { // for 문을 활용한 반복적인 값대입
			m[i] = (i + 1) * 10; // m[1] , m[2] , m[3] 에 10, 20, 30의 값을 대입
			System.out.println("m[" + i + "]" + m[i]);
		}

		m[0] = 10; // 배열에 직접 값 대입
		m[1] = 20;
		m[2] = 30;
		System.out.println(m[0]);
		System.out.println(m[1]);
		System.out.println(m[2]);

		int k[] = new int[3];//k 배열의 크기를 3으로 지정 
		for (int i = 0; i < k.length; i++) { //k의 길이 만큼 반복해서 실행 
			k[i] = (3 - i) * 10; //k[0]30 k[1]20....
			System.out.println("k[" + i + "]" + k[i]);
		}

		System.out.println("--------------");
		// 배열 초기값 설정 
		int[] d = {41, 29, 36};//입력하는 값이 연관성이 없을때 초기값 설정 
		for (int i = 0; i < d.length; i++) {
			System.out.println(d[i]);
			
		}

//		d[0] = 41;
//		d[1] = 29;
//		d[2] = 36;

	}
}
