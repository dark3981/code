package aa;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class dd {

	Socket sk = null;
	PrintWriter pw = null;
	BufferedReader rd = null;
	
	public dd() {
		// TODO Auto-generated constructor stub
		try {
			sk = new Socket("localhost", 2000);
			pw = new PrintWriter(sk.getOutputStream(), true);
			rd = new BufferedReader(new InputStreamReader(sk.getInputStream()));
			
			String str = null;
			BufferedReader srd = new BufferedReader(new InputStreamReader(System.in));
			
			while ((str = srd.readLine()) != null) {
				pw.println(str);
				System.out.println("output : " + str);
			}
			
			pw.close();
			rd.close();
			srd.close();
			sk.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static void main(String[] args) {
		new dd();
	}
}
