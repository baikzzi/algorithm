package JavaBasic;

import java.util.Scanner;

public class B3003 {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[] chess = {1, 1, 2, 2, 2, 8};
		
		for (int i = 0; i < chess.length; i++) {
			chess[i] -= in.nextInt();
			System.out.print(chess[i] + " ");
		}
		
		in.close();
	}

}
