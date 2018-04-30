package aa;

import java.util.Scanner;

public  class ff {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int nm = sc.nextInt();
		
		for (int i = 1; i < 10; i++) {
			System.out.println(nm + " * " + i + " = " + nm*i);
		}
	}
}