import java.util.*;
public class Name{
	String name = "";
	String lastname = "";
	int idnum = 0;
	public Name(String lname, String fName, int id){
		name = fName;
		lastname = lname;
		idnum = id;
	}
	public String getName(){
		return name;
	}
	public String getLastName(){
		return lastname;
	}
}
