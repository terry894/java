package test4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BoxingProgram {
	
	public static void main(String[] args) {
		//엄청자주씀!!!
	
		//배열의 대체제 
		//데이터를 식별하는 방법에 차이를 두고잇는 계열들
		//1.데이터가 곧 식별자다 ->set 계열   중복제거에 주요사용
		Set set = new HashSet(); 
		set.add("hello");
		set.add(37);
		set.add("호호호");
		set.add(37);
		set.add("호호호");
		//중복제거
		for(Object obj : set)
			System.out.println(obj);//식별자가 따로없다 
	    System.out.println("---------");
		//2.데이터의 순서가 곧 식별자다 ->list 계열
		List list = new ArrayList();
		list.add("hello");
		list.add(37);
		list.add("호호호");
		set.add(37);
		set.add("호호호");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		for (Object obj : list)
			System.out.println(obj);//열거하는 서비스를 가지고 잇는 객체 라면 foreach문 사용가능
	    System.out.println("---------");
		
		
		//list.size() list 사이즈 만큼 값 불러오기  
		//3.데이터의 식별자가 따로있다 -> map 계열 일시적으로 저장ㅈ
		Map map = new HashMap(); 
		map.put("이름","홍길동");
		map.put("나이","17");
		map.put("주소","한양");
		
		System.out.println(map.get("주소"));
		
		for(Object k :map.keySet())//key가 들어있는 공간에 키값들을 k에 넣어준다 
			System.out.printf("key : %s, vlaue: %s",k,map.get(k));//k,map.get(k)을 출력 
		//키값으로 호출 
		
		
		
		//Generic
		
		
		
		
		//모두 컬렉션의 역할 모두 데이터를 모은다 
	}

}
