package test4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BoxingProgram {
	
	public static void main(String[] args) {
		//��û���־�!!!
	
		//�迭�� ��ü�� 
		//�����͸� �ĺ��ϴ� ����� ���̸� �ΰ��մ� �迭��
		//1.�����Ͱ� �� �ĺ��ڴ� ->set �迭   �ߺ����ſ� �ֿ���
		Set set = new HashSet(); 
		set.add("hello");
		set.add(37);
		set.add("ȣȣȣ");
		set.add(37);
		set.add("ȣȣȣ");
		//�ߺ�����
		for(Object obj : set)
			System.out.println(obj);//�ĺ��ڰ� ���ξ��� 
	    System.out.println("---------");
		//2.�������� ������ �� �ĺ��ڴ� ->list �迭
		List list = new ArrayList();
		list.add("hello");
		list.add(37);
		list.add("ȣȣȣ");
		set.add(37);
		set.add("ȣȣȣ");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		for (Object obj : list)
			System.out.println(obj);//�����ϴ� ���񽺸� ������ �մ� ��ü ��� foreach�� ��밡��
	    System.out.println("---------");
		
		
		//list.size() list ������ ��ŭ �� �ҷ�����  
		//3.�������� �ĺ��ڰ� �����ִ� -> map �迭 �Ͻ������� ���夸
		Map map = new HashMap(); 
		map.put("�̸�","ȫ�浿");
		map.put("����","17");
		map.put("�ּ�","�Ѿ�");
		
		System.out.println(map.get("�ּ�"));
		
		for(Object k :map.keySet())//key�� ����ִ� ������ Ű������ k�� �־��ش� 
			System.out.printf("key : %s, vlaue: %s",k,map.get(k));//k,map.get(k)�� ��� 
		//Ű������ ȣ�� 
		
		
		
		//Generic
		
		
		
		
		//��� �÷����� ���� ��� �����͸� ������ 
	}

}
