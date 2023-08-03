package javaBasic;

import java.util.Scanner;

public class B9086 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		
		for (int i = 0; i < t; i++) {
			String str = in.next();
			int len = str.length();
			
			System.out.print(str.charAt(0));
			System.out.println(str.charAt(len - 1));
		}
		
		in.close();
	}

}
