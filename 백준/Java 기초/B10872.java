package javaBasic;

import java.util.Scanner;

public class B10872 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		int result = 1;
		
		for (int i = 2; i <= n; i++) {
			result *= i;
		}
		System.out.println(result);
		
		in.close();
	}

}
