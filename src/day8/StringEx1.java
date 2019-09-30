package day8;
//참조비교
public class StringEx1 {
	public static void main(String[] args) {
     String str = new String("java");
     String str1 = new String("java"); //new라는연산자를 쓰면 새로 만들어준다
     
     if(str == str1) {
    	 System.out.println("동일객체");
     }
     else {
    	 System.out.println("다른객체");
     }
     
     if(str.equals(str1))
     {	 System.out.println("동일한내용");
	}else {
		System.out.println("다른 내용");
	}
     //주소얻기
     System.out.println(str1.getClass().getName() + '@' + Integer.toHexString(str1.hashCode()));
     
     
     System.out.println("---------------------");
     
     String str3 ="java";
     String str4 ="java"; //기본형으로 만들면 동일한 객체
     
     if(str == str1) {
    	 System.out.println("동일객체");
     }
     else {
    	 System.out.println("다른객체");
     }
     System.out.println(str1.getClass().getName() + '@' + Integer.toHexString(str.hashCode()));
     System.out.println(str1.getClass().getName() + '@' + Integer.toHexString(str1.hashCode()));
     
     
     if(str3.equals(str4)) {
    	 System.out.println("동일한 내용");
     }
     else {
    	 System.out.println("다른내용 ");
     }
     
     str4="ORACLE";
     
     System.out.println(str3);
     System.out.println(str4);
     
     String str2 ="*";//heap 공간에 string 클래스 메소드 11개 생김 
     
//     for(int i=0; i<100; i++) {// 11개가 100개생김  메모리 낭비 속도 느려짐 
//    	 str+= "*";
//     }
//    		 
     //. 클래스에서 쓸수있는 메소드를 보여줌
     
     
     //String도 원래는 이렇게 서야하지만 
     //편의를 위해서 기본형 처럼 사용하게 바꿔줬다 String str ="sad";
     //System.out.println(str.toString());
     //원래는 str의 주소가 나와야 하지만 toString()메소드를 이용해서 "java"출력 
     //toString 메서드는  object 클래스에 있는 걸 오버라이드 한것 

	}
}
