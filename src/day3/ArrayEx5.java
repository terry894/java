package day3;

public class ArrayEx5 {
	
	public static void main(String[] args) {
		int [][] m = {//2차원 배열 초기화
				{2,1,7},//4행 3열 배열
				{4,1,3},
				{2,6,9},
				{4,7,1}
		};
		//4행 3열 
		
		for (int i = 0; i < m.length; i++) { // 행의 크기만큼 반복
			for (int j = 0; j < m[i].length; j++) { // 열의 크키만큼 반복 
				System.out.print("m["+i+"]"+"["+j+"]"+m[i][j]+" ");
			}
			System.out.println();
		}
	}

}
