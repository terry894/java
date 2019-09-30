package day3;

import java.util.Scanner;//ctrl + shift + o : import를 추가하거나 삭제 할수있다.

public class StatementEX11 {
	public static void main(String[] args) {
		// 사용자로부터 태어난 연도를 입력받아 어떤띠 인지 맞추는 프로그램
		
		
        // 어떤 띠 인지 맞추는 프로그램 작성 
		
		// 4 5 6  7 8  9 10  11 0 1 2 3
		// 자  축  인  묘  진    사    오    미   신  유  술  해
		// 쥐  소  호  토  용    뱀    말    양   원  닭  개  돼
		
		Scanner sc = new Scanner(System.in);
		System.out.println("연도를 입력하세요");
		int num = sc.nextInt(); // 연도를 입력 받는다 
		int a = num%12;// 입력받은 값을 12로 나눈후 나머지 값이 변수 a 에 들어간다
		System.out.println(a); 
		
		switch(a){ //입력받은 값에 따라 해당하는 내용을 출력
		   case 0:
		      System.out.println("원"); //나머지가 0이면 원 출력
		      break;
		   case 1:
			      System.out.println("닭");//나머지가 1이면 닭 출력
			      break;// 실행하고 빠져나간다 
		   case 2:
			      System.out.println("개");//나머지가 2이면 개 출력
			      break;
		   case 3:
			      System.out.println("돼");
			      break;
		   case 4:
			      System.out.println("쥐");
			      break;
		   case 5:
			      System.out.println("소");
			      break;
		   case 6:
			      System.out.println("호");
			      break;
		   case 7:
			      System.out.println("토");
			      break;
		   case 8:
			      System.out.println("용");
			      break;
		   case 9:
			      System.out.println("뱀");
			      break;
		   case 10:
			      System.out.println("말");
			      break;
		   case 11:
			      System.out.println("양");
			      break;
			     
		
		   
		}
	}
}
