import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;

import javax.swing.JComponent;


public class RectangleComponent extends JComponent{
	Random rand = new Random();
	
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		recursiveDraw(100, 0, 0, 500, 500, g2);
	}
	
	public void recursiveDraw(int n, int x, int y, int w, int h, Graphics2D g2){
		if(n == 0){	
		}else{
			g2.drawRect(x, y, w, h);
			recursiveDraw(n-1, x + 6, y + 6, w-10, h-10, g2);
		}
	}
}
