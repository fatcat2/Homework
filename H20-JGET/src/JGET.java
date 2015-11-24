import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;

import javax.net.ssl.SSLHandshakeException;

public class JGET {
	URL url = null;
	String url_string;
	InputStream is = null;
	BufferedReader br = null;
	String line = "";
	int count;
	int namecount;
	File f;
	PrintWriter pw;
	public JGET(String site_loc, int x, int y){
		namecount = y;
		count = x;
		url_string = site_loc;
		try {
			f = new File(namecount + ".txt");
			pw = new PrintWriter(new BufferedWriter(new FileWriter(f)));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void printSiteData(){
		try {
			if(url_string.contains("http") != true){
				try{
					url = new URL("https://" + url_string);
					is = url.openStream();
				}catch(SSLHandshakeException e){
					url = new URL("http://" + url_string);
					is = url.openStream();
				}
			}
			System.out.println(url_string);
			br = new BufferedReader(new InputStreamReader(is));
			while((line = br.readLine()) != null){
				System.out.println(line);
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void getSiteData(){
		try {
			if(url_string.contains("http")){
					url = new URL(url_string);
					is = url.openStream();
			}else{
				try{
					System.out.println("Attempting HTTPS connection: " + "https://" + url_string + "...");
					url = new URL("https://" + url_string);
					is = url.openStream();
					System.out.println("\nSuccess");
				}catch(SSLHandshakeException e){
					System.out.println("HTTPS connection failed, attempting HTTP connection: " + "http://" + url_string + "...");
					url = new URL("http://" + url_string);
					is = url.openStream();
					System.out.println("\nSuccess");
				}
			}
			System.out.println(url_string);
			br = new BufferedReader(new InputStreamReader(is));
			System.out.println("\nNow Accessing Link: " + url_string);
			findLink(br);
			br.close();
			pw.close();
		} catch (Exception e) {
			System.out.println("Cannot access...moving on...");
		} 
	}
	private void findLink(BufferedReader br){
		try {
			while((line = br.readLine()) != null){
				pw.println(line);
				System.out.println(line);
				String[] list = line.split("[<>]");
				for(String s: list){
					s = s.toLowerCase();
					if(s.contains("href")){
						String[] linkTag = s.split("[\"\"]");
						for(String a: linkTag){
							if(a.contains(".com") || a.contains(".net") || a.contains(".org")){
								System.out.print("\nCreating new JGET object at " + a);
								if(count - 1 > 0){
									JGET j = new JGET(a, count - 1, namecount++);
									System.out.println("Accessing site data from: " + a);
									j.getSiteData();
								}else{
									System.out.println("\nLink follow success, ending sequence " + count);
								}
							}
						}
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
//	private void printSite(){
//		try{
//			BufferedReader x = br;
//			File f = new File("src/" + "a" + ".txt");
//			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(f)));
//			String s = "";
//			while((s = br.readLine()) != null){
//				pw.println(s);
//			}
//			pw.close();
//			x.close();
//		}catch(Exception e){
//			e.printStackTrace();
//		}
//	}
	
}
