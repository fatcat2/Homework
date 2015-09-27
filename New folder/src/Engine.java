import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
public class Engine {
	@SuppressWarnings("resource")
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args){
		try{
			File file = new File("goods.txt");
			File output = new File("output.txt");
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(output)));
			BufferedReader br = new BufferedReader(new FileReader(file));
			ArrayList<String> itemList = toArray(br);
			userInterface(pw, itemList);
			pw.close();
			br.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public static ArrayList<String> toArray(BufferedReader br){
		String total = "";
		String s;
		try {
			while((s = br.readLine()) != null){
				total = total + s;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		String[] temp1 = total.split("[\"\"]");
		ArrayList<String> temp2 = new ArrayList<String>();
		for(int i = 0; i < temp1.length; i++){
			temp2.add(temp1[i]);
		}
		return temp2;
	}
	
	public static void viewReceipt(PrintWriter pw, ArrayList<String> arr){
		System.out.println("---Receipt Start---");
		for(int i = 1; i < arr.size() - 1; i = i +  4){
			pw.printf("%-10s", arr.get(i).trim());
			pw.printf("%-10s", arr.get(i + 2).trim());
			pw.print("\n");
			
			System.out.printf("%-10s", arr.get(i).trim());
			System.out.printf("%-10s", arr.get(i + 2).trim());
			System.out.print("\n");
		}
		System.out.println("----Receipt End----");
	}
	
	public static void userInterface(PrintWriter pw, ArrayList<String> arr){
		System.out.println("Welcome to the Advanced Grocery List!");
		viewReceipt(pw,arr);
		System.out.println("Would you like to add anything to your receipt? (Y/N)");
		if(scan.next().equals("Y")){
			viewReceipt(pw,arr);
		}else{
			System.out.println("Final Receipt:");
			viewReceipt(pw,arr);
			System.out.println("Have a nice day!");
		}
	}
}
