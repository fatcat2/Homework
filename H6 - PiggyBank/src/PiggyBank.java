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
	Double totalVal = 1.0;
	public PiggyBank(){
		totalVal = 0.0;
	}
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
	public void calcVal(JLabel l){
		double total = 0;
		for(int i = 0; i < coinList.size(); i++){
//			System.out.println(coinList.get(i).getValue());
			total += coinList.get(i).getValue();
		}
//		System.out.println("total: " + toPercent(total) + "\n");
		l.setText("Total Money: $" + toPercent(total));
	}
	public double toPercent(double x){
		return x/ 100;
	}
	public void youBrokeSon(){
		coinList.clear();
	}
}
