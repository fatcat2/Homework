/*
 * Author: fatcat2
 * Date: September 7th, 2015
 * Description: The car class, which contains methods and variables pertaining to its mileage and 
 * gas tank.
 */
public class Car {
	
	//Creating and initializing main variables.
	double odometer = 0;
	double gasUsed = 0;
	
	//Empty constructor to create the object.
	public Car(){
		
	}
	
	//Method returns String, calculates and returns the answer and steps.
	public String stopAtTheGasStation(double m, double g){
		odometer = m;
		gasUsed = g;
		return "<html>You travelled: " + m + " miles.<br>" + "You used: " + g + " gallons.<br>" + "And your mileage is: "+ calcMPG() + " mpg!</html>";
	}
	
	//Calculates the MPG
	public double calcMPG(){
		return odometer/gasUsed;
	}
	
	//Obligatory mutator methods.
	public void setMiles(double x){
		odometer = x;
	}
	public void setGas(double x){
		gasUsed = x;
	}
	
	//Obligatory accessor methods.
	public double getMiles(){
		return odometer;
	}
	public double getGas(){
		return gasUsed;
	}
}
