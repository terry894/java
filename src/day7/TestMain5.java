package day7;

public class TestMain5 {
	
	public static void main(String[] args) {
		Rabit r = new Rabit();
		Dog d = new Dog();
		Whale w = new Whale();
		Horse h = new Horse();
		
		r.eating();
		d.eating();
		w.eating();
		
		h.eating();
		h.sleeping();
		h.runnung();
		
		h.fly();
		w.fly();
		//������
	    //������ ���۹������ ���۽�Ű���� 
		//��� ���� �ٸ� �����ϰ� �ϴ°�
		//ex)����ĳ������ ���۹���� �ܼ�ȭ ��ų�� �ִ�
		Flyable f = h;
        f.fly();
        f = w;
        f.fly();
	}
	
}
