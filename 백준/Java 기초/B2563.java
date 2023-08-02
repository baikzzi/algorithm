package JavaBasic;

import java.util.Scanner;

public class B2563 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		boolean[][] arr = new boolean[101][101];
		
		
		for (int i = 0; i < n; i++) {
			int x = in.nextInt(), y = in.nextInt();
			
			for (int j = x; j < x+10; j++) {
				for (int k = y; k < y+10; k++) {
					if (j <= 100 && k <= 100) {
						arr[j][k] = true;
					}
				}
			}
		}
		
		int result = 0;
		
		for (int i = 1; i < 101; i++) {
			for (int j = 1; j < 101; j++) {
				if (arr[i][j]) {
					result++;
				}
			}
		}
		
		System.out.println(result);
		
		in.close();
	}
}
