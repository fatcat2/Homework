import javax.swing.JOptionPane;

public class Engine {
	public static void main(String[] args){
		String s = JOptionPane.showInputDialog("Please enter the url you\nwould like to access");
		JGET jget = new JGET(s, 3, 0);
		jget.getSiteData();
		System.out.println("Done!");
	}
}
