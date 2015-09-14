import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;


public class Arrow extends Line2D{
	int x;
	int y;
	int x_1;
	int x_2;
	int y_1;
	int y_2;
	
	int length;
	public Arrow(int x, int y, int smallLineLength, int lineLength, int degree, Graphics2D g2, boolean flip){
		this.x = x;
		this.y = y;
		x_1 = (int) (smallLineLength * Math.cos(degree));
		x_2 = x_1 + lineLength;
		y_1 = (int) (y + (smallLineLength * Math.sin(degree)));
		y_2 = (int) (y - (smallLineLength * Math.sin(degree)));
		Line2D.Double[] arr;
		if (flip){
			x_2 += x_1;
			x_1 += x;
			arr = new Line2D.Double[]{new Line2D.Double(x_1, y, x_2, y_1), new Line2D.Double(x_1, y, x_2, y_2)};
		}else{
			arr = new Line2D.Double[]{new Line2D.Double(x_1, y_1, x, y), new Line2D.Double(x_1, y_2, x, y)};
		}
		for(int i = 0; i < arr.length; i++){
			g2.draw(arr[i]);
		}
		
	}
	public void setX_1(int x){
		x_1 = x;
	}
	public void hFlip(){
		setX_1(x);
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public int getLength(){
		return length;
	}
	@Override
	public Rectangle2D getBounds2D() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public double getX1() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double getY1() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public Point2D getP1() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public double getX2() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double getY2() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public Point2D getP2() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setLine(double x1, double y1, double x2, double y2) {
		// TODO Auto-generated method stub
		
	}
}
