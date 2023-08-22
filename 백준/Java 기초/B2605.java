package javaBasic;

import java.util.Scanner;

public class B2605 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] seq = new int[n+1];
		for (int i = 1; i <= n; i++) { // 기존 순서 1~n등
			seq[i] = i;
		}
		
		for (int i = 1; i <= n; i++) {
			int drop = sc.nextInt();
			int temp = seq[i];
			for (int j = i; j > i-drop; j--) {
				seq[j] = seq[j-1];
			}
			seq[i-drop] = temp;
		}
		
		for(int i = 1; i <= n; i++) {
			System.out.print(seq[i] + " ");
		}
		
		sc.close();
	}

}
