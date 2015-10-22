import java.util.Scanner;


public class Engine {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = 0;
		String s = "";
		System.out.println("Please enter a number of at most 4999:     ");
		n = scan.nextInt();
		scan.close();
		System.out.println(romanNumerals(n, 0, s));
		
	}
	
	public static String romanNumerals(int n, int count, String s){
		//Making the program go through everything, if the value is less than the value, it won't matter since
		//it would just return as blank.
		s += thousands(n/1000);
		s += hundreds(n%1000/100);
		s += tens(n%100/10);
		s += underTen(n%10);
		return s;
	}
	
	public static String thousands(int n){
		//Simpler algorithm than the others since it only goes to four.
		String s = "";
		for(int i = 0; i < n; i++){
			s += "m";
		}
		return s;
	}
	
	public static String hundreds(int n){
		//Returns a string
		String s = "";
		int i = n;
		if(i >= 4){ //if n is above or equals to 4
			int j = 5 - i;
			if(j >= 0){ //for numbers under 5
				for(int x = 0; x < Math.abs(j); x++){ //For loop to get the amount of c's
					s = s + "c";
				}
				s =  s + "d";
			}else if(j > -4){ //for numbers over 5
				System.out.print("d");
				for(int x = 0; x < Math.abs(j); x++){
					s = s + "c";
				}
			}
		}else if(i > 0){
			for(int x = 0; x < i; x++){
				s = s + "c";
			}
		}
		return s;
	}
	
	
	public static String tens(int n){
		String s = "";
			if(n >= 4){
				int j = 5 - n;
				if(j >= 0){
					for(int x = 0; x < Math.abs(j); x++){
						s = s + "x";
					}
					s += "l";
				}else if(j > -4){
					s = "l";
					for(int x = 0; x < Math.abs(j); x++){
						s += "x";
					}
				}else{
					s = "xc";
				}
			}else if(n < 4 && n >=0){
				for(int x = 0; x < n; x++){
					s += "x";
				}
			}
		return s;
	}
	
	public static String underTen(int n){
		String s = "";
		if(n / 5 > 0){
			if(n == 9){
				s = "ix";
			}else{
				int i = n - 5;
				s = "v";
				for(int j = 0; j < i; j++){
					s += "i";
				}
			}
		}else{
			if(n == 4){
				s = "iv";
			}else{
				for(int j = 0; j < n; j++){
					s += "i";
				}
			}
		}
		return s;
	}
}
