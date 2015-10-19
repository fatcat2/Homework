import javax.swing.JFrame;


public class Engine {
	public static void main(String[] args){
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		KochCurve k = new KochCurve(50, 50, 120);
		frame.add(k);
		frame.setVisible(true);
	}
}
