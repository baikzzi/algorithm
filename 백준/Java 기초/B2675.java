package javaBasic;

import java.util.Scanner;

public class B2675 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		for (int i = 0; i < n; i++) {
			int x = in.nextInt();
			String str = in.next();
			int len = str.length();
			
			for (int j = 0; j < len; j++) {
				for (int k = 0; k < x; k++) {
					System.out.print(str.charAt(j));
				}
			}
			
			System.out.println();
		}
		
		in.close();
		
		
	}
}
