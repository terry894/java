package 예외;

public class Calculater {
	public static int add(int x, int y) throws 너무커서
	{
		int result = x+y;
		
		
		if(result>10000)
		   throw new 너무커서();
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
