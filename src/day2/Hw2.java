package day2;

public class Hw2 {
	public static void main(String[] args) {
		int sum = 0;

		for (int i = 1; i < 101; i+=2) {
			// sum = sum + i
			sum += i;
		}
		System.out.println("1���� 100�� Ȧ�� ������ : " + sum);
	}
}
