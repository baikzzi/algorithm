package javaBasic;

import java.util.Scanner;

public class B27866 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String st = in.next();
		int i = in.nextInt() - 1;
		
		System.out.println(st.charAt(i));
		
		in.close();
		
	}
}
