package dp;

import java.util.Scanner;

public class B9656 {
	public  static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String[] arr = new String[n+1];
		
		arr[1] = "CY";
		
		for (int i = 1; i < n; i++) {
			if (arr[i].equals("CY")) {
				arr[i+1] = "SK";
			} else {
				arr[i+1] = "CY";
			}
		}
		
		System.out.println(arr[n]);
		
		
		
		sc.close();
	}

}
