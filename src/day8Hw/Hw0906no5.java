package day8Hw;

public class Hw0906no5 {
	public static void main(String[] args) {
		Object ob1 = new Object();
		Object ob2 = new Object();
		
		System.out.println(ob2.toString());
		//ob2안에 들어잇는 주소값(문자열)이 출력된다
		if(ob1.equals(ob2)) {
			System.out.println("객체가 동일하다");
		}
		else {
			System.out.println("객체가 다르다");
		}
		//ob1 , ob2가 다른 주소값을 가지고 잇고 다른 객체를 가르키기 때문에 두 변수를 비교하면 객체가 다르다 
		
		if(ob1.toString().equals(ob2.toString())) 
		{
			System.out.println("객체가 동일하다");
		}
		else {
			System.out.println("객체가 다르다");
		}
		//ob1 , ob2가 다른 주소값을 가지고 잇고 다른 객체를 가르키기 때문에 안에 있는 주소값이 다르게 가져오기 때문에 객체가 다르다
		
		
	}

}
