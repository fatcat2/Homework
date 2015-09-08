import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Engine {
	int numPenny;
	int numNickle;
	int numDime;
	int numQuarter;
	static int count;
	static PiggyBank p = new PiggyBank();
	static Coin[] coinList = new Coin[]{new Penny(), new Nickel(), new Dime(), new Quarter()};
	public static void main(String[] args){
		Penny p = new Penny();
		System.out.println(p.getValue());
//		JFrame frame = new JFrame("PiggyBankYay!");
//		frame.setSize(640, 400);
//		JPanel input = new JPanel();
//		JPanel inputSub1 = new JPanel();
//		JPanel inputSub2 = new JPanel();
//		
//		JButton addPenny = new JButton("Add Penny");
//		JButton addNickel = new JButton("Add Nickel");
//		JButton addDime = new JButton("Add Dime");
//		JButton addQuarter = new JButton("Add Quarter");
//		JButton[] buttonList = new JButton[]{addPenny, addNickel, addDime, addQuarter};
//		
//		addPenny.addActionListener(new ActionListener(){
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				Penny p = new Penny();
//				System.out.println(p.getValue());
//			}
//		});
//		
//		JLabel pennyCount = new JLabel("Pennies: 0");
//		JLabel nickelCount = new JLabel("Nickels: 0");
//		JLabel dimeCount = new JLabel("Dimes: 0");
//		JLabel quarterCount = new JLabel("Quarters: 0");
//		JComponent[] labelList = new JLabel[]{pennyCount, nickelCount, dimeCount, quarterCount};
//		
//		input.setLayout(new GridLayout(1, 1));
//		inputSub1.setLayout(new GridLayout(7, 1));
//		inputSub2.setLayout(new GridLayout(1, 7));
//		addPanel(buttonList, inputSub1);
//		addPanel(labelList, inputSub2);
//		input.add(inputSub1);
//		input.add(inputSub2);
//		frame.add(input);
//		frame.setVisible(true);
//		
//		
//		
////		JPanel output = new JPanel();
////		JPanel outputSub1 = new JPanel();
////		JPanel outputSub2 = new JPanel();
	}
	public static void addPanel(JComponent[] cList, JPanel target) {
		target.setLayout(new GridLayout(3, 1));
		for(JComponent jc: cList){
			target.add(jc);
		}
	}
	public static void addManyActionListeners(JButton[] bList){
		for(count = 0; count < bList.length; count++){
			bList[count].addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println(coinList[getCount()].val);
				}
			});
		}
	}
	public static int getCount(){
		return count;
	}
}
