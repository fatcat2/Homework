import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.*;
import javax.swing.JComponent;
import java.awt.Color;
import java.util.Random;
import java.awt.event.*;
public class GraphicPlayer extends JComponent implements ActionListener{
    Random rand = new Random();
    int x = 200;
    Color c;
    public GraphicPlayer(){
        c = new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255));
    }
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(c);
        Ellipse2D player = new Ellipse2D.Double(x, 260, 200, 200);
        g2.fill(player);
        g2.draw(player);
    }
    public void actionPerformed(ActionEvent e){
       x -= 10;
       repaint();
    }
    public int getX(){
        return x;
    }
}
