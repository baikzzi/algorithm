package greedy;

import java.util.Scanner;

public class B1026 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		
		
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
		}
		
		// a 오름차순, b 내림차순 정렬
		
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (b[i] < b[j]) {
					int temp = b[i];
					b[i] = b[j];
					b[j] = temp;
				}
			}
		}
		
		int s = 0;
		for (int i = 0; i < n; i++) {
			s += a[i] * b[i];
		}
		System.out.println(s);
		
		sc.close();
	}
}
