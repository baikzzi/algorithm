package JavaBasic;

import java.util.Scanner;

public class B5597 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[] arr = new int[31];
		
		for (int i = 0; i < 28; i++) {
			int stdnum = in.nextInt();
			arr[stdnum] = 1;
		}
		for (int i = 1; i <= 30; i++) {
			if (arr[i] != 1) {
				System.out.println(i);
			}
		}
		in.close();
	}

}
