import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class StatMan {
	ArrayList<Integer> numList = null;;
	BufferedReader br;
	File f;
	FileReader fr;
	public StatMan(String file_path){
		numList = new ArrayList<Integer>();
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
				numList.add(Integer.parseInt(s));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public int getAvg(){
		int x = 0;
		for(int i = 0; i < numList.size(); i++){
			x += numList.get(i);
		}
		return x;
	}
	
	public double stdDev(){
		int x = getAvg();
		int y = 0;
		for(int i = 0; i < numList.size(); i++){
			y += x - numList.get(i);
		}
		return Math.sqrt(y/(numList.size()-1));
	}
	
	public int getMode(){
		Integer streak = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		ArrayList<Integer> streakList = new ArrayList<Integer>();
		Collections.sort(numList);
		for(int i = 0; i < numList.size(); i++){
			if(numList.get(i) == numList.get(i + 1)){
				streak++;
			}else{
				map.put(numList.get(i), streak);
				streakList.add(streak);
				streak = 0;
			}
		}
		Collections.sort(streakList);
		return map.get(streakList.get(streakList.size()-1));
		
	}
	
}

