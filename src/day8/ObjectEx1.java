package day8;

// �ڹ� ���� ���� ������ �͵� 
// import java.lang.*;
// extends Object
// ������ 
// �����ڿ��� ��������� ����Ű�� Ű����: this.
// super();
// ���������� default
public class ObjectEx1 {
	public static void main(String[] args) {
		Object obj1 = new Object();
		
        System.out.println(obj1);
        System.out.println(obj1.toString());
//        getClass().getName() + '@' + Integer.toHexString(hashCode())
        
        //obj1�� �������� Ŭ������ü
        Class cls = obj1.getClass();
        
        //Ŭ�����̸��� ����
String className = cls.getName();


System.out.println(className);
//hash value��
System.out.println(obj1.hashCode());

//16���� ������ ��ȯ
System.out.println(Integer.toHexString(obj1.hashCode()));

//toString()
//object�� Ŭ������  + @ + �ؽ����� 16������ ��ȯ�Ѱ�

Object obj2 = new Object();
Object obj3 = new Object();

System.out.println("obj2: " + obj2);
System.out.println("obj3: " + obj3);

obj2 = obj3;

if(obj2 == obj3) {
	System.out.println("���ϰ�ü");
}else {
	System.out.println("�ٸ���ü");
}

if(obj2.equals(obj3)) {
	System.out.println("���ϰ�ü");
}else {
	System.out.println("�ٸ���ü");
}


System.out.println("--------------");




	}

}
