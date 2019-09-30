package day3;

public class ArrayEx4 {
	public static void main(String[] args) {
      int[][] b = new int[3][2];// 앞이 행 뒤 가 열 3행 2열 
      //2차원 배열도 stack에 들어가는 메모리 공간은 4byte, b의 0,1,2인 행의 주소값이 들어가있음 
      System.out.println("b:" + b);// 참조값이 나옴 
      System.out.println("b[0]" + b[0]); // 1행의 참조값
      System.out.println("b[0][0]" + b[0][0]); // 실제 데이터가 있는 장소 
      System.out.println("b[1]" + b[1]); // 2행의 참조값
      System.out.println("b.length" + b.length);//행의 크기 b가 가르키는 메모리의 크기 
      System.out.println("b[0].length" + b[0].length);//열의 크기 b[0]가 가르키는 메모리의 크기 
      
      
//      b[0][0] = 10;
//      b[0][1] = 20;
//      b[1][0] = 30;
//      b[1][1] = 40;
//      b[2][0] = 50;
//      b[2][1] = 60;
//      
      
      
      int cnt =1 ;
      for (int i = 0; i < b.length; i++) { //행을 바깥쪽 for문
    	  for (int j = 0; j < b[i].length; j++) {//열을 안쪽 for문에
    		  b[i][j] = 10 *cnt;//2차원 배열에 10,20,30 을 할당 
    		  System.out.print(b[i][j]); // 2차원 배열을 0,0 0,1 1,0 1,1 순서로 출력 
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
