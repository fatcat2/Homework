import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Engine {
	@SuppressWarnings("resource")
	public static void main(String[] args){
		try{
			File file = new File("goods.txt");
			File output = new File("output.txt");
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(output)));
			BufferedReader br = new BufferedReader(new FileReader(file));
			String[] itemList = toArray(br);
			userInterface(pw, itemList);
			pw.close();
			br.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public static String[] toArray(BufferedReader br){
		String total = "";
		String s;
		try {
			while((s = br.readLine()) != null){
				total = total + s;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		String[] temp = total.split("[\"\"]");
		return temp;
	}
	
	public static void viewReceipt(PrintWriter pw, String[] arr){
		for(int i = 1; i < arr.length - 1; i = i +  4){
			pw.printf("%-10s", arr[i].trim());
			pw.printf("%-10s", arr[i + 2].trim());
			pw.print("\n");
			
			System.out.printf("%-10s", arr[i].trim());
			System.out.printf("%-10s", arr[i + 2].trim());
			System.out.print("\n");
		}
		System.out.println("---------------------");
	}
	public static void userInterface(PrintWriter pw, String[] arr){
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the Advanced Grocery List!");
		viewReceipt(pw,arr);
		System.out.println("Would you like to add anything to your receipt? (Y/N)");
		if(scan.next().equals("Y")){
			System.out.println("nope");
		}else{
			System.out.println("Have a nice day!");
		}
	}
}
