package day7;
// �̰� ��ӿ� 
// instance ȭ �ϴ� Ŭ������ �ƴ�  ex)Mammal m1 = new Mammal
// �߻�Ŭ����  �߻�ȭ�� ���� ���� Ŭ���� 

//�߻� Ŭ����     : ������ - �뷫���� ���赵 �̷������� �����Ұž� 
//Ŭ����            : ��ü�� ����� ���� ���赵
public abstract class Mammal {//ex)Mammal m1 = new Mammal ���ϵ��� ����
	String species, color;
	int head, tail, age;
	
	
	//�� �޼���� ���� �ݵ�� �������̵��ؼ� ����ϼ���
	//abstact�޼ҵ�� �ڽ�Ŭ������ ���鶧 �������ؾ��Ѵٴ� �ǹ̸� ������ �ִ�.  
	abstract void eating(); //abstract�޼��� �߻� �޼���� �����Ѱ� ���� override�ؼ� ����� ǥ��
	abstract void sleeping();
		//System.out.println("����"); ������ �������̵��Ұ� �׳� ����⸸ ���� 
}
