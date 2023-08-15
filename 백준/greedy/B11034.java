package greedy;

import java.util.Scanner;

public class B11034 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
			
			int result = (b - a > c - b) ? b - a - 1 : c - b - 1;
			
			System.out.println(result);
		}
		
		
		sc.close();
	}

}
