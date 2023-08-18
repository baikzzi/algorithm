package dp;

import java.util.Scanner;

public class B9655 {
	public static void main (String[] arsg) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		String result = (n % 2 == 1) ? "SK" : "CY";
		
		System.out.println(result);
		
		
		sc.close();
	}
}
