import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;


public class IllusionOne extends JComponent{
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		g2.draw(new Arrow(50, 50, 20, 30, 90, g2, false, true));
		g2.draw(new Arrow(90, 50, 20, 20, 90, g2, true, false));
		
		g2.draw(new Arrow(50, 70, 10, 30, 90, g2, true, true));
		g2.draw(new Arrow(90, 70, 10, 30, 90, g2, false, false));
	}

}
