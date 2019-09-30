package day8;
//인터페이스를 만들어서 여러가지 총을 쓸수있게 설정
//인터페이스와 인터페이스 자손들을 활용하면 활용도가 증가
//전혀연관없는 것들도 인터페이스로 구현하면 사용가능하기 때문에 추상화 보단 인터페이스로 구현 
public interface Weapon {
	
	public void fire();
	public void reload();
	
}

