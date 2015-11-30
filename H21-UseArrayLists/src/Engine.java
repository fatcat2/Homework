public class Engine {

	public static void main(String[] args) {
		StatMan s = new StatMan("src/numbers.txt");
		System.out.println("Average: " + s.getAvg());
		System.out.println("Standard Deviation: " + s.stdDev());
		System.out.println("Mode: " + s.getMode());
	}

}
