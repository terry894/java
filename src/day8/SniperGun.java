package day8;

public class SniperGun implements Weapon{
	
	int bullet;
	SniperGun(){
		bullet = 12;
	}

	@Override
	public void fire() {
		if (bullet == 0)
		{
			System.out.println("∆Ω");
		}
		else {
			System.out.println("ºÔ");
			bullet--;
		}
	}
	
	@Override
	public void reload() {
		System.out.println("¿Á¿Â¿¸¡ﬂ");
		bullet =12;
	}


	}
	

