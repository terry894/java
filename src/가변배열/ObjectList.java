package �����迭;

public class ObjectList {


	private Object[] data;
	private int index ;
	private int max;
	private Object[] temp;
	
	public ObjectList() {
        data = new Object[max];
        
		index = 0 ;
	}

	public int size() {
		return index;
	}

	//�ڵ��� �ȵǴ�����
	//1. ���� �ڵ�
	//2. ���� �ڵ�(�ذ�ɷ�) 
	public void add(Object value) {
		if(index >= max){
			temp = new Object[max+5];
			for (int i = 0; i < max; i++) {
				temp[i] = data[i];
			}
			data = temp;
			max += 5;
			/*
			 1. ������ Object ������ �迭�� max+5 ũ��� temp�� ���� 
			 2. data�迭�� ������ temp �迭�� �ű��. 
			 3. temp�迭�� �̸��� data��� �̸����� �����Ѵ�. 
			 4. max�� ���� +5  �����Ѵ�.  
			 */
		}
		data[index] = value; //����ڽ�(new Integer)�� �Ͼ�� ������ 
		index++;
	}

	public Object get(int index) {
		return data[index];
	}
	
	
	
}
