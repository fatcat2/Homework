/*
 * Author: fatcat2
 * Date: September 7th, 2015
 * Description: This is the PiggyBank class I created that holds the numerous types of methods and variables
 * having to do with PiggyBank
 */
import java.util.ArrayList;

import javax.swing.JLabel;


public class PiggyBank<qNum> {
	//The coins are stored in the arrayList
	ArrayList<Coin> coinList = new ArrayList<Coin>();
	Double totalVal = 1.0; //Init total value;.
	
	int pNum;
	int dNum;
	int nNum;
	int qNum;
	int DNum;
	
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
	public void calcVal(JLabel totalLabel){
		int total = 0;
		for(int i = 0; i < coinList.size(); i++){
			total += coinList.get(i).getValue();
		}
		updateNums();
			optimizeSpace(total);
		totalLabel.setText("Total Money: $" + toPercent(total));
	}
	//Used to circumvent some errors.
	public double toPercent(double x){
		return x/ 100;
	}
	//Name says it all, clears out all the money in the bank.
	public void youBrokeSon(JLabel totalLabel){
		coinList.clear();
		clearNums();
		totalLabel.setText("$0.00");
	}
	public int getQNum(){
		return qNum;
	}
	public int getPNum(){
		return pNum;
	}
	public int getNNum(){
		return nNum;
	}
	public int getDNum(){
		return dNum;
	}
	public int getDollarNum(){
		return DNum;
	}
	public void addCoin(Coin c){
		coinList.add(c);
	}
	private void clearNums(){
		qNum = 0;
		dNum = 0;
		pNum = 0;
		DNum = 0;
		nNum = 0;
	}
	private void optimizeSpace(int total){
		//This method calculates the number of coins needed to calculate the user input value.
		//The method starts from quarters, the coin with the highest value, then progressively moves down.
		//This way, when the program gets to nickels and pennies, it doesn't need to calculate another placeholder for pennies.
		int a = (total / 25);
		total -= a * 25;
		int b = (total / 10);
		total -= b * 10;
		int c =  total / 5;
		int d = total % 5;
		qNum = a;
		dNum = b;
		nNum =  c;
		pNum = d;
		
	}
	private void updateNums(){
		clearNums();
		for(Coin c : coinList){
			if(c instanceof Quarter ){
				qNum++;
			}else if(c instanceof Penny){
				pNum++;
			}else if(c instanceof Dime){
				dNum++;
			}else if(c instanceof Nickel){
				nNum++;
			}else if(c instanceof Dollar){
				DNum++;
			}
		}
	}
}
