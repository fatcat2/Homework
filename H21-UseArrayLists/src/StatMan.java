import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class StatMan {
	ArrayList<Integer> numlist = new ArrayList<Integer>();
	BufferedReader br;
	File f;
	FileReader fr;
	public StatMan(String file_path){
		f = new File(file_path);
		try {
			fr = new FileReader(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		br = new BufferedReader(fr);
		String s;
		try {
			while((s = br.readLine()) != null){
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
