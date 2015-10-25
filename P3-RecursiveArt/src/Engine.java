import javax.swing.JFrame;
import javax.swing.Timer;


public class Engine {
	public static void main(String[] args){
//		Timer t = new Timer(30, new RectangleComponent());
//		t.start();
		JFrame frame = new JFrame();
		frame.setSize(500,500);
		frame.add(new RectangleComponent());
		frame.setVisible(true);
	}
}
