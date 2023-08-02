package JavaBasic;

import java.util.Scanner;

public class B2439 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = n-1; i >= 0; i--) {
			for (int j =  1; j <= n; j++) {
				if (i >= j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
//
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= n - i; j++) {
//				System.out.print(" ");
//			}
//			for (int k = 0; k < i; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		sc.close();
	}

}
