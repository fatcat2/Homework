import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.SSLHandshakeException;

public class JGET {
	URL url = null;
	String url_string;
	InputStream is = null;
	BufferedReader br = null;
	String line = "";
	public JGET(String site_loc){
		try {
			url = new URL("https://" + site_loc);
			url_string  = site_loc;
			printSiteData();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
	public void printSiteData(){
		try {
			try{
				is = url.openStream();
			}catch(SSLHandshakeException e){
				url = new URL("http://" + url_string);
				is = url.openStream();
			}
			br = new BufferedReader(new InputStreamReader(is));
			while((line = br.readLine()) != null){
				System.out.println(line);
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
