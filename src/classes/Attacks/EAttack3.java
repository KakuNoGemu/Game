package classes.Attacks;

public class EAttack3 extends Attack {
	
	
	@Override
	public int damage() {
		return 30;
	}

	@Override
	public boolean surfaceDamage() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String name() {
		return "Enemy Attack";
	}
}
