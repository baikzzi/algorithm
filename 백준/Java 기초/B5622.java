package javaBasic;

import java.util.Scanner;

public class B5622 {
	public static void main (String[] args) {
		// 각 알파벳이 가리키는 숫자 다 더하고 알파벳에 해당하는 수를 더해서 출력
		
		Scanner in = new Scanner(System.in);
		
		String str = in.next();
		
		int len = str.length();
		
		int result = len;
		
		for (int i = 0; i < len; i++) {
			result += convToChar(str.charAt(i));
		}
		
		System.out.println(result);
				
		in.close();
	}
	
	public static int convToChar(char str) {
		if (str == 'A' || str == 'B' || str == 'C') {
			return 2;
		} else if (str == 'D' || str == 'E' || str == 'F') {
			return 3;
		} else if (str == 'G' || str == 'H' || str == 'I') {
			return 4;
		} else if (str == 'J' || str == 'K' || str == 'L') {
			return 5;
		} else if (str == 'M' || str == 'N' || str == 'O') {
			return 6;
		} else if (str == 'P' || str == 'Q' || str == 'R' || str == 'S') {
			return 7;
		} else if (str == 'T' || str == 'U' || str == 'V') {
			return 8;
		} else {
			return 9;
		}
	}
}
