import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;

import javax.swing.JComponent;


public class RectangleComponent extends JComponent{
	Random rand = new Random();
	
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		recursiveDraw(100, 0, 0, 250, 250, g2);
	}
	
	public void recursiveDraw(int n, int x, int y, int w, int h, Graphics2D g2){
		if(n == 0){	
//			g2.drawRect(0, 0, w, h);
		}else{
//			g2.setColor(new Color(200, 50, 67, 40));
			g2.drawRect(x, y, w, h);
//			g2.setColor(new Color(50, 50, 225, 40));
//			g2.fillOval(x, y, w, h);
//			g2.setColor(new Color(200, 50, 67, 40));
//			g2.fillRect(x, y, w/2, h/2);
//			g2.setColor(new Color(50, 50, 225, 40));
//			g2.fillOval(x, y, w/3, h/3);
			recursiveDraw(n-1, x + 10, y + 10, w-10, h-10, g2);
		}
	}
}
