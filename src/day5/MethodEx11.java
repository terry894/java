package day5;

public class MethodEx11 {
	static int getMaValue(int[] a){
		int max =0;
		for (int i = 0; i < a.length; i++) { //�ִ��� ���� �ϴ� ��� 
				if (max < a[i])
				{
					max = a[i]; // a[i]�� ��ũ�ٸ� max�� a[i]���� ���� 
				}			
		}
		return max;
	}
	
	public static void main(String[] args) {
		int[] m = {22,25,22,11,77,66};
		int value = getMaValue(m); // �迭�� �������� �ָ� �� �迭���� ���� ū���� �̾���
		System.out.println("�ִ밪" + value );
	}

}
