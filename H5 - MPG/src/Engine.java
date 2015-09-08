/*
 * Author: fatcat2
 * Date: September 6, 2015
 * Description: This is the Engine class of the MPG Calculator. The program has the 
 * user enter mileage and select a vehicle, then calculates the gas mileage of the car.
 */
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Engine {
	static JFrame frame;
	static JPanel p;
	static JPanel p2;
	
	public static void main(String[] args){
		p = new JPanel();
		p2 = new JPanel();
		frame = new JFrame("MPG Calculator 2000");
		init(frame, p, p2);
		final JTextField enterMiles = new JTextField(15);
		final JLabel output = new JLabel("Your mileage will be shown here.");
		final JTextField enterGasUsed = new JTextField(5);
		final Car c = new Car();
		JLabel instructions = new JLabel("<html><h1>Welcome to the MPG Calculator 3000!</h1></html>");
		JLabel i2 = new JLabel("<html>Please enter the amount of miles in the top box, and the number of gallons used in the lower box.</html>");
		init(frame, p, p2);
		JButton b4 = new JButton("DRIVE");
		b4.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				c.setMiles(Double.parseDouble(enterMiles.getText()));
				c.setGas(Double.parseDouble(enterGasUsed.getText()));
				writeOut(output, c);
			}
		});
		addPanel(new JComponent[]{instructions, i2, output}, p);
		addPanel(new JComponent[]{enterMiles, enterGasUsed, b4}, p2);
		endFrame(new JComponent[]{p, p2}, frame);
	}
	public static void addPanel(JComponent[] cList, JPanel target) {
		target.setLayout(new GridLayout(3, 1));
		for(int i = 0; i < cList.length; i++){
			target.add(cList[i]);
		}
	}
	public static void endFrame(JComponent[] cList, JFrame frame){
		frame.setLayout(new GridLayout(1, 2));
		for(int i = 0; i < cList.length; i++){
			frame.add(cList[i]);
		}
		frame.setVisible(true);
	}
	public static void init(JFrame f, JPanel p, JPanel p2){
		f.setSize(800, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void writeOut(JLabel output, Car c){
		try{
			output.setText(c.stopAtTheGasStation(c.getMiles(), c.getGas()));
		}catch(NumberFormatException e1){
			output.setText("Please enter a valid number from 0 to inifinity!");
		}
	}
}