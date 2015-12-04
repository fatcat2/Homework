import javax.swing.JOptionPane;
public class DecryptEngine{
    static int priv_key;
    static int pub_key;
    public static void main(String[] args){
        String a = JOptionPane.showInputDialog("Input the encrypted string");
        priv_key = Integer.parseInt(JOptionPane.showInputDialog("Input private key"));
        decrypt(a);
    }
    private static void decrypt(String s){
         String list[] = s.split("\\s");
         pub_key = Integer.parseInt(list[0]);
         for(int i = 1; i < list.length; i++){
             int x = Integer.parseInt(list[i]);
             System.out.println(x);
             int their_key = pub_key / priv_key;
             System.out.println(their_key);
             int z = x / their_key;
             int a = z;
             System.out.println(a);
         }
    }
}
