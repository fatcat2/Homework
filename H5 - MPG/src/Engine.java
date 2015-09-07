import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class Engine {
	@SuppressWarnings({ "static-access" })
	public static void main(String[] args){
		final String[] cars = new String[]{"Corvette", "F-150", "Motorcycle"};
		final Double[] gasTank = new Double[]{19.1, 36.0, 8.0};
		final JTextField enterMiles = new JTextField(15);
		final JTextArea output = new JTextArea(50, 35);
		final JLabel fillStatus = new JLabel("Gas Status: Filled up");
		final JLabel carChoose = new JLabel("Corvette");
		final JButton b1 = new JButton("Enter Miles");
		final JButton b2 = new JButton("Fill UP DA METER");
		final JButton b3 = new JButton("Choose car");
		final JButton b4 = new JButton("DRIVE");
		String mileString;
		double gasTankSize = 1;
		b1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				output.setText(enterMiles.getText());
			}
		});
		b2.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				if(fillStatus.getText().equals("Gas Status: Filled up")){
					output.setText("Already filled up, vehicle ready to roll.");
				}else{
					fillStatus.setText("Gas Status: Filled up");
				}
			}
		});
		b3.addActionListener(new ActionListener(){
			int carCount;
			@Override
			public void actionPerformed(ActionEvent e){
                carCount++;
                if(carCount > 2){carCount = 0;}
                System.out.println(carCount);
                carChoose.setText(cars[carCount]);
			}
		});
		b4.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				fillStatus.setText("Gas Status: Not Full");
			}
		});
		if(carChoose.getText().equals("Corvette")){
			gasTankSize = gasTank[0];
		}else if(carChoose.getText().equals("Ford F-150")){
			gasTankSize = gasTank[1];
		}else if(carChoose.getText().equals("Motorcycle")){
			gasTankSize = gasTank[2];
		}
		int miles = Integer.parseInt(enterMiles.getText());
		
		output.setText("You traveled: " + miles + "\nYour Tank Size is: " + gasTankSize + "\nAnd your mileage is: " + calcMPG(gasTankSize, miles) + "mpg!");
		
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		JFrame frame = new JFrame("MPG Calculator 2000");
		frame.setSize(800, 500);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		p2.setLayout(new GridLayout(5, 1));
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		p2.add(b4);
		
		p3.setLayout(new GridLayout(5, 1));
		p3.add(enterMiles);
		p3.add(fillStatus);
		p3.add(carChoose);
		
		frame.add(p2, BorderLayout.EAST);
		frame.add(p3, BorderLayout.CENTER);
		frame.add(output, BorderLayout.WEST);
	}
	public static double calcMPG(double tankSize, int mileage){
		double mpg = mileage / tankSize;
		return mpg;
	}
}
