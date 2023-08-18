package dp;

import java.util.Scanner;

public class B14916 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] coin = new int[n+1]; // index n에 n원 거슬러줄때 최소개수 저장
		
		if (n == 1 || n == 3) {
			System.out.println(-1);
		} else if (n == 2 || n == 5) {
			System.out.println(1);
		} else if (n == 4) {
			System.out.println(2);
		} else {
			for (int i = 7; i <= n; i++) {
				coin[i] = 99999;
			}
			coin[1] = -1;
			coin[2] = 1;
			coin[3] = -1;
			coin[4] = 2;
			coin[5] = 1;
			coin[6] = 3;
			
			for (int i = 7; i <= n; i++) {
				if (coin[i-2] != -1 && coin[i-5] != -1) {
					coin[i] = (coin[i-2] < coin[i-5]) ? coin[i-2] + 1 : coin[i-5] + 1;
				} else if (coin[i-2] == -1) {
					coin[i] = coin[i-5] + 1;
				} else {
					coin[i] = coin[i-2] + 1;
				}
			}
			
			System.out.println(coin[n]);			
		}
		sc.close();
	}

}
