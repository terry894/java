package day4;

public class MethodEx8 {
	static int add(int ... m)//add메소드 오버로딩
	//m이 배열의 역할
	//가변인자 메서드 - 값이 정해져있지 않고 여러개가 들어올때 처리하기 위해서
	{
		int sum =0;
		for (int i = 0; i < m.length; i++) {
			sum += m[i]; //배열 형식으로 값을 더해야 된다.
			
		}
		return sum;
	}
//	static int add(int a, int b, int c)
//	{
//		return a+b+c;
//	}
//	
//	static int add(int a, int b, int c, int d, int e)
//	{
//		
//		return a+b+c+d+e;
//		
	public static void main(String[] args) {
		System.out.println(add(100,200)); // return 값이 바로 출력됨 
		System.out.println(add(100,200,300)); // return 값이 바로 출력됨 
		System.out.println(add(100,200,300,400,500));
	}

}
