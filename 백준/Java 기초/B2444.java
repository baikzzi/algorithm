package JavaBasic;

import java.util.Scanner;

public class B2444 {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		for (int i = 1; i <= n; i++) { // * 개수가 늘어나는 구간
			for (int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i*2 -1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = n-1; i >= 1; i--) { // * 개수가 줄어드는 구간
			for (int j = n-i; j >= 1; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i*2-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		in.close();
	}
}