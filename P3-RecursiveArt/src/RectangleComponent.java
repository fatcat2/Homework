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
	public void recursiveColor(int x, int y, int w, int h, int colorfactor, Graphics2D g2){
		if(w == 0 && h == 0){
			
		}else{
			g2.setColor(new Color(((int)Math.sin(colorfactor))));
			g2.fillRect(x, y, w, h);
			recursiveColor(x - 1, y - 1, w - 1, h - 1, int )
		}
	}
}
