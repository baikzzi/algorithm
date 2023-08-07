package javaBasic;

import java.util.Scanner;

public class B10817 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
		
		if (a <= b &&  b <= c || c <= b && b <= a) {
			System.out.println(b);
		} else if (b <= a &&  a <= c || c <= a && a <= b) {
			System.out.println(a);
		} else {
			System.out.println(c);
		}
		
		in.close();
	}

}
