import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
public class Engine {
	@SuppressWarnings("resource")
	public static void main(String[] args){
		String line = null;
		File file = new File("goods.txt");
		File output = new File("output.txt");
//		ArrayList<String> list = new ArrayList<String>();
		try{
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(output)));
			BufferedReader br = new BufferedReader(new FileReader(file));	
			String total = "";
			String s;
			
//			total = total + s;
			
//			boolean keepGoing = true;
//			while(keepGoing){
//				String s = br.readLine();
//				if(s == null){
//					keepGoing = false;
//					System.out.println("stopped");
//					break;
//				}else{
//					total = total + s;
//				}
//			}
			
			while((s = br.readLine()) != null){
				total = total + s;
			}
			System.out.println("I'm done scanning");
			String[] arr = total.split("[\"\"]");
			
			System.out.println(arr.length);
			
			for(int i = 1; i < arr.length - 1; i = i +  4){
				System.out.println(i);
				pw.printf("%-10s", arr[i].trim());
				pw.printf("%-10s", arr[i + 2].trim());
				pw.print("\n");
			}
			System.out.println("I'm done writing to the file.");
			
			pw.close();
			br.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
