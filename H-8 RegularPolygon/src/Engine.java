import java.util.Random;


public class Engine {
	public static void main(){
		Random rand = new Random();
		int sides = rand.nextInt(100) + 1;
		int sideLength = rand.nextInt(100) + 1;
		RegularPolygon p = new RegularPolygon(sideLength, sides);
		p.getResults();
	}
}
