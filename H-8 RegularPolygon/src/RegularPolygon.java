
public class RegularPolygon {
	int sides;
	double sideLength;
	double perimeter;
	double vertexAngle;
	double radius;
	double radiusCircle;
	double area;
	public RegularPolygon(double sL, int sideNum){
		calc(sL, sideNum);
	}
	public void setSides(int x){
		sides = x;
	}
	public void getSideLength(double x){
		sideLength = x;
	}
	public void calc(double sL, int sideNum){
		sides = sideNum;
		sideLength = sL;
		vertexAngle = ((sides - 2) / sides) * 180;
		perimeter = sides * sideLength;
		radius = (0.5 * sides) * Math.tan(sides / Math.PI);
		radiusCircle = (0.5 * sides) * Math.sin(sides / Math.PI);
		area = (0.5) * sides * Math.pow(radiusCircle, 2) * Math.sin((2 * Math.PI) / sides);
	}
	public int getSides(){
		return sides;
	}
	public double getSideLength(){
		return sideLength;
	}
	public double getPerimeter(){
		return perimeter;
	}
	public double getVertexAngle(){
		return vertexAngle;
	}
	public double getRadius(){
		return radius;
	}
	public double getRadiusCircle(){
		return radiusCircle;
	}
	public double getArea(){
		return area;
	}
	public void getResults(){
		System.out.println("Sides: " + sides);
		System.out.println("Side Length: " + sideLength);
		System.out.println("Perimeter: " + getPerimeter());
		System.out.println("Vertex Angle: " + getVertexAngle());
		System.out.println("Radius: " + getRadius());
		System.out.println("Radius of Inscribed Circle: " + getRadiusCircle());
		System.out.println("Area: " + getArea());
	}
}
