package day3;

public class ArrayEx1 {
	public static void main(String[] args) {
		// �迭: apt�� ����
		// ������ ȿ����
		// ������ ����� ���ӵ� ������ �Ҵ�Ǵ� ���� stack
		// �ڷ��� [] ������
		int[] m;// stack�̶� ��ҿ� 32bit(�׻� ����)ũ���� ������ ���� m�� �ּҸ� ����Ŵ �ּҰ��� ���
		m = new int[3]; // heap�� intũ���� ����3���� ���� ����
		System.out.println(m); // ���� �ִ� ���� �ּҰ��� ������ �ִ� ���� : ���� ����
		System.out.println(m[0]);// �ڷ����� �⺻�� - 0���� ����� ��

		// �ּ� ctrl + /
		// ������ �ּ� ctl + shift + /
		// �ּ����� ctl + shift + \
		System.out.println("m.length: " + m.length); // m.length �迭�� ũ�⸦ �˷���

		for (int i = 0; i < m.length; i++) { // for ���� Ȱ���� �ݺ����� ������
			m[i] = (i + 1) * 10; // m[1] , m[2] , m[3] �� 10, 20, 30�� ���� ����
			System.out.println("m[" + i + "]" + m[i]);
		}

		m[0] = 10; // �迭�� ���� �� ����
		m[1] = 20;
		m[2] = 30;
		System.out.println(m[0]);
		System.out.println(m[1]);
		System.out.println(m[2]);

		int k[] = new int[3];//k �迭�� ũ�⸦ 3���� ���� 
		for (int i = 0; i < k.length; i++) { //k�� ���� ��ŭ �ݺ��ؼ� ���� 
			k[i] = (3 - i) * 10; //k[0]30 k[1]20....
			System.out.println("k[" + i + "]" + k[i]);
		}

		System.out.println("--------------");
		// �迭 �ʱⰪ ���� 
		int[] d = {41, 29, 36};//�Է��ϴ� ���� �������� ������ �ʱⰪ ���� 
		for (int i = 0; i < d.length; i++) {
			System.out.println(d[i]);
			
		}

//		d[0] = 41;
//		d[1] = 29;
//		d[2] = 36;

	}
}
