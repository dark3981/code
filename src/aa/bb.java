package aa;

import java.util.Scanner;

public class bb {

	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		String s1, s2;
		s1 = sc.next();
		s2 = sc.next();
		
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		
		//System.out.println(a + "," + b);
		
		int c = a + b;
		System.out.println(c); 
	}
}
