
public class Car {
	double odometer = 0;
	int full = 20;
	int empty = 0;
	double gasUsed;
	public Car(){
		
	}
	public String stopAtTheGasStation(double m, double g){
		odometer = m;
		gasUsed = g;
		return "<html>You travelled: " + m + " miles.<br>" + "You used: " + g + " gallons.<br>" + "And your mileage is: "+ calcMPG() + " mpg!</html>";
	}
	public double calcMPG(){
		return odometer/gasUsed;
	}
	public void setMiles(double x){
		odometer = x;
	}
	public void setGas(double x){
		gasUsed = x;
	}
	public double getMiles(){
		return odometer;
	}
	public double getGas(){
		return gasUsed;
	}
}
