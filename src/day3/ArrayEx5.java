package day3;

public class ArrayEx5 {
	
	public static void main(String[] args) {
		int [][] m = {//2���� �迭 �ʱ�ȭ
				{2,1,7},//4�� 3�� �迭
				{4,1,3},
				{2,6,9},
				{4,7,1}
		};
		//4�� 3�� 
		
		for (int i = 0; i < m.length; i++) { // ���� ũ�⸸ŭ �ݺ�
			for (int j = 0; j < m[i].length; j++) { // ���� ũŰ��ŭ �ݺ� 
				System.out.print("m["+i+"]"+"["+j+"]"+m[i][j]+" ");
			}
			System.out.println();
		}
	}

}
