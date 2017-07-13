
public class Roll {

	private int lastTotal;
	
	public Roll() {
		lastTotal = rollDie() + rollDie();
		

	}

	private int rollDie() {
		return (int) Math.random() * 6 + 1;
	}

	public int getLastTotal() {
		// TODO Auto-generated method stub
		return lastTotal;
	}

	public Object getRoll() {
		// TODO Auto-generated method stub
		return rollDie();
	}

}
