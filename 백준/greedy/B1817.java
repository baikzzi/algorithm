package greedy;

import java.util.Scanner;

public class B1817 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), m = sc.nextInt();
		
		int cnt = 1;
		int currentWeight = 0;
		
		if (n == 0) {
			System.out.println(0);
		} else {
			for (int i = 0; i < n; i++) {
				int book = sc.nextInt();
				
				if (currentWeight + book <= m) {
					currentWeight += book;
				} else {
					cnt++;
					currentWeight = book;
				}
				
			}
			
			System.out.println(cnt);
		}
		
		sc.close();
	}

}
