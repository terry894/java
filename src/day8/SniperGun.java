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
			System.out.println("ƽ");
		}
		else {
			System.out.println("��");
			bullet--;
		}
	}
	
	@Override
	public void reload() {
		System.out.println("��������");
		bullet =12;
	}


	}
	

