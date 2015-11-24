/*
 * by Ryan Chen
 * i like pineapples
 */
import java.awt.geom.*;     // for Point2D.Double
import java.util.ArrayList; // for ArrayList
import gpdraw.*;            // for DrawingTool

public class IrregularPolygon{
	DrawingTool pencil;
	private ArrayList <Point2D.Double> poly;
	public IrregularPolygon(){
		poly = new ArrayList<Point2D.Double>();
	}
	
	public double getArea(){
		return 0;
	}
	
	public void draw(){
		pencil  = new DrawingTool(new SketchPad(500, 500));
		if(poly.size() < 3){
			System.out.println("This is not a polygon, please add " + (3 - poly.size()) + "more points.");
		}else{
			pencil.up();
			pencil.move(poly.get(0).getX(), poly.get(0).getY());
			pencil.down();
			for(int i = 1; i < poly.size(); i++){
				pencil.move(poly.get(i).getX(), poly.get(i).getY());
			}
		}
	}
	
	public void add(double x, double y){
		poly.add(new Point2D.Double(x, y));
	}
	
	public double perimeter(){
		double sum = 0;
		for(int i = 0; i < poly.size(); i++){
			if(i == poly.size()-1){
				double a = Math.pow(poly.get(i).getX()-poly.get(0).getX(), 2);
				double b = Math.pow(poly.get(i).getY()-poly.get(0).getY(), 2);
				double x = Math.sqrt(a+b);
				sum += x;
			}else{
				double a = Math.pow(poly.get(i).getX()-poly.get(i+1).getX(), 2);
				double b = Math.pow(poly.get(i).getY()-poly.get(i+1).getY(), 2);
				double x = Math.sqrt(a+b);
				sum += x;
			}
		}
		return sum;
	}
	
	public double area(){
		double sum = 0;
		double sum2 = 0;
		for(int i = 0; i < poly.size(); i++){
			if(i == poly.size()-1){
				double x = poly.get(poly.size()-1).getX() * poly.get(0).getY();
				sum += x;
			}else{
				double x = poly.get(i).getX() * poly.get(i + 1).getY();
				sum += x;
			}
		}
		for(int i = 0; i < poly.size(); i++){
			if(i == poly.size()-1){
				double x = poly.get(poly.size()-1).getX() * poly.get(0).getY();
				sum2 -= x;
			}else{
				double x = poly.get(i).getX() * poly.get(i + 1).getY();
				sum2 -= x;
			}
		}
		return (sum + sum2)/2;
	}
}