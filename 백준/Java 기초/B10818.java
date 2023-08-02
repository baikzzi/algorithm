package JavaBasic;

import java.util.Scanner;

public class B10818 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[] arr = new int[in.nextInt()];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		
		int min = arr[0], max = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			} else if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(min + " " + max);
		
		in.close();
	}

}
