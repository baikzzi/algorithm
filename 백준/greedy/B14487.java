package greedy;

import java.util.Scanner;

public class B14487 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int totalCost = 0;
		int maxCost = 0;
		
		for (int i = 0; i < n; i++) {
			int cost = sc.nextInt();
			
			if (cost > maxCost) {
				totalCost += maxCost;
				maxCost = cost;
			} else {
				totalCost += cost;
			}
		}
		
		System.out.println(totalCost);
		
		
		sc.close();
	}

}
