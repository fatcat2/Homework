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
			String s = br.readLine();
			String[] arr = s.split("[\"\"]");
//			list.add(s.substring(0, s.indexOf(",")));
//			list.add(s.substring(s.indexOf(",") + 1));
//			pw.printf("%-10s", list.get(0));
			for(int i = 0; i < arr.length; i += 2){
				System.out.println(arr[i].trim());
				System.out.println(arr[i + 1].trim());
			}
			pw.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
