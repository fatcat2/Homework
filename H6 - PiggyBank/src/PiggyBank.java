import java.util.ArrayList;


public class PiggyBank {
	ArrayList<Coin> coinList = new ArrayList<Coin>();
	int numCoins;
	
	double weight;
	double totalVal;
	public PiggyBank(){
		numCoins = 0;
		weight = 0;
		totalVal = 0;
	}
	public void calcVal(){
		for(Coin c: this.coinList){
			totalVal += c.getValue();
			weight += c.getWeight();
		}
	}
	public double getVal(){
		calcVal();
		return totalVal;
	}
	public double getWeight(){
		return weight;
	}
	public int getCoins(){
		return numCoins;
	}
	public void addVal(double x){
		totalVal += x; 
	}
}
