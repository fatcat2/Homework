import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;


public class IllusionOne extends JComponent{
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		g2.draw(new Arrow(50, 50, 20, 80, 45, g2, false));
		g2.draw(new Arrow(80, 50, 20, 80, 45, g2, true));
	}

}
