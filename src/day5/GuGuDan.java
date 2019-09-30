package day5;

public class GuGuDan {
	int dan;
	
	GuGuDan(){
		this.dan = 2;
	}
	GuGuDan(int dan) {
		this.dan = dan;
	}
		
	void print() {
		System.out.println("============");
		for (int i = 1; i < 10; i++) {
			System.out.println(dan + " * "+i+" = "+(dan*i));
		}
	}

	void printAll() {
		System.out.println("============");
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.println(j + " * " + i + " = " + (j * i));
			}
		}
	}
	
	public static void main(String[] args) {
		GuGuDan g = new GuGuDan();
		g.print();
		g.printAll();

		
		
	}
}
