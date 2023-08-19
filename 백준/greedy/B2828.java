package greedy;

import java.util.Scanner;

public class B2828 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), m = sc.nextInt();
		int left = 1;
		int right = left + m - 1;
		
		int j = sc.nextInt();
		int moveCnt = 0;
		
		for (int i = 0; i < j; i++) {
			int drop = sc.nextInt();
			if (left <= drop && drop <= right) { // �ٱ��� ���� left~right ����
				continue;
			} else if (right < drop) { // �ٱ��� ������
				moveCnt += drop - right;
				left += drop - right;
				right += drop - right;
			} else { // �ٱ��� ����
				moveCnt += left - drop;
				right -= left - drop;
				left -= left - drop;
				
			}
		}
		System.out.println(moveCnt);
		
		sc.close();
	}

}
