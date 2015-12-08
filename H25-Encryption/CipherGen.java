import java.util.*;
public class CipherGen{
    String message = "";
    ArrayList<Character> charList = new ArrayList<Character>();
    int pub_key;
    int priv_key;
    //char[] c;
    ArrayList<Integer> numList = new ArrayList<Integer>();
    String enc_message = "";
    public CipherGen(String s, int public_key, int private_key){
        System.out.println(s);
        message = s;
        pub_key = public_key;
        priv_key = private_key;
        genList();
        encrypt();
    }
    private void genList(){
        for(int i = 0; i < message.length(); i++){
            charList.add(message.charAt(i));
        }
    }
    private void encrypt(){
        System.out.print(pub_key + " ");
        for(int i = 0; i < charList.size(); i++){
            //System.out.println(i);
            char a = charList.get(i);
            //System.out.println(a);
            int b = a;
            //System.out.println(b);
            int c = (b * priv_key) + (priv_key * 3) - (priv_key *12);
            //System.out.println(c);
            numList.add(c);
            char d = (char) c;
            enc_message += d + " ";
        }
        printEncMsg();
    }
    public void printEncMsg(){
        System.out.println(enc_message);
    }
}
