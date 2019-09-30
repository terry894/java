package day9;
//import java.lang.StringBuffer; 가 생략되어있다 

public class StringBufferEX {
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		//데이터베이스 쿼리문에 사용한다
		sb.append("SELECT *");
		sb.append("FROM emp *");
		sb.append("WHERE deptmo=10 *");
		//append를 사용하면 메모리를 더 쓰지않고 이어서 문자열 생성 
		System.out.println(sb.toString());
		
		System.out.println(sb.reverse());
		//문자열 반전
	}
}
