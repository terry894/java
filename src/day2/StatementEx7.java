package day2;

public class StatementEx7 {
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {//int i 는 지역변수 해당 범위는 괄호 안
			for (int j = 1; j <= 4; j++) {//int j 는 지역변수 해당 범위는 괄호 안
				System.out.println("i=" + i + "j=" + j);
			}
		}
	}
}
 /* 1,1  1,2  1,3  1,4  2,1  2,2  2,3  2,4  3,1  3,2  3,3  3,4  4,1  4,2  4,3  4,4*/