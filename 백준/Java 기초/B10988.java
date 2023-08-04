package javaBasic;

import java.util.Scanner;

public class B10988 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String str = in.next();
		
		int len = str.length();
		
		int revCnt = len - 1;
		
		for (int i = 0; i < len; i++) {
			if (i >= revCnt) {
				System.out.println(1);
				break;
			}
			if (str.charAt(i) != str.charAt(revCnt)) {
				System.out.println(0);
				break;				
			}
			revCnt--;
		}
		
		
		in.close();
	}

}
