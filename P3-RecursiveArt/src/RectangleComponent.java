import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;


public class RectangleComponent extends JComponent{
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
//		drawRect(g2);
		g2.setColor(Color.black);
		g2.fillRect(50, 50, 50, 50);
	}
	public void drawRect(Graphics2D g2){
		Rectangle2D rect = new Rectangle2D.Double(50, 50, 50, 50);
		g2.draw(rect);
	}
}
