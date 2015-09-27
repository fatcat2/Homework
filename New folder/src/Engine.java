import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
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
			Scanner scan = new Scanner(System.in);
			String total = "";
			String s;
			while((s = br.readLine()) != null){
				total = total + s;
			}
			String[] arr = total.split("[\"\"]");
			
			System.out.println("Welcome to the Advanced Grocery List!");
			viewReceipt(pw, total, arr);
			System.out.println("Would you like to add anything to your receipt?");
			if(scan.next().equals("Y")){
			}
			pw.close();
			br.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public static void viewReceipt(PrintWriter pw, String total, String[] arr){
		for(int i = 1; i < arr.length - 1; i = i +  4){
			pw.printf("%-10s", arr[i].trim());
			pw.printf("%-10s", arr[i + 2].trim());
			pw.print("\n");
			
			System.out.printf("%-10s", arr[i].trim());
			System.out.printf("%-10s", arr[i + 2].trim());
			System.out.print("\n");
		}
	}
}
