package dp;

import java.util.Scanner;

public class B13699 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long[] arr = new long[n+1];
		
		if (n == 0) {
			System.out.println(1);
		} else {
			arr[0] = 1;
			arr[1] = 1;
			
			for (int i = 2; i <= n; i++) {
				long temp = 0;
				for (int j = 0; j < i; j++) {
					temp += arr[j] * arr[i - j - 1];
				}
				arr[i] = temp;
			}
			
			System.out.println(arr[n]);
			
		}
		sc.close();
	}
}
