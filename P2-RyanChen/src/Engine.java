
public class Engine {
	public static void main(String[] args){
		Fighter ryu = new Fighter();
		Fighter ken = new Fighter(80, "Ken");
		System.out.println("Ryu: " + ryu.getHealth() + "\nKen: " + ken.getHealth());
		while(ken.getStatus()){
			ryu.punch(ken);
			System.out.println("Ryu: " + ryu.getHealth() + "\nKen: " + ken.getHealth());
		}	
	}
}
