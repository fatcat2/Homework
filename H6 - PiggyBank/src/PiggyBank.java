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
		for(Coin c: coinList){
			totalVal += c.getValue();
			weight += c.getWeight();
		}
	}
	public double getVal(){
		return totalVal;
	}
	public double getWeight(){
		return weight;
	}
	public int getCoins(){
		return numCoins;
	}
	public void addPenny(){
		coinList.add(new Penny());
		numCoins++;
	}
	public void addNickel(){
		coinList.add(new Nickel());
		numCoins++;
	}
	public void addDime(){
		coinList.add(new Dime());
		numCoins++;
	}
	public void addQuarter(){
		coinList.add(new Quarter());
		numCoins++;
	}
	public void addHalfDollar(){
		coinList.add(new HalfDollar());
		numCoins++;
	}
	public void addDollar(){
		coinList.add(new PresDollar());
		numCoins++;
;	}
}
