package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2839 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n+1];
		
		for (int i = 0; i <= n; i++) {
			if (i % 3 == 0) {
				arr[i] = i / 3;
			} else if (i % 5 == 0) {
				arr[i] = i / 5;
			} else {
				arr[i] = -1;
			}
		}
		
		for (int i = 6; i <= n; i++) {
			if (arr[i-3] != -1 && arr[i-5] != -1) {
				arr[i] = Math.min(arr[i-3], arr[i-5]) + 1;
			} else if (arr[i-3] == -1 && arr[i-5] == -1) {
				arr[i] = -1;			
			} else if (arr[i-5] == -1) {
				arr[i] = arr[i-3] + 1;
			} else {
				arr[i] = arr[i-5] + 1;
			}
			
		}
		
		System.out.println(arr[n]);
	}
}
