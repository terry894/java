package 가변배열;

public class GList<T> {
//Generic class
//public class GList<T> T-아무값이나 들어가도 된다 
	
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

	//코딩이 안되는이유
	//1. 단위 코딩
	//2. 절차 코딩(해결능력) 
	public void add(T value) {
		if(index >= max){
			T[] temp = (T[]) new Object[max+5];
			for (int i = 0; i < max; i++) {
				temp[i] = data[i];
			}
			data = temp;
			max += 5;
			/*
			 1. 이주할 Object 형식의 배열을 max+5 크기로 temp를 생성 
			 2. data배열의 값들을 temp 배열로 옮긴다. 
			 3. temp배열의 이름을 data라는 이름으로 변경한다. 
			 4. max의 값을 +5  증가한다.  
			 */
		}
		data[index] = value; //오토박싱(new Integer)이 일어나기 때문에 
		index++;
	}

	public T get(int index) {
		return data[index];
	}
	
	
	
}
