import javax.swing.JOptionPane;
import java.io.*;
public class Engine{
    public static void main(String[] args){
        String s = JOptionPane.showInputDialog("Insert file path");
        String a = "";
        String b = "";
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File(s))));
            while((a = br.readLine()) != null){
                b += a + " ";
            }
        }catch(Exception e){
            System.out.println("You gone fucked up!");
        }
        System.out.println("IT FUCKING RUNS");
        int y = Integer.parseInt(JOptionPane.showInputDialog("Insert public key"));
        int z = Integer.parseInt(JOptionPane.showInputDialog("Insert private key"));
        CipherGen c = new CipherGen(b, y, z);
    }
}
