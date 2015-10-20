import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Engine {
	public static void main(String[] args){
		System.out.println("Please enter your text:   ");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		System.out.println("Please enter your option(1 for palindrome, 2 for pigLatin, 3 for shortHand):   ");
		int type = scan.nextInt();
		//Switch statements for options
		switch(type){
		case 1: System.out.println(palindrome(input)); break;
		case 2: System.out.println(pigLatin(input)); break;
		case 3: System.out.println(shortHand(input)); break;
		}
	}
	
	//The palindrome methods
	public static String palindrome(String str){//This method uses the reverseText method to check if it is truly a palindrome
		String s = "";
		for(int x = 0; x < str.length(); x++){
			if(Character.isLetter(str.charAt(x))){
				s = s + str.substring(x, x+1);
			}
		}
		if(s.equalsIgnoreCase(reverseText(str))){
			return "Is a palindrome";
		}else{
			return "not a palindrome";
		}
	}
	
	public static String reverseText(String str){ //This method reversed text
		String s = "";
		for(int x = str.length() - 1; x >= 0; x--){
			if(Character.isLetter(str.charAt(x))){
				s = s + str.substring(x, x+1);
			}
		}
		return s;
	}
	
	//Pig Latin methods
	public static String pigLatin(String str){
		String[] arr = str.split("\\s+"); //splits the array using the regex for space
		String s = ""; //Blank string to add to
		for(int i = 0; i < arr.length; i++){ //using a for loop to find the vowels
			if(arr[i].substring(0,1).equalsIgnoreCase("a") || arr[i].substring(0,1).equalsIgnoreCase("e") || arr[i].substring(0,1).equalsIgnoreCase("i") || arr[i].substring(0,1).equalsIgnoreCase("o") || arr[i].substring(0,1).equalsIgnoreCase("u")){
				s = s + str + "yay "; //if vowel, it's done
			}else{
				s = s + pigRecursive(arr[i]); //go into the method
			}
		}
		//Getting the formatting down
		s = s.toLowerCase();
		s = s.substring(0,1).toUpperCase() + s.substring(1);
		return s;
	}
	
	public static String pigRecursive(String str){
		String s = "";
		for(int i = 0; i < str.length(); i++){
			if(str.substring(i, i + 1).equalsIgnoreCase("a") || str.substring(i, i + 1).equalsIgnoreCase("e") || str.substring(i, i + 1).equalsIgnoreCase("i") || str.substring(i, i + 1).equalsIgnoreCase("o") || str.substring(i, i + 1).equalsIgnoreCase("u")){
				s =  str.substring(i) + str.substring(0, i) + "ay ";
				break;
			}	
		}
		return s;
	}
	
	
	 //The shorthand method
	public static String shortHand(String str){
		String[] arr = str.split("\\s+");
		String s = "";
		//Using a map
		Map m = new HashMap();
		m.put("and", "&");
		m.put("to", "2");
		m.put("you", "u");
		m.put("for", "4");
		for(int i = 0; i < arr.length; i++){
			if(m.containsKey(arr[i].substring(0,arr[i].length()))){ //Checking if the key is present, if not, move on
				arr[i] = (String) m.get(arr[i]);
				s = s + arr[i] + " ";
			}
		}
		return s; 
	}
}
