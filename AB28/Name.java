public class Name{
	String name = "";
	String lastname = "";
	public Name(String str){
		String[] arr = str.split(" ");
		name = arr[0];
		lastname = arr[1];
	}
	public String getName(){
		return name;
	}
	public String.getLastName(){
		return lastname;
	}
}
