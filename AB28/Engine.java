import java.io.*;
import java.util.*;
public class Engine{
	public static void main(String[] args){
		// Scanner s1 = new Scanner(System.in);
		// System.out.println("Enter the filepath of the ");
		// String fpath = s1.nextLine();
		Scanner s2;
		try{
			s2 = new Scanner(new File("emdir.csv"));
			EMDirectory em = new EMDirectory();
			while(s2.hasNext()){
				//x[0] = id, x[1] = lname, x[2] = fname, x[3] = email
				String[] x = s2.nextLine().split(",");
				try{
					int a = Integer.parseInt(x[0]);
					em.addEntry(x[1], x[2], x[3]);
				}catch(Exception e){
					System.out.println("Error: Please format csv in <ID, last name, firstname, email>");
				}
			}
			em.listAll();
			System.out.println(em.lookupLastName("Chen"));
		}catch(FileNotFoundException e){}
		
	}
}
