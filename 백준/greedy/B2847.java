package greedy;

import java.util.Scanner;

public class B2847 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		int ans = 0;
		for (int i = n-1; i > 0; i--) {
			if (arr[i] <= arr[i-1]) {
				int temp = arr[i-1] - arr[i] + 1;
				ans += temp;
				arr[i-1] -= temp;
			}
		}
		
		System.out.println(ans);
		
		sc.close();
	}

}
