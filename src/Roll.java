
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
		return rollDie1() == 1 || rollDie2()==1 ;
		
	}



	public boolean getHasTwoSkunk() {
		// TODO Auto-generated method stub
		return rollDie1() == 1 && rollDie2()==1 ;
	}



	public boolean getHasSkunkandDeuce() {
		// TODO Auto-generated method stub
		return (boolean) getHasSkunk() && (rollDie1()==2||rollDie2()==2);
	}

}
