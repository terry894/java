package day6;
//로또뽑기 
//java가 32비트연산을 하기 때문에 short, int 도 똑같은 연산속도 하지만 메모리 낭비때문에 지정 
public class MethodEx10 {
	static void bubbleSort(int[] a)
	{ // 버블정렬
		int temp =0;
		for (int i = 0; i < a.length ; i++) { // 전체 정렬횟수
			for (int j = 1; j < a.length -i; j++) { // 정렬이 된 만큼 횟수를 줄인다
				//한 순서에 바꿀 횟수 
				if(a[j]>a[j-1])//제일  큰 수 를 맨뒤로 가게 정렬한다
				{
					temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
				}
				
			}
		}	
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			
		}
		
	}
	
	static void printGuGuDan(int b)
	{
		for(int i =1 ; i<=9 ; i ++) 
		{
			System.out.print(b+"*"+i+"="+(i*b)+" ");
		}
		System.out.println();//반환할 필요가 없다 
	}
	
	public static void main(String[] args) {
       //1.배열을  선언
		int[] m = {1,2,3,4,5,6,7,8,9,10,
				11,12,13,14,15,16,17,18,19,20,
				21,22,23,24,25,26,27,28,29,30,
				31,32,33,34,35,36,37,38,39,40,
				41,42,43,44,45};
		//랜덤하게 2개를 뽑아서 화면에 출력
		for(int i =1 ; i<=1000 ; i++) {
		int a = (int)(Math.random()*45); // 45까지의 임의의 수 랜덤하게 추출
		int b = (int)(Math.random()*45);
		int temp =0;
		temp = m[a];
		m[a] = m[b];
		m[b] = temp;
		} // 1000번 섞는다.
		
		int[] n = new int[6];
		for (int i = 0; i < n.length; i++) {
			n[i] = m[i];
		}
		//출력 결과를 정렬된채 출력 되게함 그전에 정렬 알고리즘 2개 마스터 하기 
		
     	bubbleSort(n);
		printGuGuDan(3);//3을 넣으면 3단이 출력 
		printGuGuDan(7);

		
		
		
		
//		void bubbleSort(int[] arr) {
//		    int temp = 0;
//			for(int i = 0; i < arr.length; i++) {
//				for(int j= 1 ; j < arr.length-i; j++) {
//					if(arr[j]<arr[j-1]) {
//						temp = arr[j-1];
//						arr[j-1] = arr[j];
//						arr[j] = temp;
//					}
//				}
//			}
//			System.out.println(Arrays.toString(arr));
//		}
		
	
			//System.out.print(m[i]+"\t");//앞에서 부터 6개를 뽑기때문에 중복이 되지 않음 
	
//		System.out.println("m["+a+"]번째 요소값 :" + m[a]);
//		System.out.println("m["+b+"]번째 요소값 :" + m[b]);
//		
	
//		System.out.println(m[22]);
//		System.out.println(m[32]);
		// 0*10< Math.random()*10 <1*10;
//		System.out.println((int)(Math.random()*45));//(int)가 먼저 실행되기때문에 
		//(int)(Math.random)이런식으로 바꾸면 0이안나옴 
//		System.out.println((int)(Math.random()*10));
		
		}

	

	}

