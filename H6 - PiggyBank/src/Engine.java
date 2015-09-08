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
	int numHalfDollar;
	int numPresDollar;
	int numNADollar;
	public static void main(String[] args){
		JFrame frame = new JFrame("PiggyBankYay!");
		frame.setSize(640, 400);
		PiggyBank p = new PiggyBank();
		
		JPanel input = new JPanel();
		JPanel inputSub1 = new JPanel();
		JPanel inputSub2 = new JPanel();
		
		JButton addPenny = new JButton("Add Penny");
		JButton addNickel = new JButton("Add Nickel");
		JButton addDime = new JButton("Add Dime");
		JButton addQuarter = new JButton("Add Quarter");
		JButton addHalfDollar = new JButton("Add Half Dollar");
		JButton addPresDollar = new JButton("Add Presidential Dollar");
		JButton addNADollar = new JButton("Add Native American Dollar");
		JComponent[] buttonList = new JComponent[]{addPenny, addNickel, addDime, addQuarter, addHalfDollar, addPresDollar, addNADollar};
		
		JLabel pennyCount = new JLabel("0");
		JLabel nickelCount = new JLabel("0");
		JLabel dimeCount = new JLabel("0");
		JLabel quarterCount = new JLabel("0");
		JLabel halfDollarCount = new JLabel("0");
		JLabel presDollarCount = new JLabel("0");
		JLabel nADollarCount = new JLabel("0");
		JComponent[] labelList = new JLabel[]{pennyCount, nickelCount, dimeCount, quarterCount, halfDollarCount,presDollarCount, nADollarCount};
		
		input.setLayout(new GridLayout(1, 1));
		inputSub1.setLayout(new GridLayout(7, 1));
//		inputSub2.setLayout(new GridLayout(1, 7));
		addPanel(buttonList, inputSub1);
		addPanel(labelList, inputSub2);
		input.add(inputSub1);
//		input.add(inputSub2);
		frame.add(input);
		frame.setVisible(true);
		
//		JPanel output = new JPanel();
//		JPanel outputSub1 = new JPanel();
//		JPanel outputSub2 = new JPanel();
	}
	public static void addPanel(JComponent[] cList, JPanel target) {
		target.setLayout(new GridLayout(3, 1));
		for(JComponent jc: cList){
			target.add(jc);
		}
	}
	public void addManyActionListeners(JButton[] bList){
		for(int i = 0; i < bList.length; i++){
			bList[i].addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
		}
	}
}
