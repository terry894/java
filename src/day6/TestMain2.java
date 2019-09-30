package day6;

import java.util.Arrays;
//버블정렬
public class TestMain2 {
	static void bubleSort(int[] m) {//버블정렬  알고리즘 
		int temp = 0;
		for (int i = 1; i < m.length; i++) { 
        // 전체 반복 횟수
			for (int j = 0; j < m.length - i; j++) {
        // 한칸씩 줄여사면서 비교
				if (m[j] > m[j + 1]) { 
					temp = m[j];
					m[j] = m[j + 1];
					m[j + 1] = temp;
				}

			}
		}
	}
	
	public static void main(String[] args) {
		int[] m = { 23, 11, 3, 2, 9, 6 };// 배열 초기화
        // bubleSort(m);
		Arrays.sort(m);//정렬 자동지원 
		
		for (int i = 0; i < m.length; i++) {
			System.out.print(m[i] + "\t"); // 정렬한 수 출력 
		}

	}

}
