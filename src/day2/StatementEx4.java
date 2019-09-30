package day2;
//반복문

//for문
//while문
//while(조건) {
//문장;}




public class StatementEx4 {
	public static void main(String[] args) {
      int i = 0;  //변수 i 초기화 
      while( i<9) // 조건식을 만족할때 까지 안에 문장을 반복 
      {
    	  i++; // i 값 1 증가 
    	  System.out.println("3 * "+ i + "=" + (3*i)); // 3단 출력
      }
	}
}
