package day5;

public class MethodEx11 {
	static int getMaValue(int[] a){
		int max =0;
		for (int i = 0; i < a.length; i++) { //최댓값을 추출 하는 방법 
				if (max < a[i])
				{
					max = a[i]; // a[i]가 더크다면 max에 a[i]값을 대입 
				}			
		}
		return max;
	}
	
	public static void main(String[] args) {
		int[] m = {22,25,22,11,77,66};
		int value = getMaValue(m); // 배열의 참조값을 주면 그 배열에서 가장 큰값을 뽑아줌
		System.out.println("최대값" + value );
	}

}
