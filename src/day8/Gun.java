package day8;

public class Gun implements Weapon{
int bullet;
Gun(){
	bullet = 6;
}

@Override
public void fire() {
	if (bullet == 0)
	{
		System.out.println("ƽ");
	}
	else {
		System.out.println("��~~~");
		bullet--;
	}
}

@Override
public void reload() {
	System.out.println("��������");
	bullet =6;
}


}
