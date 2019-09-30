package day2;

public class StatementEx6 {
	public static void main(String[] args) {
		//2단출력
		for(int j = 2 ; j <=9 ; j++) { // 이중 for문 
			for (int i = 1; i <= 9; i++) { 
				System.out.println(j+" * " + i + " = " + (j * i));
				//2*1 , 2*2, 2*3 .. 으로 결과값이 샐행된다.
			}
		}
	}
}
