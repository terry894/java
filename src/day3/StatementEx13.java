package day3;
//break �� : ���� �پ��ִ� �ݺ��� Ż�� 
//continue �� : �󺧸��� �پ��ִ� �ݺ������� �̹��� ���� 

public class StatementEx13 {
	public static void main(String[] args) {
		outer: // �ٱ��� for���� �̸� ����
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				if(i==j) continue outer; //break ���� ����� �ݺ����� Ż�� continue �ش� ��Ȳ�� ��ŵ! i==j�� ��Ȳ�� print�� ��µ��� ����  
				//
				System.out.println("i:" + i + ", j=" + j);
				//continue 1,2 1,3 1,4 2,1 2,3 2,4...
				//break 2,1 3,1 3,2 4,1 4,2 4,3
			}
		}
	}
}
