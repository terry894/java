package day3;

public class ArrayEx4 {
	public static void main(String[] args) {
      int[][] b = new int[3][2];// ���� �� �� �� �� 3�� 2�� 
      //2���� �迭�� stack�� ���� �޸� ������ 4byte, b�� 0,1,2�� ���� �ּҰ��� ������ 
      System.out.println("b:" + b);// �������� ���� 
      System.out.println("b[0]" + b[0]); // 1���� ������
      System.out.println("b[0][0]" + b[0][0]); // ���� �����Ͱ� �ִ� ��� 
      System.out.println("b[1]" + b[1]); // 2���� ������
      System.out.println("b.length" + b.length);//���� ũ�� b�� ����Ű�� �޸��� ũ�� 
      System.out.println("b[0].length" + b[0].length);//���� ũ�� b[0]�� ����Ű�� �޸��� ũ�� 
      
      
//      b[0][0] = 10;
//      b[0][1] = 20;
//      b[1][0] = 30;
//      b[1][1] = 40;
//      b[2][0] = 50;
//      b[2][1] = 60;
//      
      
      
      int cnt =1 ;
      for (int i = 0; i < b.length; i++) { //���� �ٱ��� for��
    	  for (int j = 0; j < b[i].length; j++) {//���� ���� for����
    		  b[i][j] = 10 *cnt;//2���� �迭�� 10,20,30 �� �Ҵ� 
    		  System.out.print(b[i][j]); // 2���� �迭�� 0,0 0,1 1,0 1,1 ������ ��� 
    		  System.out.print("  i:"+ i + "j:" + j+"  ");
    		  cnt++;
		}
    	  System.out.println();
		
	}
		/*
		 * System.out.println(b[0][0]); System.out.println(b[0][1]);
		 * System.out.println(b[1][0]); System.out.println(b[1][1]);
		 * System.out.println(b[2][0]); System.out.println(b[2][1]);
		 * 
		 */
 	}
}
