import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Path2D;

import javax.swing.JComponent;


@SuppressWarnings("serial")
public class KochCurve extends JComponent{
	int level = 0;
	int length;
	int x;
	int y;

	Path2D p = new Path2D.Double();
	public KochCurve(int a, int b, int len){
		x = a;
		y = b;
		length = len;
	}
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		drawLine(g2);
	}
	public void drawLine(Graphics2D g2){
		if(level == 1){
			p.moveTo(x, y);
			p.lineTo(x + length/3, y);
			p.lineTo(x + length/2, y - (x/3 * Math.sqrt(3)));
			p.lineTo(x + 2*length/3, y);
			p.lineTo(x + length, y);
		}else if(level > 1){
			p.lineTo(x, y);
			
			drawLine(g2);
		}
		g2.draw(p);
	}
}
