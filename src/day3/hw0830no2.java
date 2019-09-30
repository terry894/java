package day3;

public class hw0830no2 {
	
	public static void main(String[] args) {
		int sum =0;
	 for (int i = 0; i < 7; i++) {
		if ( i % 2 != 0 && i%3 !=0)
		{
			sum += i;	
		} 
	}
		System.out.println(sum);
	}

}
