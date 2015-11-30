/*
 * by Ryan Chen
 * i like pineapples
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Compactor {
	File f = null;
	FileReader fr = null;
	BufferedReader br = null;
	String[] list = null;
	public Compactor(String file_path){
		f = new File(file_path);
		try {
			fr = new FileReader(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		br = new BufferedReader(fr);
		String s;
		String total = "";
		try {
			while((s = br.readLine()) != null){
				total += s;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		list = total.split("\n");
	}
	
	public void compactor(){
		for(int i = 0; i < list.length; i++){
			if(Integer.parseInt(list[i]) == 0){
				for(int j = 0; j < list.length - 1; j++){
					list[j] = list[j+1];
				}
				list[list.length-1] = null;
			}else{
				System.out.println(list[i]);
			}
		}
	}
}
