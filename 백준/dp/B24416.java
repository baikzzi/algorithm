package dp;

import java.util.Scanner;

public class B24416 {
	static int fibCnt = 0;
	static int fibonacciCnt = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		fib(n);
		fibonacci(n);

		System.out.println(fibCnt + " " + fibonacciCnt);
		
		sc.close();
	}
	
	public static int fib(int n) {
		if (n == 1 || n == 2) {
			fibCnt++; // 코드 1
			return 1;
		} else {
			return (fib(n - 1) + fib(n - 2));
		}
	}
	
	public static int fibonacci(int n) {
		int[] fibArr = new int[n + 1];
		fibArr[1] = 1;
		fibArr[2] = 1;
		
		for (int i = 3; i <= n; i++) {
			fibonacciCnt++; // 코드 2
			fibArr[i] = fibArr[i - 1] + fibArr[i - 2];
		}
		
		return fibArr[n];		
	}

}
