package javaBasic;

import java.util.Scanner;

public class B1032 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		String str = in.next();
		
		char[][] strArr = new char[n][str.length()];
		char[] result = new char[str.length()];
		
		for (int i = 0; i < str.length(); i++) {
			strArr[0][i] = str.charAt(i);
			result[i] = str.charAt(i);
		}
		
		
		for (int i = 1; i < n; i++) {
			str = in.next();
			
			for (int j = 0; j < str.length(); j++) {
				if (result[j] != str.charAt(j)) {
					result[j] = '?';
				}
			}
			
			
		}
		
		for (char ch : result) {
			System.out.print(ch);
		}
		
		
		in.close();
	}
	

}
