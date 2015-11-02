
public class Player {
	int coins;
	public Player(){
		coins = 5;
	}
	public int getCoins(){
		return coins;
	}
	public void addCoins(int c){
		coins += 1;
	}
	public void takeCoins(int c){
		coins -= 1;
	}
}
