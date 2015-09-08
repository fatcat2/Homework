/*
 * Author: fatcat2
 * Date: September 7th, 2015
 * Description: this is the Engine class with all the working parts of the program including the
 * GUI.
 */
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Engine {
	//Declaring variables.
	static int numPenny;
	static int numNickle;
	static int numDime;
	static int numQuarter;
	static int count;
	
	//Declaring the PiggyBank outside so it can be used in the ActionListeners
	static PiggyBank p = new PiggyBank();
	
	//Initalizing the JLabel outside it accessible.
	static JLabel pennyCount = new JLabel("Pennies: 0");
	static JLabel nickelCount = new JLabel("Nickels: 0");
	static JLabel dimeCount = new JLabel("Dimes: 0");
	static JLabel quarterCount = new JLabel("Quarters: 0");
	static JLabel totalMoney = new JLabel("Total Money: $0.00");
	static JComponent[] labelList = new JLabel[]{pennyCount, nickelCount, dimeCount, quarterCount, totalMoney};
	
	public static void main(String[] args){
		//Initializing frame.
		JFrame frame = new JFrame("PiggyBankYay!");
		frame.setSize(640, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Initializing panels.
		JPanel input = new JPanel();
		JPanel inputSub1 = new JPanel();
		JPanel inputSub2 = new JPanel();
		
		//Initializing JButtons to be used, then putting them in an array.
		JButton addPenny = new JButton("Add Penny");
		JButton addNickel = new JButton("Add Nickel");
		JButton addDime = new JButton("Add Dime");
		JButton addQuarter = new JButton("Add Quarter");
		JButton breakIt = new JButton("Break the bank!");
		JButton[] buttonList = new JButton[]{addPenny, addNickel, addDime, addQuarter, breakIt};
		
		//Adding all the ActionListeners.
		addPenny.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				//Content of all methods pretty much the same.
				addPenny(1); //Add value to pennyCount
				p.coinList.add(new Penny()); //add that type coin to the ArrayList in PiggyBank
				p.calcVal(totalMoney); //Calculate the total money and setText() of JLabel accordingly
				pennyCount.setText("Pennies: " + numPenny); //Set the text of the numPenny.
			}
		});
		
		addNickel.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				addNickel(1);
				p.coinList.add(new Nickel());
				p.calcVal(totalMoney);
				nickelCount.setText("Nickels: " + numNickle);
			}
		});
		
		addDime.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				addDime(1);
				p.coinList.add(new Dime());
				p.calcVal(totalMoney);
				dimeCount.setText("Dimes: " + numDime);
			}
		});
		
		addQuarter.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				addQuarter(1);
			p.coinList.add(new Quarter());
				p.calcVal(totalMoney);
				quarterCount.setText("Quarters: " + numQuarter);
			}
		});
		//This method clears the banks accout out.
		breakIt.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				p.youBrokeSon(); //Clears money in PiggyBank
				p.calcVal(totalMoney);
				SteamSummerSale(); //Clears money on GUI
				//Makes sure the message gets across.
				quarterCount.setText("Quarters: " + numQuarter);
				dimeCount.setText("Dimes: " + numDime);
				nickelCount.setText("Nickels: " + numNickle);
				pennyCount.setText("Pennies: " + numPenny);
			}
		});
		
		//Setting layout to make it pretty.
		input.setLayout(new GridLayout(1, 1));
		
		//Custom method I added to avoid lots of add() methods.
		addPanel(buttonList, inputSub1);
		addPanel(labelList, inputSub2);
		
		//Adding the components.
		input.add(inputSub1);
		input.add(inputSub2);
		frame.add(input);
		frame.setVisible(true);
	}
	//Saves a few lines of code, to be used in other homeworks in the future.
	public static void addPanel(JComponent[] cList, JPanel target) {
		target.setLayout(new GridLayout(3, 2));
		for(JComponent jc: cList){
			target.add(jc);
		}
	}
	
	//These methods increase the count of the corresponding thing.
	public static void addPenny(int x){
		numPenny += x;
	}
	public static void addNickel(int x){
		numNickle += x;
	}
	public static void addDime(int x){
		numDime += x;
	}
	public static void addQuarter(int x){
		numQuarter += x;
	}
	
	//This method is named for the infamous mid-Summer event also known as the Black Hole of Money.
	public static void SteamSummerSale(){
		numPenny = 0;
		numNickle = 0;
		numDime = 0;
		numQuarter = 0;
	}
}
