import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Engine {
	static Scanner scan = new Scanner(System.in);
	static Random rand = new Random();

	//Main method
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Enter 1 for assignment 1, enter 2 for assignment 2   ");
		int a = scan.nextInt();
		switch(a){
		case 1: rollDifferent();
		case 2: LCR();
		}
	}
	
	//Method for first assignment
	public static void rollDifferent(){
		boolean match = false;
		while(!match){
			int a = rand.nextInt(6) + 1;
			int b = rand.nextInt(6) + 1;
			int c = rand.nextInt(6) + 1;
			if(a == b || a == c || b == c){
				System.out.println(a + " " + b + " " + c);
			}else{
				System.out.println(a + " " + b + " " + c);
				System.out.println("MATCH!");
				match = true;
			}
		}
	}
	
	//Method for second assignment (DNF)
	public static void LCR(){
		String[] arr = {"L", "R", "C", "D", "D", "D"}; //Use array and hashmap
		HashMap<String, Integer> map = new HashMap();
		map.put("L", 1);
		map.put("R", 2);
		map.put("C", 3);
		map.put("D", 4);
		int center = 0;
		ArrayList<Player> pList = new ArrayList<Player>();
		System.out.println("How many players are there? Must be at least three"); //Deciding number of coins
		int n = scan.nextInt();
		for(int i = 0; i < n; i++){
			pList.add(new Player());
			System.out.println("Player " + (i+1) + " has " + pList.get(i).getCoins() + " coins.");
		}
		System.out.println("There are " + n + " players at the table.");
		//Game logic section
		boolean gameGo = true; //Game keeps going as long as there is not one player
		int counter = 0;
		while(gameGo){
			if(pList.size() == 1){
				gameGo = false;
				System.out.println("Game over");
			}
			if(pList.get(counter).getCoins() >= 3){
				for(int i = 0; i < 3; i++){
					conditional(map, counter, center, pList, arr);
				}
			}else if(pList.get(counter).getCoins() < 3 && pList.get(counter).getCoins() > 0){
				for(int i = 0; i < pList.get(counter).getCoins(); i ++){
					conditional(map, counter, center, pList, arr);
				}
			}else{
				pList.remove(pList.get(counter));
			}
		}
	}
	
	//Method for the conditionals
	public static void conditional(HashMap<String, Integer> map, int counter, int center, ArrayList<Player> pList, String[] arr){
		String a = arr[rand.nextInt(6)];
		System.out.println("Player rolled " + a);
		switch(map.get(a)){
		case 1: if(counter == 0){
				pList.get(pList.size()-1).addCoins(1);
				System.out.println(pList.size() + " has " + pList.get(pList.size()-1).getCoins());
				pList.get(counter).addCoins(-1);
				System.out.println((counter + 1) + " has " + pList.get(counter).getCoins());
			}else{
				pList.get(counter + 1).addCoins(1);
				System.out.println((counter + 2) + " has " + pList.get(counter + 1).getCoins());
				pList.get(counter).addCoins(-1);
				System.out.println((counter + 1) + " has " + pList.get(counter).getCoins());
			}break;
		
		case 2: if(counter == pList.size()-1){
				pList.get(0).addCoins(1);
				pList.get(counter).addCoins(-1);
			}else{
				pList.get(counter + 1).addCoins(1);
				pList.get(counter).addCoins(-1);
			}break;
		case 3: pList.get(counter).addCoins(-1); center += 1;break;
		case 4: break;
		}
	}

}
