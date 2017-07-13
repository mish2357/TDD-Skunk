
public class Roll {

	private int lastTotal;
	private int die1;

	public Roll() {
		lastTotal = rollDie1() + rollDie2();

	}

	private int rollDie() {
		return (int) Math.random() * 6 + 1;
	}

	public int getLastTotal() {
		// TODO Auto-generated method stub
		return lastTotal;
	}

	public int getRollDie1() {
		// TODO Auto-generated method stub
		return die1;
	}

	private int rollDie1() {
		return die1 = rollDie();
	}

	public int getRollDie2() {
		// TODO Auto-generated method stub
		return rollDie2();
	}

	private int rollDie2() {
		// TODO Auto-generated method stub
		return rollDie();
	}

	public boolean getHasSkunk() {
		// TODO Auto-generated method stub
		return rollDie1() == 1 || rollDie2() == 1;

	}

	public boolean getHasTwoSkunk() {
		// TODO Auto-generated method stub
		return rollDie1() == 1 && rollDie2() == 1;
	}

	public boolean getHasSkunkandDeuce() {
		// TODO Auto-generated method stub
		return (boolean) (getHasSkunk() && getHasDeuce());
	}

	private boolean getHasDeuce() {
		return (boolean) (rollDie1() == 2 || rollDie2() == 2);
	}
	public String toString(){
		String rollToString =  rollDie1() + " - " +rollDie2() + "\n";
		if(getHasSkunk()){
			
			// only one skunk
			if(!getHasTwoSkunk() && ! getHasSkunkandDeuce()){
				rollToString += "  the player rolled 'A SKUND' so he lost his trurn and 1 chip\n";
			}
			
			if(getHasSkunkandDeuce()){
				rollToString += "  the player rolled  'A SKUND AND A DUCE' so he lost his trurn and 2 chips\n";
			}
			
			if(getHasTwoSkunk()){

				rollToString += "  the player rolled 'TWO SKUNKs' so he lost his trurn, score,  and 4 chips\n";
			}
			
			
		}
		return rollToString;
		
	}

}
