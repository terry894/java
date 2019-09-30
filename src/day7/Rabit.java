package day7;

public class Rabit extends Mammal {

	int head;
	
	Rabit()
	{
		species = "ÀâÁ¾";
		color = "ÇÏ¾á»ö";
		head = 1;
		tail = 1;
		age = 2;
	}
	
	void jumping() {
		System.out.println("²±Ãæ²±Ãæ");
	}
    @Override
	void eating() {
		System.out.println("³È³È");
	}
    

	@Override
	void sleeping() {
		System.out.println("ÄğÄğ");
	}
}
