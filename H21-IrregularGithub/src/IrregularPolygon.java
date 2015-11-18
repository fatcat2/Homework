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
			for(int i = 0; i < poly.size(); i++){
				pencil.move(poly.get(i).getX(), poly.get(i).getY());
			}
		}
	}
	
	public void add(double x, double y){
		poly.add(new Point2D.Double(x, y));
	}
}