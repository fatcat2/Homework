public class Fighter {
	/**
	 * The name of the fighter
	 */
	String name;
	/**
	 * The weight of the fighter will affect the punchPower and health. It is in KG.
	 */
	int weight;
	/**
	 * Health is calculated by doubling the weight.
	 */
	double health;
	/**
	 * Punch power is found by multiplying the weight by 0.3.
	 */
	double pPower;
	/**
	 * True means alive, false means dead.
	 */
	boolean status = true;
	/**
	 * Creates a default fighter, in this case Ryu (85kg).
	 */
	public Fighter(){
		weight = 85;
		name = "Ryu";
		health = weight * 2;
		pPower = weight * 0.3;
	}
	/**
	 * Creates a custom fighter, with weight specified by the programmer.
	 */
	public Fighter(int w, String n){
		weight = w;
		name = n;
		health = weight * 2;
		pPower = weight * 0.3;
	}
	
	
	/**
	 * Subtracts x from the total health.
	 */
	public void takeHealth(double x){
		health -= x;
		checkDead();
	}
	/**
	 * 
	 * @param Fighter f: Use another fighter class object.
	 * The fighter object punches the fighter in the explicit parameters.
	 */
	public void punch(Fighter f){
		if(status){f.takeHealth(this.getPunchPower());}
		else{System.out.println(name + " is dead");}
		checkDead();
	}
	/**
	 * @param Fighter f: Use another fighter class object.
	 * The fighter object punches the fighter in the explicit parameters while spinning in the air, punch power is doubled.
	 */
	public void shoryuken(Fighter f){
		if(status){f.takeHealth(this.getPunchPower() * 2);}
		else{System.out.println(name + " is dead");}
		checkDead();
	}
	/**
	 * Returns health of fighter.
	 * @return health
	 */
	public double getHealth(){
		return health;
	}
	/**
	 * Returns pPower.
	 */
	public double getPunchPower(){
		return pPower;
	}
	/**
	 * Returns the status of the fighter, true is alive, false is dead.
	 */
	public boolean getStatus(){
		return status;
	}
	/**
	 * Checks if the fighter is dead, changes status to false if so.
	 */
	public void checkDead(){
		if(health <= 0){
			status = false;
			health = 0;
		}
	}
	/**
	 * Resurrects the fighter with reduced punch power.
	 */
	public void ressurection(){
		if(!status){
			status = true;
			health = weight * 2;
		}
	}
}
