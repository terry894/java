package day6;
//�ζǻ̱� 
//java�� 32��Ʈ������ �ϱ� ������ short, int �� �Ȱ��� ����ӵ� ������ �޸� ���񶧹��� ���� 
public class MethodEx10 {
	static void bubbleSort(int[] a)
	{ // ��������
		int temp =0;
		for (int i = 0; i < a.length ; i++) { // ��ü ����Ƚ��
			for (int j = 1; j < a.length -i; j++) { // ������ �� ��ŭ Ƚ���� ���δ�
				//�� ������ �ٲ� Ƚ�� 
				if(a[j]>a[j-1])//����  ū �� �� �ǵڷ� ���� �����Ѵ�
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
		System.out.println();//��ȯ�� �ʿ䰡 ���� 
	}
	
	public static void main(String[] args) {
       //1.�迭��  ����
		int[] m = {1,2,3,4,5,6,7,8,9,10,
				11,12,13,14,15,16,17,18,19,20,
				21,22,23,24,25,26,27,28,29,30,
				31,32,33,34,35,36,37,38,39,40,
				41,42,43,44,45};
		//�����ϰ� 2���� �̾Ƽ� ȭ�鿡 ���
		for(int i =1 ; i<=1000 ; i++) {
		int a = (int)(Math.random()*45); // 45������ ������ �� �����ϰ� ����
		int b = (int)(Math.random()*45);
		int temp =0;
		temp = m[a];
		m[a] = m[b];
		m[b] = temp;
		} // 1000�� ���´�.
		
		int[] n = new int[6];
		for (int i = 0; i < n.length; i++) {
			n[i] = m[i];
		}
		//��� ����� ���ĵ�ä ��� �ǰ��� ������ ���� �˰��� 2�� ������ �ϱ� 
		
     	bubbleSort(n);
		printGuGuDan(3);//3�� ������ 3���� ��� 
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
		
	
			//System.out.print(m[i]+"\t");//�տ��� ���� 6���� �̱⶧���� �ߺ��� ���� ���� 
	
//		System.out.println("m["+a+"]��° ��Ұ� :" + m[a]);
//		System.out.println("m["+b+"]��° ��Ұ� :" + m[b]);
//		
	
//		System.out.println(m[22]);
//		System.out.println(m[32]);
		// 0*10< Math.random()*10 <1*10;
//		System.out.println((int)(Math.random()*45));//(int)�� ���� ����Ǳ⶧���� 
		//(int)(Math.random)�̷������� �ٲٸ� 0�̾ȳ��� 
//		System.out.println((int)(Math.random()*10));
		
		}

	

	}

