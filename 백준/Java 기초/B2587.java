package JavaBasic;

import java.util.Scanner;

public class B2587 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		int sum = 0;
		
		for (int i = 0; i < 5; i++) {
			arr[i] = in.nextInt();
			sum += arr[i];
		}
		
		for (int i = 0; i < 5 - 1; i ++) {
			for (int j = i + 1; j < 5; j ++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(sum / 5);
		System.out.println(arr[2]);
		
		in.close();
	}

}
