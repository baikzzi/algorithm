package dp;

import java.util.Scanner;

public class B9625 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] a = new int[n+1];
		int[] b = new int[n+1];
		
		a[0] = 1;
		a[1] = 0;
		b[0] = 0;
		b[1] = 1;
		
		for (int i = 2; i <= n; i++) {
			a[i] = a[i-1] + a[i-2];
			b[i] = b[i-1] + b[i-2];
		}
		
		System.out.println(a[n] + " " + b[n]);
		
		sc.close();
	}

}
