
public class Car {
	int gas;
	int miles;
	int type;
	int full = 20;
	public Car(int g, int m){
		gas = g;
		miles = m;
	}
	public void fillTank(int x){
		gas = full;
	}
	public int getGas(){
		return gas;
	}
}
