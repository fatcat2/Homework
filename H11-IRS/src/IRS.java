/*
 *By Ryan Chen
 *30 September 2015
 *IRS class of the H11-IRS Assignment. 
 */

public class IRS {
	int income;
	double tax;
	boolean married;
	public IRS(int i, boolean m){
		income = i;
		married = m;
		if(m){
			calcMarried();
		}else{
			calcSingle();
		}
	}
	private void calcSingle(){
		int t = 0;
		int i = income;
		if(i > 297350){
			t = i - 297350;
			tax = 93374 + (0.391 * t);
		}else if(i <= 297350 && i > 136750){
			t = i - 136750;
			tax = 36361 + (0.355 * t);
		}else if(i <= 136750 && i > 65550){
			t = i - 65550;
			tax = 14645 + (t * 0.305);
		}else if(i <= 65550 && i > 27050){
			t = i - 27050;
			tax = 4057.5 + (t * 0.275);
		}else if(i <= 27050){
			t = i;
			tax = 0.15 * t;
		}
		System.out.println("Single: $" + tax);
	}
	private void calcMarried(){
		
	}
}
