package javaBasic;

import java.util.Scanner;

public class B2693 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		int[] arr = new int[10];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < arr.length; j ++) {
				arr[j] = in.nextInt();
			}
			findThirdMax(arr);
		}
		
		in.close();
	}
	
	public static void findThirdMax(int[] arr) {
		for (int j = 0; j < 3; j++) {
			int maxIdx = 0;
			int max = arr[0];

			for (int i = 1; i < 10 - j; i++) {
				if (arr[i] > max) {
					max = arr[i];
					maxIdx = i;
				}
			}
			
			int temp = arr[9-j];
			arr[9-j] = arr[maxIdx];
			arr[maxIdx] = temp;
			
		}
		System.out.println(arr[7]);
	}

}
