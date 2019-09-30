package day4;

public class MethodEx5 { // class s.
	static int add(int c, int d) { // method add s.
		System.out.println("c : " + c + ", d : " + d);
		c++; // (변수 c에 1를 더함)
		System.out.println("1 증가한 c : " + c);
		return c + d; // 변수 (c+d)값을 메인 메서드에 전달
		// = // (int e = c+d) // retern e  
	}

	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		System.out.println("a : " + a + ", b : " + b); // 100과 200 
		int result = add(a, b); //result에 return값 c+d가 들어간다  
		System.out.println("a : " + a);  //100
		System.out.println("result : " + result); //300이 출력됨  
	}
}


//call by name : 이름으로 호출 PrintStar();매개변수 불렀을때
//Call by value: 값에 의에 호출 add(100,200);값을 전달해서 호출 - 값이 변하지 않음 
//일반 변수로 호출 할  경우 값에 변동이 없음 
//Call by reference: arraySum(m): 참조변수를 주면됨 - 참조를 통해 heap에 있는 변수가 변할수도 있음 
//참조 변수로 호출 할 경우 메소드 안에서 값에 변동이 남아있음 