package day8;

public class Bazooka implements Weapon{
	
	int bullet;
	Bazooka(){
		bullet = 1;
	}

	@Override
	public void fire() {
		if (bullet == 0)
		{
			System.out.println("∆Ω");
		}
		else {
			System.out.println("ªΩ!");
			bullet--;
		}
	}

	@Override
	public void reload() {
		System.out.println("¿Á¿Â¿¸¡ﬂ");
		bullet =1;
	}


	}
	