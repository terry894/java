package day8;

public class TestMain2 {
	 public static void main(String[] args) {
		 //Police p �� ���� steak p ������ null
		 //NULLpointException �ַ� �������� ã�ư������� 
		 //�ؿ��ַ����� �����Ѵ� 
		 //ã�ư����� �������� ���� null �� 
		 //stack last in first out
		 Gun g = new Gun();
		 SniperGun s = new SniperGun();
		 Bazooka b = new Bazooka();
		 
		 Police p = new Police(g);
		 //Police p = new Police(g); // �����ڸ� ���� �������� ����  
		 p.setW(b); // ���߿� ������ �ְ� ������ setter��� 
		 p.attack();
		 
		 
		 p.setW(s);
		 p.attack();

	
//		Gun g = new Gun();
//		 g.fire();
//		 g.fire();
//		 g.fire();
//		 g.fire();
//		 g.fire();
//		 g.fire();
//		 g.fire();
//		 g.fire();
//		 g.fire();
//		 g.fire();
//		 g.fire();
//		 g.fire();
//		 g.fire();
//		 g.reload();
//		 g.fire();
//		 g.fire();
//		 g.fire();
	}

}
