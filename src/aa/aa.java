package aa;

import java.util.Scanner;

public class aa{
	
	public static void main(String[] args) {
		System.out.println("1 2 3 4 5 6");
		System.out.println("11 21 31 41 51 61");
		 
		
		Scanner sc = new Scanner(System.in);
		int mt = sc.nextInt();
		
		int[] md = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		System.out.printf("%d월은 %d까지 있", mt, md[mt+1]);
	}
}