package classes.Attacks;

public class EAttack extends Attack {
	
	
	@Override
	public int damage() {
		return 15;
	}

	@Override
	public boolean surfaceDamage() {
		return false;
	}

	@Override
	public String name() {
		return "Enemy Attack";
	}
}
