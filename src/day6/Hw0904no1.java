package day6;

public class Hw0904no1 {
	public static void main(String[] args) {
		int math;
		int english;
		int language;
		int sum =0;
		int avg =0;
		int[][] grade = {
				{80,80,80,0,0},
					{60,50,80,0,0},
					{50,90,90,0,0},
					{40,50,60,0,0},
					{90,90,95,0,0},
					{85,95,100,0,0}
		};
		
		for (int i = 0; i < grade.length; i++) {
			for (int j = 0; j < 3; j++) {
				 sum += grade[i][j];
				 avg = sum/3;
				 
				 
			}
		    grade[i][3] = sum;
		    grade[i][4] = avg;
			sum =0;
			avg =0;
 		}
		
		for (int i = 0; i < grade.length; i++) {
			for (int j = 0; j < grade[i].length; j++) {
				System.out.print(grade[i][j] + " ");
			}
			System.out.println();
		}
	}

}
