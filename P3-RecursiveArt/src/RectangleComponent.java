import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.util.Random;

import javax.swing.JComponent;


public class RectangleComponent extends JComponent implements ActionListener{
	Random rand = new Random();
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		drawRect(g2);
		g2.setColor(new Color((rand.nextDouble(1)), (rand.nextInt(9)/10), (rand.nextInt(9)/10)));
		
//		recursiveColor(50, 50, 50, 50, 5, g2)
;	}
	public void drawRect(Graphics2D g2){
		Rectangle2D rect = new Rectangle2D.Double(50, 50, 50, 50);
		g2.draw(rect);
	}
	public void recursiveColor(int x, int y, int w, int h, int colorfactor, Graphics2D g2){
		if(w == 0 && h == 0){
			
		}else{
			g2.setColor(new Color((rand.nextInt(10)/10), (rand.nextInt(10)/10), (rand.nextInt(10)/10)));
			g2.fill3DRect(x, y, w, h, true);
			recursiveColor(x + 10, y + 10, w - 1, h - 1, colorfactor*2, g2);
		}
	}
	public void actionPerformed(ActionEvent e) {
	}
}
