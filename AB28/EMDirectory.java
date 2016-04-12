import java.util.*;
public class EMDirectory{
	HashMap<Name, String> map = new HashMap<Name, String>();
	public EMDirectory(){}
	public void addEntry(String lname, String fName, int id, String eAdd){
		Name n = new Name(lname, fName, id); 
		map.put(n, eAdd);
	}
	public String lookup(Name name){
		if(map.containsKey(name)){
			return map.get(name);
		}else{
			return null;
		}
	}
	public String lookupLastName(String lastName){
		for(Name n : map.keySet()){
			if(n.getLastName().equals("lastName")){
				return map.get(n);
			}
		}
	}
	public void listAll(){
		for(Name n : map.keySet()){
			System.out.println(n.getName() + " " + n.getLastName() + ": " + map.get(n));
		}
	}
}	
