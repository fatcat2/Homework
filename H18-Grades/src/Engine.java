import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class Engine {
	
	public static void main(String[] args){
		JFrame frame = new JFrame("Grades");
		frame.setSize(500, 500);
		JPanel p = new JPanel();
		JPanel p2 = new JPanel();
		p.setPreferredSize(new Dimension(500, 100));
		p2.setPreferredSize(new Dimension(500, 100));
		p2.add(new JTextArea());
		frame.add(p.add(new JButton("CALCULATE")), BorderLayout.SOUTH);
		frame.add(p2, BorderLayout.NORTH);
		frame.setVisible(true);
	}
	
}
