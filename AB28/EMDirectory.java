import java.util.*;
public class EMDirectory{
	HashMap<Name, String> map = new HashMap<Name, String>();
	HashMap<String, ArrayList<String>> map2 = new HashMap<String, ArrayList<String>>;
	ArrayList<String> list;
	public EMDirectory(){}
	public void addEntry(String lname, String fName, String eAdd){
		Name n = new Name(lname, fName); 
		map.put(n, eAdd);
	}
	public String lookup(Name name){
		if(map.containsKey(name)){
			return map.get(name);
		}else{
			return null;
		}
	}
	public String lookupLastName(Name name){
		return 
	}
	public void listAll(){
		for(Name n : map.keySet()){
			System.out.println(n.getName() + " " + n.getLastName() + ": " + map.get(n));
		}
	}
}	
