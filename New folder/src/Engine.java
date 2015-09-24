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
			while(br.readLine() != null){
				String s = br.readLine();
				total = total + s;
			}
			String[] arr = total.split("[\"\"]");
			for(int i = 1; i < arr.length - 1; i += 4){
				pw.print(arr[i].trim());
				pw.print(arr[i + 2].trim() + "\n");
			}
			pw.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
