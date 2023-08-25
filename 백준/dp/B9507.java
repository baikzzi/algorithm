package dp;

import java.math.BigInteger;
import java.util.Scanner;

public class B9507 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		int maxFibo = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			maxFibo = Math.max(maxFibo, arr[i]);
		}
		if (maxFibo < 4) {
			for (int i = 0; i < n; i++) {
				if (arr[i] < 2) {
					System.out.println(1);
				} else if (maxFibo == 2) {
					System.out.println(2);
				} else {
					System.out.println(4);
				}
			}
		} else {
			BigInteger[] fibo = new BigInteger[maxFibo+1];
			
			fibo[0] = BigInteger.valueOf(1);
			fibo[1] = BigInteger.valueOf(1);
			fibo[2] = BigInteger.valueOf(2);
			fibo[3] = BigInteger.valueOf(4);
			fibo[4] = BigInteger.valueOf(8);
			
			for (int i = 5; i <= maxFibo; i++) {
				fibo[i] = fibo[i-1].multiply(BigInteger.valueOf(2)).subtract(fibo[i-5]);
			}
			
			for (int i = 0; i < n; i++) {
				System.out.println(fibo[arr[i]]);
			}
		}
		
		sc.close();
	}

}
