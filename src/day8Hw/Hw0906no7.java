package day8Hw;

public class Hw0906no7 {
	public static void main(String[] args) {
		String str = "java oracle";
		//String 클래스 메서드 정리
		
		//4번째 문자(배열의 인덱스)
		char ch =  str.charAt(3);
		System.out.println(ch);
		
		String str2 ="월요일";
		
		//문자열의 연결
		String str3= str.concat(str2);
		//string클래스의 concat메소드 실행
		System.out.println(str3);
		
		String str4 = "오늘은".concat("금요일");
		System.out.println(str4);
		
		//매서드 연결...
		//매서드 체인닝 
		String msg = "오늘은".concat("금요일")
				.concat("내일은")
				.concat("토요일")
				.concat("다음은")
				.concat("일요일");
		//메서드에 메서드를 연결해서 사용 고급개발
		
		System.out.println(msg);
		
		//문자가 있으면 true 없으면 false
		boolean flag = str.contains("java");
		System.out.println(flag);
		
		
		//equalsIgnoreCase():
		//대문자 소문자를 무시하고 비교한다
		boolean isSame= 
				str.equalsIgnoreCase("JAVA ORACLE");
		System.out.println(isSame);
		
		//해당 문자의 위치를 리턴 
		//단 배열의 인덱스이므로 0부터
		
		int position = str.indexOf('r');
		System.out.println("r 위치:" + position);
		
		//문자열의 길이 : length()
		System.out.println(str.length());
		
		//문자열의 부분집합 : substring
		//substring(2,6) : 2번부터 6번 전까지 글자 
		
		String str5 = str.substring(2,6);
		System.out.println(str5);
		
		//문자열을 char배열로 리턴하는 메서드
		char[] ch2 = str.toCharArray();
		
		//배열을 반복사용해서 화면에 출력
		for (int i = 0; i < ch2.length; i++) {
			System.out.print(ch2[i]);
		}
		System.out.println();
		
		int a =20;
		
		//valueOf 메서드를 통해서 문자열 형변환
		String value = String.valueOf(a);
		
		System.out.println(value);
		
		//id + @ + 도메인: id 만 추출
		String email = "dagda@hanafos.com";
			
		//출력
		System.out.println(email.substring(0, email.indexOf('@')));
	}

}
