import java.util.Scanner;


public class Engine {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		int type = scan.nextInt();
		switch(type){
		case 1: System.out.println(palindrome(input));
//		case 2: System.out.println(pigLatin(input));
//		case 3: shortHand(input);
		}
	}
	
	public static String palindrome(String str){
		String s = "";
		for(int x = 0; x < str.length(); x++){
			if(Character.isLetter(str.charAt(x))){
				s = s + str.substring(x, x+1);
			}
		}
		if(s.equalsIgnoreCase(reverseText(str))){
			return reverseText(str);
		}else{
			return "not a palindrome";
		}
	}
	
	public static String pigLatin(String str){
		String[] arr = str.split(" ");
		for(int x = 0; x < arr.length; x++){
			
		}
	}
	
	public static void shortHand(String str){
		String[] 
	}
	
	public static String reverseText(String str){
		String s = "";
		for(int x = str.length() - 1; x >= 0; x--){
			if(Character.isLetter(str.charAt(x))){
				s = s + str.substring(x, x+1);
			}
		}
		return s;
	}
	
	public static String pigRecursive(String str, int index){
		if(str.length() < 1){
			return str;
		}else{
			if(str.charAt(index).e)
		}
	}
}
