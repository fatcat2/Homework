
public class Engine {

	public static void main(String[] args) {
		IrregularPolygon p = new IrregularPolygon();
		p.add(-30, 5);
		p.add(10, 5);
		p.add(10, 19);
		p.add(-30, 5);
		p.draw();
		System.out.println(p.area());
		System.out.println(p.perimeter());
	}

}
