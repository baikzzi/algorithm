package greedy;

import java.util.Scanner;

public class B1789 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long s = sc.nextLong();
		
		long sum = 1;
		int cnt = 1;
		
		while (sum < s) {
			if (sum + cnt + 1 > s) {
				break;
			} else {
				sum += ++cnt;
			}
		}
		
		System.out.println(cnt);
		
		sc.close();
	}

}
