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
	public static void main(String[] args){
		
		//Declaring panels and frame.
		JFrame frame = new JFrame("MPG Calculator 1000");
		JPanel p = new JPanel();
		JPanel p2 = new JPanel();
		
		//Initializing frame
		frame.setSize(800, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Declaring and initializing final variables, will be used in the ActionListener.
		final JTextField enterMiles = new JTextField(15);
		final JTextField enterGasUsed = new JTextField(5);
		final JLabel output = new JLabel("Your mileage will be shown here.");
		final Car c = new Car();
		
		//Declaring and init JLabels and buttons.
		JLabel instructions = new JLabel("<html><h1>Welcome to the MPG Calculator 1000!</h1></html>");
		JLabel i2 = new JLabel("<html>Please enter the amount of miles in the top box, and the number of gallons used in the lower box.</html>");
		JButton b4 = new JButton("DRIVE");
		b4.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				//Using the mutator methods of the Car class to set the values to be used the calculate.
				c.setMiles(Double.parseDouble(enterMiles.getText()));
				c.setGas(Double.parseDouble(enterGasUsed.getText()));
				writeOut(output, c);
			}
		});
		//Adding the components to the frames and panels.
		addPanel(new JComponent[]{instructions, i2, output}, p);
		addPanel(new JComponent[]{enterMiles, enterGasUsed, b4}, p2);
		endFrame(new JComponent[]{p, p2}, frame);
	}
	//This method is adds an array of components to the target JPanel.
	public static void addPanel(JComponent[] cList, JPanel target) {
		target.setLayout(new GridLayout(3, 1));
		for(int i = 0; i < cList.length; i++){
			target.add(cList[i]);
		}
	}
	//Same thing, but for the frame, also includes setVisible().
	public static void endFrame(JComponent[] cList, JFrame frame){
		frame.setLayout(new GridLayout(1, 2));
		for(int i = 0; i < cList.length; i++){
			frame.add(cList[i]);
		}
		frame.setVisible(true);
	}
	//This method sets the text of the JLabel to the result using the method stopAtTheGasStation().
	public static void writeOut(JLabel output, Car c){
		try{
			output.setText(c.stopAtTheGasStation(c.getMiles(), c.getGas()));
		}catch(NumberFormatException e1){
			output.setText("Please enter a valid number from 0 to inifinity!");
		}
	}
}