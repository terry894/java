package day3;

public class VarPrint {
	public static void main(String[] args) {
		int year  = 2019;
		int month = 8;
		int day = 30;
		
		System.out.println(year +"년"+month+ "월" + day +"일");//java형식 출력
		System.out.printf("%d년%d월 %d일", year,month,day);//c형식 출력 
 	}
}
