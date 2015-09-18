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
		File output = new File("output.txt");
		try{
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(output)));
			BufferedReader br = new BufferedReader(new FileReader(file));
			String s = br.readLine();
			String[] s1 = s.split(",");
			for(int i = 1; i <= s1.length; i++){
				s1[i - 1] = s1[i - 1].trim();
				if(i % 2 == 0){
					s1[i - 1] = s1[i-1] + "\n";
				}
				pw.printf("%-10s", s1[i - 1]);
			}
			pw.printf("%-10s", "-------------------");
			pw.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
