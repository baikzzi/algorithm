package greedy;

import java.util.Scanner;

public class B2864 {
	public static void main(String[] args) {
		// 두 수에 5 혹은 6이 들어있을 때
		// 6을 모두 5로 바꾸어 min에 저장
		// 5를 모두 6으로 바꾸어 max에 저장
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next(), b = sc.next();
		
//		int minA = Integer.parseInt(a.replace('6', '5'));
//		int maxA = Integer.parseInt(a.replace('5', '6'));;
//		int minB = Integer.parseInt(b.replace('6', '5'));;
//		int maxB = Integer.parseInt(b.replace('5', '6'));;
//		
//		int minSum = minA + minB;
//		int maxSum = maxA + maxB;

		int minSum = Integer.parseInt(a.replace('6', '5')) + Integer.parseInt(b.replace('6', '5'));
		int maxSum = Integer.parseInt(a.replace('5', '6')) + Integer.parseInt(b.replace('5', '6'));
		
		
		System.out.println(minSum + " " + maxSum);
		
		sc.close();		
	}

}
