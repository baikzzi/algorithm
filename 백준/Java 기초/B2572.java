package JavaBasic;

import java.util.Scanner;

public class B2572 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[] arr = new int[3];
		
		int idx = 0;
		int temp = 0;
		
		for (int i = 0; i < 3; i++) {
			arr[i] = in.nextInt();
		}
		
		for (int i = 0; i < 3; i++) {
			
			int minNum = 99999999;
			
			for (int j = i; j < 3; j++) {
				if (minNum > arr[j]) {
					minNum = arr[j];
					idx = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[idx];
			arr[idx] = temp;
		}
		
		for (int i = 0; i < 3; i++) {
			System.out.print(arr[i] + " ");
		}
		in.close();
	}

}
