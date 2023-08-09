package javaBasic;

import java.util.Scanner;

public class B11050 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), k = sc.nextInt();
		
		System.out.println(binomialCoefficient(n, k));
		
		
		sc.close();
	}
	public static int binomialCoefficient(int n, int k) {
		return factorial(n) / (factorial(n-k) * factorial(k));
	}
	
	public static int factorial(int n) {
		int result = 1;
		
		for (int i = 2; i <= n; i++) {
			result *= i;
		}
		
		return result;
	}
}
