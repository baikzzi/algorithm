package JavaBasic;

import java.util.Scanner;

public class B2566 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[][] arr = new int[10][10];
		
		int maxNum = 0, maxRow = 1, maxCol = 1; // 초기에 행과 열을 0으로 하면 틀림
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				arr[i][j] = in.nextInt();
				if (maxNum < arr[i][j]) {
					maxNum = arr[i][j];
					maxRow = i;
					maxCol = j;
				}
			}
		}
		System.out.println(maxNum);
		System.out.println(maxRow + " " + maxCol);
		in.close();
	}
}
