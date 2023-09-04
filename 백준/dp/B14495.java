package dp;

import java.util.*;

public class B14495 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if (n < 4) {
			System.out.println(1);
		} else {
			long[] arr = new long[n+1];
			arr[1] = 1;
			arr[2] = 1;
			arr[3] = 1;
			
			for (int i = 4; i <= n; i++) {
				arr[i] = arr[i-1] + arr[i-3];
			}
			
			System.out.println(arr[n]);
		}
		
		
		
		sc.close();
	}
}
