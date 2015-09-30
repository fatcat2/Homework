import java.util.Scanner;


public class Engine {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args){
		int length;
		int width;
		int height;
		int weight;
		System.out.println("Let's send a package!");
		System.out.println("Please enter the length: ");
		length = scan.nextInt();
		System.out.println("Please enter the width: ");
		width = scan.nextInt();
		System.out.println("Please enter the height: ");
		height = scan.nextInt();
		System.out.println("Please enter the weight: ");
		weight = scan.nextInt();
		Package p = new Package(length, width, height, weight);
	}
}
