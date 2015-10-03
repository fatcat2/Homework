/*
 * by Ryan Chen
 * 2 October, 2015
 */
public class fibonacciCalculator {
	static int i = 1;
	static int i2 = 1;
	public static void main(String[] args) {
		fib(0, 0, 10, 0);
		
	}
	public static void fib(int x, int y, int max, int n){
		if(n >= max){
			System.out.println(y);
		}else{
			n++;
			if(x == 0){
				fib(1, y, max, n);
			}else if(x < 2){
				fib(x + x, y + x, max, n);
			}else{
				fib(x + y, y =x, max, n);
			}
		}
	}
}


