package greedy;

import java.util.Scanner;

public class B10162 {
	public static void main(String[] args) {
		// ���ڷ����� ��ư A,B,C ���� 5��, 1�� 10��
		// ��ư �ּҷ� ���� �Էµ� T�� ��Ȯ�� ���߱�
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		if (t % 10 != 0) {
			System.out.println(-1);
		} else {
			int a = t / 300;
			t -= a * 300;
			int b = t / 60;
			t -= b * 60;
			int c = t / 10;
			System.out.println(a + " " + b + " " + c);
		}
		
		sc.close();
	}
}
