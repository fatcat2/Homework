import java.util.ArrayList;


public class PiggyBank {
	ArrayList<Coin> coinList = new ArrayList<Coin>();
	int numCoins;
	
	double weight;
	Double totalVal = 1.0;
	public PiggyBank(){
		numCoins = 0;
		weight = 0;
		totalVal = 0.0;
	}
	public void calcVal(){
		double total = 0;
		for(int i = 0; i < coinList.size(); i++){
			System.out.println(coinList.get(i).getValue());
			total += coinList.get(i).getValue();
		}
		System.out.println("total: " + toPercent(total) + "\n");
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
	public void addVal(int x){
		totalVal += x; 
	}
	public void addCoin(Coin c){
		this.coinList.add(c);
	}
	public double toPercent(double x){
		return x/ 100;
	}
}
