import javax.swing.JFrame;



public class Engine {
	static JFrame frame= new JFrame();
	public static void main(String[] args){
		JFrame frame= new JFrame();
		frame.setSize(500, 500);
		frame.add(new RectangleComponent());
		frame.setVisible(true);
		
	}
}
