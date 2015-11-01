/*
 * by Ryan Chen
 * Period 1 APCS
 * Steinke
 * Engine Class of A12.4
 * Only class of A12.4
 * This part is kind of pointless.
 * Do you really read this part?
 */
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class Engine {
	static JTextArea a1 = new JTextArea();
	static double GPA_total = 0;
	static HashMap m = new HashMap();
	public static void main(String[] args){
		//Initialize map
		m.put("A", "4");
		m.put("B", "3");
		m.put("C", "2");
		m.put("D", "1");
		m.put("F", "0");
		
		//Construct and size frame
		JFrame frame = new JFrame("Grades");
		frame.setSize(500, 500);
		
		//Construct panels, buttons and label
		JPanel p = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		JButton b1 = new JButton("CALCULATE");
		JLabel l1 = new JLabel("Please enter you grades below\n");
		
		//Add action listener to button
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				boolean eligible = true;
				//Split input string into array, use for loop to get total GPA
				String[] arr = a1.getText().split("\\s");
				for(int a = 0; a < arr.length; a++){
					String z = arr[a].toUpperCase();
					if(z.equals("F") || arr.length < 4){
						eligible = false;
					}
					if(m.containsKey(z)){
						String s = (String) m.get(z);
						GPA_total = GPA_total + Integer.parseInt(s);
					}else{
						System.out.println("Wrong values, try again");
						break;
					}
				}
				
				//Conditionals for output
				double gpa = GPA_total / arr.length;
				String output = "";
				if(eligible){
					if(gpa >= 2.0){
						output = "GPA: " + gpa + " Eligible";
					}else{
						output = "GPA: " + gpa + " Ineligible, GPA below 2.0";
					}
				}else{
					if(arr.length < 4){
						output = "GPA: " + gpa + " Ineligible, too few classes";
					}else{
						if(gpa >= 2.0){
							output = "GPA: " + gpa + " Ineligible, gpa above 2.0 but has F grade";
						}else{
							output = "GPA: " + gpa + " Ineligible, gpa below 2.0 and has F grade";
						}
					}
					
				}
				a1.setText(output);;
			}
		});
		
		//Adding and setting size to/of panels
		p3.add(l1);
		p.setPreferredSize(new Dimension(500, 100));
		p2.setPreferredSize(new Dimension(500, 100));
		p2.add(a1);
		
		//Adding to frame.
		frame.add(p3, BorderLayout.NORTH);
		frame.add(p.add(b1), BorderLayout.SOUTH);
		frame.add(p2, BorderLayout.CENTER);
		frame.setVisible(true);
	}
	
}
