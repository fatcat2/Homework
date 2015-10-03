
public class Engine {
	static int n = 0;
	static int i = 0;
	static int max;
	public static void main(String[] args) {
		max = 2;
		calc(5);

	}
	public static void calc(int x){
		n++;
		if(n <= max){
			i = i + x;
			calc(x);
		}else{
			System.out.println(i);
		}
	}
}
