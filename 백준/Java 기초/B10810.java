package JavaBasic;

import java.util.Scanner;

public class B10810 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt(), m = in.nextInt();
		
		int[] arr = new int[n+1];
		
		for (int x = 0; x < m; x++) {
			int a = in.nextInt(), j = in.nextInt(), k = in.nextInt();
			for (int i = a; i <= j; i++) {
				arr[i] = k;				
			}
		}
		for (int i = 1; i <= n; i++) {
			System.out.print(arr[i] + " ");
		}
		
		in.close();
	}

}
