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
         System.out.println("");
         String list[] = s.split("\\s");
         pub_key = Integer.parseInt(list[0]);
         for(int i = 1; i < list.length; i++){
             System.out.println(list[i]);
             int b = list[i].charAt(0);
             //System.out.println(x);
             int their_key = pub_key / priv_key;
             //System.out.println(their_key);
             int c = (b / their_key) + 9;
             char d = (char) c;
             System.out.print(d);
         }
    }
}
