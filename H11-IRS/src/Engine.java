import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * By Ryan Chen
 * 30 September 2015
 * Engine class of the H11-IRS Assignment
 */
public class Engine {
	static boolean marriedStatus; //Variables for UI
	static int income;
	static String s;
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	//UI in console
		System.out.println("Welcome to the IRS!\nPlease enter your taxable income: ");
		boolean success = false;
		while (!success) {
		    try {
				income = scan.nextInt();
		        success = true;
		    } catch (InputMismatchException e) {
				System.out.println("Please enter an integer, thanks!");

		    }
		}
		System.out.println("Are you married? (Y/N):");
		s = scan.next();
		try{
			if(s.equals("Y")){
				marriedStatus = true;
			}else if(s.equals("N")){
				marriedStatus = false;
			}
		}catch(NumberFormatException e){
			System.out.println("Please input Y or N, thanks!");
		}
		IRS i = new IRS(income, marriedStatus);
	}

}
