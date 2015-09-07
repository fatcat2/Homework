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
	
	static double gasTankSize = 1;
	static String[] cars = new String[]{"Corvette", "F-150", "Motorcycle"};
	static JLabel carChoose = new JLabel("Corvette");
	static Double[] gasTank = new Double[]{19.1, 36.0, 8.0};
	static JTextField enterMiles = new JTextField(15);
	static JLabel output = new JLabel("<html>Welcome to the MPG Calculator 3000!<br>Please enter the amount of miles you would like to travel.<br>You are able to choose from one of the cars below.<br>Just click the choose car button to cycle through the choices.<br>Each car has a different sized gas tank.<br> It will affect the end result.</html>");
	static JFrame frame;
	static JPanel p2;
	static JPanel p3;
	static int carCount = 0;
	
	public static void main(String[] args){
		init();
		JButton b3 = new JButton("Choose car");
		JButton b4 = new JButton("DRIVE");
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		b3.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
                setGasAndCar();
			}
		});
		b4.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				writeOut();
			}
		});
		JComponent[] cList1 = new JComponent[]{b3, carChoose}; //p2
		JComponent[] cList2 = new JComponent[]{enterMiles, b4};
		JComponent[] cList3 = new JComponent[]{output, enterMiles, p2, p3};
		addFrame(cList1, p2);
		addFrame(cList2, p3);
		addFrame(cList3, frame);
	}
	
	
	public static void addFrame(JComponent[] cList, JFrame target) {
		frame.setLayout(new GridLayout(3, 2));
		for(int i = 0; i < cList.length; i++){
			target.add(cList[i]);
		}
		frame.pack();
	}


	public static void addFrame(JComponent[] cList, JComponent target){
		for(int i = 0; i < cList.length; i++){
			target.add(cList[i]);
		}
	}
	public static double calcMPG(double tankSize, int mileage){
		double mpg = mileage / tankSize;
		return mpg;
	}
	public static void init(){
		p2 = new JPanel();
		p3 = new JPanel();
		frame = new JFrame("MPG Calculator 2000");
		frame.setSize(800, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	public static double getGasTankSize(){
		return gasTankSize;
	}
	public static void setGasAndCar(){
        carCount++;
        if(carCount > 2){carCount = 0;}
        carChoose.setText(cars[carCount]);
        gasTankSize = gasTank[carCount];
	}
	public static void writeOut(){
		int miles;
		try{
		miles = Integer.parseInt(enterMiles.getText());
		output.setText("<html>You traveled: " + miles + " miles.<br>" + "Your gas tank size is: " + getGasTankSize() + " gallons.<br>" + "And your mileage is: "+ calcMPG(gasTankSize, miles) + " mpg!</html>");
		}catch(NumberFormatException e1){
			output.setText("Please enter a valid number from 0 to inifinity!");
		}
	}
}
