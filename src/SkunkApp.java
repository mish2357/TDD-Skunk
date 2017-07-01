
public class SkunkApp {

	private int numberOfPlayers;
	private String[] playerNames = new String[2] ;
	
	public void getPlayerInfo() {
		// TODO Auto-generated method stub
		
		numberOfPlayers=2;
		playerNames=new String[numberOfPlayers];
		playerNames[0]="Player1";
		playerNames[1]="Player2";
	}
	public static void main(String[] args) {
		
	}
	public int getNumberOfPlayers() {
		
		
		return numberOfPlayers;
	}
	public String getPlayerName(int playerNumber) {
		// TODO Auto-generated method stub
		return playerNames[playerNumber-1];
	}

}
