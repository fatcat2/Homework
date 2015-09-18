import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;


public class Engine {
	@SuppressWarnings("resource")
	public static void main(String[] args){
		String line = null;
		File file = new File("goods.txt");
		File output = new File("receipt.txt");
		try{
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(output, true)));
			BufferedReader br = new BufferedReader(new FileReader(file));
			String s = br.readLine();
			String[] s1 = s.split(",");
			for(int i = 0; i < s1.length; i++){
				pw.println(s1[i]);
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
