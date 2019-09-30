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
		System.out.println("∆Ω");
	}
	else {
		System.out.println("ªß~~~");
		bullet--;
	}
}

@Override
public void reload() {
	System.out.println("¿Á¿Â¿¸¡ﬂ");
	bullet =6;
}


}
