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
		if(n / 1000 > 0){
			
		}else if(n / 100 > 0){
			int i = n/100;
			if(i >= 4){
				int j = 5 - i;
				if(j >= 0){
					for(int x = 0; x < Math.abs(j); x++){
						System.out.print("x");
					}
					System.out.print("c");
				}else if(j > -4){
					System.out.print("d");
					for(int x = 0; x < Math.abs(j); x++){
						System.out.print("x");
					}
				}else{
					System.out.print("xc");
				}
			}
		}else if(n / 10 > 0){
			int i = n/10;
			if(i >= 4){
				int j = 5 - i;
				if(j >= 0){
					for(int x = 0; x < Math.abs(j); x++){
						System.out.print("x");
					}
					System.out.print("l");
				}else if(j > -4){
					System.out.print("l");
					for(int x = 0; x < Math.abs(j); x++){
						System.out.print("x");
					}
				}else{
					System.out.print("xc");
				}
			}else if(i < 4 && i >=0){
				for(int x = 0; x < i; x++){
					System.out.print("x");
				}
			}
		}else if(n / 5 > 0){
			underTen(n);
		}else{
			underTen(n);
		}
	}
	
	public static void underTen(int n){
		if(n / 5 > 0){
			if(n == 9){
				System.out.println("ix");
			}else{
				int i = n - 5;
				System.out.print("v");
				for(int j = 0; j < i; j++){
					System.out.print("i");
				}
			}
		}else{
			if(n == 4){
				System.out.println("iv");
			}else{
				for(int j = 0; j < n; j++){
					System.out.print("i");
				}
			}
		}
	}
}