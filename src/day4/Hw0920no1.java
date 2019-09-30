package day4;

public class Hw0920no1 {
	static int add(int[][] a, int[][] b) 
	{
		int c[][] = new int[b.length][b[1].length];
		//2차원 배열 선언 int[][]
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				c[i][j] = a[i][j] + b[i][j];			
			}
		}	
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
		 
		return 0;
	}
	
	public static void main(String[] args) {
		int a[][] ={
				{3, 2, 3},
				{4, 5, 6},
                {1, 4, 9}
				};
		int b[][] = {
				{1, 8, 7},
				{6, 4, 4},
				{3, 2, 3}				
		};
		add(a,b);
		}
	}





