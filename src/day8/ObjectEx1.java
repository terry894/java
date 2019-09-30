package day8;

// 자바 에서 생략 가능한 것들 
// import java.lang.*;
// extends Object
// 생성자 
// 생성자에서 멤버변수를 가르키는 키워드: this.
// super();
// 접근지정자 default
public class ObjectEx1 {
	public static void main(String[] args) {
		Object obj1 = new Object();
		
        System.out.println(obj1);
        System.out.println(obj1.toString());
//        getClass().getName() + '@' + Integer.toHexString(hashCode())
        
        //obj1의 실행중인 클래스객체
        Class cls = obj1.getClass();
        
        //클래스이름을 리턴
String className = cls.getName();


System.out.println(className);
//hash value값
System.out.println(obj1.hashCode());

//16진수 값으로 변환
System.out.println(Integer.toHexString(obj1.hashCode()));

//toString()
//object의 클래스명  + @ + 해쉬값을 16진수로 변환한값

Object obj2 = new Object();
Object obj3 = new Object();

System.out.println("obj2: " + obj2);
System.out.println("obj3: " + obj3);

obj2 = obj3;

if(obj2 == obj3) {
	System.out.println("동일객체");
}else {
	System.out.println("다른객체");
}

if(obj2.equals(obj3)) {
	System.out.println("동일객체");
}else {
	System.out.println("다른객체");
}


System.out.println("--------------");




	}

}
