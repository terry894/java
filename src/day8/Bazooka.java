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
			System.out.println("ƽ");
		}
		else {
			System.out.println("��!");
			bullet--;
		}
	}

	@Override
	public void reload() {
		System.out.println("��������");
		bullet =1;
	}


	}
	