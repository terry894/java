package day3;
//break 라벨 : 라벨이 붙어있는 반복문 탈출 
//continue 라벨 : 라벨명이 붙어있는 반복문에서 이번만 생략 

public class StatementEx13 {
	public static void main(String[] args) {
		outer: // 바깥쪽 for문에 이름 지정
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				if(i==j) continue outer; //break 가장 가까운 반복문을 탈출 continue 해당 상황만 스킵! i==j인 상황만 print문 출력되지 않음  
				//
				System.out.println("i:" + i + ", j=" + j);
				//continue 1,2 1,3 1,4 2,1 2,3 2,4...
				//break 2,1 3,1 3,2 4,1 4,2 4,3
			}
		}
	}
}
