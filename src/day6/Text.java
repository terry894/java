package day6;

public class Text {
 // 1. a~z, A~z, 0~9,_,$
 // 2. 첫글자 영문자 
 // 3. 예약어 X
 // 4. 길이 X
 //	5. 의미있게
	
 	
 // 클래스명
 // 1. 첫글자 대문자 
 //	2. 공백 대신 뒷단어의 첫글자 대문자 ex)BigData 
 // 변수명 
 //	1. 첫글자 소문자
 //	2. 2개이상의 단어의 조합 뒷단어의 첫글자 대문자 
 // 메소드 명 
 // 1. 첫글자 소문자 
 // 2. 변수 2번
 // 3. ()
 // 생성자 명
 //	1. 클래스명과 동일
 //	2. ()
 //	상수 
 //	1. 모든글자가 대문자
 //	2. 공백대신에 언더바 사용
 //	TestMain 클, smallValue 변, getData() 메, setNumber() 메,GoodData() 생
 // price 변, Test() 생
	
 // private :현재 class만 쓸수있음 
 // default :현재 package 내에서만 아무것도 안쓰면 default 
 // protected :현재패키지 + 상속관계 
 // public :다 쓸수있음 
	
 //추상화 :상속을 이용해 공통 특성을 뽑아서 만듬 
 // 객체를 만들때 안전하게 쓰기위해 정해진 루트로만 접근할수있게 끔 캡슐화 
 // 캡슐화 맴버변수를 private하고 getter,setter로 처리 - 정보의 은닉 
	//상속
	//부모의 변수와 부모의 메서드를 자식에게 상속 
	//자바의 최상위 클래스 = object
	//상속의 단점 물려받으면 없어지지않음 
	// A is a b 일때 사용한다 ex)총은 경찰이다 X
	// A has a b 일때 맴버변수 관계로 표현 한다 ex)경찰이 총을 가지고 있다
	
	//클래스는 private로 쓸수 없다.
	
	//overriding: 상속하에서 부모랑 똑같이 만든다 (매개변수의 수, 타입, 순서)를 동일하게 한다 .
	//접근지정자가 부모보다 허용적인것은 가능하다  ex) 부모의 메소드가 default 이고 자식이 public인것은 가능하다.  
	//overloading: 다중정의 이름동일 ( 매개변수의 수, 타입, 순서) 다르게
	//reference: class,Array,Interface
	
	//추상 클래스     : 조감도 - 대략적인 설계도 이런식으로 구성할거야 
	//클래스            : 객체를 만들기 위한 설계도
	//추상 클래스     : instance화 할수없다 , 구현 메서드를 가질수 있다.
	//추상메서드      : 상속받으면 반드시 오버라이드 해서 사용한다.
	//추상메서드를 1개라도 가지고 잇으면 반드시 추상 클래스여야 한다.
	//위에서 아래로 : 일반화 
	
	//객체를 그림으로 그리는 것 = 클래스 다이어그램 업무에 사용 
	//+public, -private , default, # static police(자식) -> person(부모) 
	//Java는 단일 상속이 기본원칙 다중상속 불가능
	
	//인터페이스 
	//상수와 추상메서드로만 이루어져 잇다.
	//array ,class, interface
	//구현 메소드 가지지못함
	//서로관계가 없는 물체들이 상호작용을 하기위해서
	//사용하는 장치나 시스템
	//첫글자 대문자 시작
	//인터페이스는 전혀상관 없는 클래스에도 사용할수있다.
	
	
	//다형성
    //동일한 조작방법으로 동작시키지만 
	//대상에 따라 다른 실행하게 하는것

	
	
	//객체지향 언어특징
	//encapsulation
	//inheritance
	//abstraction
	//polymorphism
	
	//static 
	//static변수와 메서드는 바로사용가능 SmartPhone.company
	//인스턴스는 여러개여도 static 변수는 공용으로 하나 사용 
	
	//final 클래스(final class)
	//자손이 없는 클래스
	
	//final 변수 
	//상수의 의미 
	
	//final 메서드
	//override금지 
	
	//API : 
	
	///** */- 
	//Object.. 가변형 
	
	
	//A is a B
	//extends 클래스명 
	//메서드(){ 메서드()}
	//A has a B 
	//멤버변수 Gun a 
	//생성자(){ a = new Gun()}
	//메서드(){ a.fire()}
	
	
	//API 
	//개발에 필요한 클래스들을 모아놓고 설명해둔거
	//deprecated:성능이더 좋다는 표시 or 조만간 이전꺼 없어짐  
	
	//java 
	//장점 : 플랫폼 독립적  여러장비에서 동일한 결과 수행 리눅스, 원도우 다 가능
	//단점 : gui가 이쁘지 않음, java깔아야함 , c보다 느림 
	
	
	//String: to string-자기자신 문자열 반환
	
	//overload : 다중정의
	//override: 재정의
	
	//java.awt: 윈도우 창 만들때 필요한 도구들을 모아논 패키지
	//Component: 도구들을 추상화 해논것
	//Container: 다른 Component를 담을수 잇는 Component
	
	
	//컨테이너에서 컴포넌트를 배치하는 두가지 방법
	//1. 배치관리자에 의해 배치 배치관리자 - 레이아웃
	//  Frame의 기본 배치관리자는 보더 레이아웃
	//보더레이아웃 ==>FlowLayout 으로 변경
	
	//FlowLayout 객체생성 - 물흐르듯이 위에서 아래로 배치 
	//컴포넌치 위치를 창크기에 따라 변화게 해주기 위해서 플로우 레이아웃을 쓴다
	//container에 component가 담겨야 볼수있다
}
