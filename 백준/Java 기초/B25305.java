package JavaBasic;

import java.util.Scanner;

public class B25305 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt(), k = in.nextInt();
		
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(arr[n-k]);
		
		in.close();
	}

}
