import javax.swing.JOptionPane;
public class Engine{
    public static void main(String[] args){
        String s = JOptionPane.showInputDialog("Insert message");
        int y = Integer.parseInt(JOptionPane.showInputDialog("Insert public key"));
        int z = Integer.parseInt(JOptionPane.showInputDialog("Insert private key"));
        CipherGen c = new CipherGen(s, y, z);
    }
}
