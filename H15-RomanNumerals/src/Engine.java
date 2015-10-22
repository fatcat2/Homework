import java.util.Scanner;


public class Engine {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = 0;
		String s = "";
		boolean keepGoing = true;
		while(keepGoing){
			try{
				n = scan.nextInt();
				keepGoing = false;
			}catch(NumberFormatException e){
				System.out.println("try again");
			}
		}
		System.out.println(romanNumerals(n, 0, s));
		
	}
	
	public static String romanNumerals(int n, int count, String s){
		if(n == 0){
			s += "";
		}else{
			if(count == 0){
				s +=  underTen(n%10) + " " + romanNumerals(n/10, count++, s);
			}else if(count == 1){
				s +=  tens(n%10) + " " + romanNumerals(n/10, count++,s );
			}else if(count == 2){
				s += hundreds(n%10) + " " + romanNumerals(n/10, count++, s);
			}
		}
		return s;
	}
	
	public static String thousands(int n){
		return "";
	}
	
	public static String hundreds(int n){
		String s = "";
		if(n / 100 > 0){
			int i = n/100;
			if(i >= 4){
				int j = 5 - i;
				if(j >= 0){
					for(int x = 0; x < Math.abs(j); x++){
						s = s + "x";
					}
					s =  s + "c";
				}else if(j > -4){
					System.out.print("d");
					for(int x = 0; x < Math.abs(j); x++){
						s = s + x;
					}
				}else{
					s = "xc";
				}
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
