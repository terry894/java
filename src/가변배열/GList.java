package �����迭;

public class GList<T> {
//Generic class
//public class GList<T> T-�ƹ����̳� ���� �ȴ� 
	
	private T[] data;
	private int index ;
	private int max;
	
	public GList() {
        data = (T[]) new Object[max]; 
		index = 0 ;
	}

	public int size() {
		return index;
	}

	//�ڵ��� �ȵǴ�����
	//1. ���� �ڵ�
	//2. ���� �ڵ�(�ذ�ɷ�) 
	public void add(T value) {
		if(index >= max){
			T[] temp = (T[]) new Object[max+5];
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

	public T get(int index) {
		return data[index];
	}
	
	
	
}
