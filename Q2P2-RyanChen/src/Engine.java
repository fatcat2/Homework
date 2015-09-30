/*
 * by Ryan Chen
 * 30 September 2015 
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.Scanner;

import javax.xml.parsers.ParserConfigurationException;


public class Engine {
	public static void main(String[] args) throws ParserConfigurationException, IOException{
		try {
			Scanner scan = new Scanner(new File("ghosts.txt"));
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(new File("ghosts.xml"))));
			String s;
			System.out.println("<pac-man>");
			int count = 0;
			try{
				while((s = scan.nextLine()) != null){
					if(count == 0){
						count++;
					}else{
						String[] tList = s.split(",");
						pw.println("<ghost>");
						pw.println("<name>" + tList[0] + "</name>");
						pw.println("<behavior>" + tList[1] + "</behavior>");
						pw.println("</ghost>");
					}
				}
			}catch(NoSuchElementException e){
			}finally{
				System.out.println("</pac-man>");
				pw.close();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
