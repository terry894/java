package day1;

public class VarEx3 {
public static void main(String[] args) {
	char c1 = 97;
	char c2 = 'a';
	char c3 = '\u0061'; // 유니코드 값이 들어감 
	//" - 문자열 , ' - 글자  
	System.out.println("c1 " + c1); // alt + 화살표 방향으로  라인이동 
	System.out.println("c2 " + c2);  
	System.out.println("c3 " + c3); 
	//ctrl + alt + 화살표방향아래키 원래 화면 위아래로 바뀜 하지만 복사로 수정
	//ctrl +/ 해당 라인 주석

	
	//char c4 = 'ab'; 는 안됨 
	char m1 = 'J'; // char 자료형 변수 m1 에 문자 J 할당
	char m2 = 'A';
	char m3 = 'V';
	char m4 = 'A';
	
	System.out.println(""+m1+m2+m3+m4);
//	System.out.println(""+m1+m2+m3+m4); // ""+ 를 추가해야 문자로 나옴 
	String str = "Hello world"; // 문자열은 String 이라는 자료형으로 사용 
	System.out.println(str); // "Hello world"가 출력 됨 
	System.out.println("________");
	// 특수문자 
	// \n: 엔터의 의미,  \b: backpace, \t: tab, \\: \, \': ', \": "
	System.out.println("오늘은 \n 즐거운 \t 수요일입니다"); 
	/*오늘은 
	 즐거운    수요일 입니다 로 출력됨
	 */
	
	
	
 	
	
}
}
