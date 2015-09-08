import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Engine {
	static int numPenny;
	static int numNickle;
	static int numDime;
	static int numQuarter;
	static int count;
	static PiggyBank p = new PiggyBank();
	static JLabel pennyCount = new JLabel("Pennies: 0");
	static JLabel nickelCount = new JLabel("Nickels: 0");
	static JLabel dimeCount = new JLabel("Dimes: 0");
	static JLabel quarterCount = new JLabel("Quarters: 0");
	
	public static void main(String[] args){
		JFrame frame = new JFrame("PiggyBankYay!");
		frame.setSize(640, 400);
		JPanel input = new JPanel();
		JPanel inputSub1 = new JPanel();
		JPanel inputSub2 = new JPanel();
		
		JButton addPenny = new JButton("Add Penny");
		JButton addNickel = new JButton("Add Nickel");
		JButton addDime = new JButton("Add Dime");
		JButton addQuarter = new JButton("Add Quarter");
		JButton[] buttonList = new JButton[]{addPenny, addNickel, addDime, addQuarter};
		
		addPenny.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				addPenny(1);
				pennyCount.setText("Pennies: " + numPenny);
			}
		});
		
		addNickel.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				addNickel(1);
				nickelCount.setText("Nickels: " + numNickle);
			}
		});
		
		addDime.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				addDime(1);
				dimeCount.setText("Dimes: " + numDime);
			}
		});
		
		addQuarter.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				addQuarter(1);
				quarterCount.setText("Quarters: " + numQuarter);
			}
		});
		JComponent[] labelList = new JLabel[]{pennyCount, nickelCount, dimeCount, quarterCount};
		
		input.setLayout(new GridLayout(1, 1));
		inputSub1.setLayout(new GridLayout(7, 1));
		inputSub2.setLayout(new GridLayout(1, 7));
		addPanel(buttonList, inputSub1);
		addPanel(labelList, inputSub2);
		input.add(inputSub1);
		input.add(inputSub2);
		frame.add(input);
		frame.setVisible(true);
	}
	public static void addPanel(JComponent[] cList, JPanel target) {
		target.setLayout(new GridLayout(3, 1));
		for(JComponent jc: cList){
			target.add(jc);
		}
	}
	public static int getCount(){
		return count;
	}
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
}
