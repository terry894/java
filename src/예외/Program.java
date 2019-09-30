package 예외;

public class Program {
	
	
	public static void main(String[] args) {
		
		try {
			Thread.sleep(1000);
		int sum = Calculater.add(10004,3);
		System.out.printf("sum:%d\n",sum);
		}
		//큭수하게 처리할 예외는 앞에 와야한다
		
		catch(너무커서 e) {
			System.out.println("aaa"+e.getMessage());
			//파일을 닫아야 하는코드 가 필요 
			//메세지를 만든놈이 e.getMessage()를 통해서 return값 전달
			
		}
        catch(Exception aaa) { //모든 예외를 한꺼번에  여기서 처리 
	    	System.out.println("죄송");
	    } 
		finally {
			System.out.println("finally");
		}//어떤 예외가 발생하든 꼭거쳐가는 블럭 
		
		
		System.out.println("종료");
	}
}
