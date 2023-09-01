package greedy;

import java.util.*;

public class B11256 {
	public static void main(String[] args) {
		// j개의 사탕을 보내기 위해 상자 포장 해야함
		// 크기가 다른 n개 상자, 그중 편의를 위해 최소만 쓰려함 (박스의 일부분만 채워도 됨)
		// 사타의 개수와 각 상자의 크기를 입력받고, 상자를 최소한으로 쓸때 사용되는 상자의 개수 출력 프로그램
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); 
		
		for (int i = 0; i < n; i++) {
			int candy = sc.nextInt(), box = sc.nextInt();
			int[] boxSize = new int[box];
			
			for (int j = 0; j < box; j++) {
				boxSize[j] = sc.nextInt() * sc.nextInt();
			}
			Arrays.sort(boxSize);
			
			int cnt = 0;
			for (int k = box-1; k >= 0; k--) {
				if (candy <= 0) {
					break;
				} else {
					candy -= boxSize[k];
					cnt++;
				}
			}
			System.out.println(cnt);
			
		}
		
		sc.close();
	}

}
