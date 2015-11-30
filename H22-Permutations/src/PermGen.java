/*
 * by Ryan Chen
 * i like pineapples
 */
import java.util.ArrayList;
import java.util.Random;

public class PermGen {
	ArrayList<Integer> perm = null;
	ArrayList<Integer> stockpile = new ArrayList<Integer>();
	Random rand = new Random();
	public PermGen(){
		perm = new ArrayList<Integer>();
		for(int i = 1; i <= 10; i++){
			stockpile.add(i);
		}
		System.out.println("Initial permutation: ");
		for(int i = 0; i < stockpile.size(); i++){
			int x = rand.nextInt(stockpile.size()) + 1;
			perm.add(stockpile.get(x));
			System.out.print(perm.get(i));
		}
	}
	
	public void nextPerm(){
		perm.clear();
		System.out.println("Next permutation: ");
		for(int i = 0; i < stockpile.size(); i++){
			int x = rand.nextInt(stockpile.size()) + 1;
			perm.add(stockpile.get(x));
			System.out.print(perm.get(i));
		}
	}
	
}
