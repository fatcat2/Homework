/*
 * Author: fatcat2
 * Date: September 7th, 2015
 * Description: This is the PiggyBank class I created that holds the numerous types of methods and variables
 * having to do with PiggyBank
 */
import java.util.ArrayList;
import javax.swing.JLabel;


public class PiggyBank {
	//The coins are stored in the arrayList
	ArrayList<Coin> coinList = new ArrayList<Coin>();
	Double totalVal = 1.0; //Init total value;.
	public PiggyBank(){
	}
	//The other constructor.
	public PiggyBank(int pNum, int dNum, int nNum, int qNum){
		for(int i = 0; i <= pNum; i++){
			coinList.add(new Penny());
		}
		for(int i = 0; i <= dNum; i++){
			coinList.add(new Dime());
		}
		for(int i = 0; i <= nNum; i++){
			coinList.add(new Nickel());
		}
		for(int i = 0; i <= qNum; i++){
			coinList.add(new Quarter());
		}
	}
	//Calculates the total money and setsTExt the appropriate JLabel
	public void calcVal(JLabel l){
		double total = 0;
		for(int i = 0; i < coinList.size(); i++){
			total += coinList.get(i).getValue();
		}
		l.setText("Total Money: $" + toPercent(total));
	}
	//Used to circumvent some errors.
	public double toPercent(double x){
		return x/ 100;
	}
	//Name says it all, clears out all the money in the bank.
	public void youBrokeSon(){
		coinList.clear();
	}
}
