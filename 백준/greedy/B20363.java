package greedy;

import java.util.*;

public class B20363 {
	public static void main(String[] args) {
		// ������ x��ŭ�� �±�� y��ŭ�� ������ ������ ������� �ڶ�
		// �޺� 1������ �±� 1 ����
		// �޺� 10���������� ���� 1 ����
		// �� 1���� �� ���� 1 ����
		// �� 10 ���������� �±� 1����
		
		// �±� or ������ 0�̸� ���ҵ��� ����
		// �� ó�� �±�� ���� 0
		// ����� ȿ�������� Ű��� ���� �޺��� ���� �ִ� Ƚ�� �ּ�ȭ
		
		Scanner sc = new Scanner(System.in);
		
		long s = sc.nextInt(), w = sc.nextInt();
		
		long ans = s + w;
		ans += Math.min(s,  w) / 10;
		System.out.println(ans);
		
		
		sc.close();
	}
}
