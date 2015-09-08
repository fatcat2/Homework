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

	final int Penny = 0;
	final int Nickel = 1;
	final int Dime = 2;
	final int Quarter = 3;
	final int Dollar = 4;
	
	String type;
	
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
	public void calcVal(JLabel totalLabel, JLabel cLabel, int cType){
		updateNums();
		double total = 0;
		for(int i = 0; i < coinList.size(); i++){
			total += coinList.get(i).getValue();
		}
		cLabel.setText("hello");
		totalLabel.setText("Total Money: $" + toPercent(total));
	}
	//Used to circumvent some errors.
	public double toPercent(double x){
		return x/ 100;
	}
	//Name says it all, clears out all the money in the bank.
	public void youBrokeSon(JLabel totalLabel){
		coinList.clear();
		clearCoffers();
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
		updateNums();
	}
	private String coinType(int coin){
		String s = null;
		switch(coin){
		case 0:
			type = "Pennies";
		case 1:
			s = "Nickels";
		case 2:
			s = "Dimes";
		case 3:
			s = "Quarters";
		case 4:
			s = "Dollars";
		}
		return s;
	}
	private void clearCoffers(){
		qNum = 0;
		dNum = 0;
		pNum = 0;
		DNum = 0;
		nNum = 0;
	}
	private void updateNums(){
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
