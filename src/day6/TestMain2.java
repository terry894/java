package day6;

import java.util.Arrays;
//��������
public class TestMain2 {
	static void bubleSort(int[] m) {//��������  �˰��� 
		int temp = 0;
		for (int i = 1; i < m.length; i++) { 
        // ��ü �ݺ� Ƚ��
			for (int j = 0; j < m.length - i; j++) {
        // ��ĭ�� �ٿ���鼭 ��
				if (m[j] > m[j + 1]) { 
					temp = m[j];
					m[j] = m[j + 1];
					m[j + 1] = temp;
				}

			}
		}
	}
	
	public static void main(String[] args) {
		int[] m = { 23, 11, 3, 2, 9, 6 };// �迭 �ʱ�ȭ
        // bubleSort(m);
		Arrays.sort(m);//���� �ڵ����� 
		
		for (int i = 0; i < m.length; i++) {
			System.out.print(m[i] + "\t"); // ������ �� ��� 
		}

	}

}
