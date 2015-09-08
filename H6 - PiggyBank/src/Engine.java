import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
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
		frame.setSize(600, 400);
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
		
		
		
		input.setLayout(new GridLayout(2, 1));
		inputSub1.setLayout(new BoxLayout(frame, BoxLayout.Y_AXIS));
		inputSub2.setLayout(new BoxLayout(frame, BoxLayout.Y_AXIS));
		
		
		
//		JPanel output = new JPanel();
//		JPanel outputSub1 = new JPanel();
//		JPanel outputSub2 = new JPanel();
	}
	public void addPanel(JComponent[] cList, JPanel target) {
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
