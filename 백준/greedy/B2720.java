package greedy;

import java.util.Scanner;

public class B2720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		
		int cnt = 0;
		int[] coin = {25, 10, 5, 1};
		
		for (int i = 0; i < testCase; i++) {
			int change = sc.nextInt();
			
			for (int j = 0; j < coin.length; j++) {
				cnt = change / coin[j];
				change -= cnt * coin[j];
				System.out.print(cnt + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
