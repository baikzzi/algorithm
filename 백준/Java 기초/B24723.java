package JavaBasic;

import java.util.Scanner;

public class B24723 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		int result = 2;
		
		for (int i = 0; i < n-1; i++) {
			result *= 2;
		}
		
		System.out.println(result);
		
		in.close();
	}

}
