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
	
	static double gasTankSize = 1;
	static String[] cars = new String[]{"Corvette", "F-150", "Motorcycle"};
	static JLabel carChoose = new JLabel("Corvette");
	static Double[] gasTank = new Double[]{19.1, 36.0, 8.0};
	static JTextField enterMiles = new JTextField(15);
	static JTextArea output = new JTextArea(50, 35);
	static JLabel fillStatus = new JLabel("Gas Status: Filled up");
	static JFrame frame;
	static JPanel p2;
	static JPanel p3;
	
	public static void main(String[] args){
		initFrame();
		JButton b3 = new JButton("Choose car");
		JButton b4 = new JButton("DRIVE");
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

				int miles = Integer.parseInt(enterMiles.getText());
				output.setText("You traveled: " + miles  + " miles."+ "\nYour Tank Size is: " + getGasTankSize() + "\nAnd your mileage is: " + calcMPG(gasTankSize, miles) + "mpg!");
				fillStatus.setText("Gas Status: Not Full");
			}
		});
		
		
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		
		p2.setLayout(new GridLayout(5, 1));
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
	public static void initFrame(){
		p2 = new JPanel();
		p3 = new JPanel();
		frame = new JFrame("MPG Calculator 2000");
		frame.setSize(800, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
