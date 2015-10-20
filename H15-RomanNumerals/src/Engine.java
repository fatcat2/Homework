import java.util.Scanner;


public class Engine {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n;
		boolean keepGoing = true;
		while(keepGoing){
			try{
				n = scan.nextInt();
				keepGoing = false;
			}catch(NumberFormatException e){
				System.out.println("try again");
			}
		}
		
	}
}
