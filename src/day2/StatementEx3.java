package day2;

import java.io.IOException;
//사용자로 부터 입력받기
public class StatementEx3 {
	
	public static void main(String[] args) throws IOException {
		/*System.out.println("숫자를 입력하세요");
		int dan = System.in.read();
		dan -= 48; // 0 아스키 코드 값이 48 이기때문에 
		System.out.println(dan); // 입력한대로 숫자를 내보내기 위해서 - 48을 한다.
		*/
		System.out.println("숫자를 입력하세요");
		int dan = System.in.read(); //dan에 사용자가 입력한 값이 들어간다 
		dan -= 48;
		for ( int i = 1 ; i <=9; i++ )
		{	
			System.out.println(dan+ " * "+i+"="+ (dan*i)); // 입력받은 값으로 구구단 출력 
		}
	}
}

