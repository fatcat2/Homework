import java.util.*;
public class Name{
	String name = "";
	String lastname = "";
	public Name(String lname, String fName){
		name = fName;
		lastname = lname;
	}
	public String getName(){
		return name;
	}
	public String getLastName(){
		return lastname;
	}
}
