package ����;

public class Calculater {
	public static int add(int x, int y) throws �ʹ�Ŀ��
	{
		int result = x+y;
		
		
		if(result>10000)
		   throw new �ʹ�Ŀ��();
		return result;
	}
	public static int sub(int x, int y)
	{
		int result = x-y;
		
		return result;
	}
	public static int dev(int x, int y)
	{
        int result = x/y;
		
		return result;
	}


}
