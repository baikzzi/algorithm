package dp;

import java.util.*;

public class B1003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] TESTCASE = new int[n];
		int[][] fib = new int[41][2];
		int max = 0;
		
		for (int i = 0; i < n; i++) {
			TESTCASE[i] = sc.nextInt();
			max = Math.max(max, TESTCASE[i]);
		}
		
		fib[0][0] = 1;
		fib[0][1] = 0;
		fib[1][0] = 0;
		fib[1][1] = 1;
		
		for (int i = 2; i <= max; i++) {
			fib[i][0] = fib[i-1][0] + fib[i-2][0];
			fib[i][1] = fib[i-1][1] + fib[i-2][1];
		}
		
		for (int i = 0; i < n; i++) {
			System.out.println(fib[TESTCASE[i]][0] + " " + fib[TESTCASE[i]][1]);
		}
				
		sc.close();
	}
}
