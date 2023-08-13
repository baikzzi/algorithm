package greedy;

import java.util.Scanner;

public class B5585 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int change = 1000 - sc.nextInt();
		int[] coin = {500, 100, 50, 10, 5, 1};
		int cnt = 0;
		
		for (int i = 0; i < coin.length; i++) {
			int count = change / coin[i];
			change -= coin[i] * count;
			cnt += count;
		}
		
		System.out.println(cnt);
		
		sc.close();
	}

}
