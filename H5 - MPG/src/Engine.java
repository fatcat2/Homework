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
	
	public static void main(String[] args){
		init();
		JButton b3 = new JButton("Choose car");
		JButton b4 = new JButton("DRIVE");
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		b3.addActionListener(new ActionListener(){
			int carCount;
			@Override
			public void actionPerformed(ActionEvent e){
                carCount++;
                if(carCount > 2){carCount = 0;}
                System.out.println(carCount);
                carChoose.setText(cars[carCount]);
                setGasTankSize();
			}
		});
		b4.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				int miles;
				String s1;
				String s2;
				String s3;
				String s4;
				try{
				miles = Integer.parseInt(enterMiles.getText());
				s1 = "<html>You traveled: " + miles + " miles.<br>";
				s2 = "Your gas tank size is: " + getGasTankSize() + " gallons.<br>";
				s3 = "And your mileage is: "+ calcMPG(gasTankSize, miles) + " mpg!</html>";
				s4 = s1 + s2 + s3;
				output.setText(s4);
				}catch(NumberFormatException e1){
					output.setText("Please enter a valid number from 0 to inifinity!");
				}
			}
		});
		p2.add(b3);
		p2.add(carChoose);
		p3.add(enterMiles);
		p3.add(b4);
		frame.setLayout(new GridLayout(3, 2));
		frame.add(output);
		frame.add(enterMiles);
		frame.add(p2);
		frame.add(p3);
		frame.pack();
	}
	public static double calcMPG(double tankSize, int mileage){
		double mpg = mileage / tankSize;
		return mpg;
	}
	public static double getGasTankSize(){
		return gasTankSize;
	}
	public static void setGasTankSize(){
		if(carChoose.getText().equals("Corvette")){
			gasTankSize = gasTank[0];
		}else if(carChoose.getText().equals("Ford F-150")){
			gasTankSize = gasTank[1];
		}else if(carChoose.getText().equals("Motorcycle")){
			gasTankSize = gasTank[2];
		}
	}
	public static void init(){
		p2 = new JPanel();
		p3 = new JPanel();
		frame = new JFrame("MPG Calculator 2000");
		frame.setSize(800, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
