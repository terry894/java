package day4;

public class Hw0920no2 {
	
	static int minus(int a , int b)
	
	{
	return a-b;
	}
	
    static int minus(int a , int b, int c)
	{
	return a-b-c;
	}
	static float minus(float a, int b)
	{
		return a-b;	
	}
	public static void main(String[] args) {
		System.out.println(minus(200,100)); // return 값이 바로 출력됨 
		System.out.println(minus(100.0f,100));
		System.out.println(minus(300,200));
		System.out.println(minus(500,300,200));
	}
}
