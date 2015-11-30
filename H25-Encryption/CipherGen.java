import java.util.*;
public class CipherGen{
    String message;
    ArrayList<Character> charList = new ArrayList<Character>();
    ArrayList<Double> numList = new ArrayList<Double>();
    String enc_message;
    private HashMap<Integer, Character> map = new HashMap<Integer, Character>();
    public CipherGen(String s){
        s = message;
    }
    private String genList(String str){
        if(str.length() > 1){
            return "";
        }else{
            charList.add(str.charAt(0));
            return genList(str.substring(1));
        }
    }
    private void encrypt(){
        for(int i = 0; i < charList.size(); i++){
            char a = charList.get(i);
            int b = Character.getNumericValue(a);
            double s = Math.pow(Math.sqrt(b), 3);
            numList.add(s);
        }
    }
}
