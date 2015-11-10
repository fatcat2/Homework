import javax.swing.JFrame;
import javax.swing.Timer;
import java.awt.event.*;
import javax.swing.*;
public class GraphicEngine{
    static GraphicPlayer gp = new GraphicPlayer();
    static Timer t = new Timer(100, gp);
    public GraphicEngine(){
        JFrame frame = new JFrame("YAAAAAAAAY");
        JFrame f1 = new JFrame();
        frame.setSize(1080, 720);
        frame.setVisible(true);
        frame.add(gp);
        JButton j1 = new JButton("Hi");
        j1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                t.start();
            }
        });
        
        f1.add(j1);
        f1.setSize(200, 200);
        f1.setVisible(true);
        //frame.add(j1);
        if(gp.getX() == -440){
            t.stop();
            System.out.println("done");
        }
    }
}