package greedy;

import java.util.*;

public class B12788 {
	public static void main(String[] args) {
		// ���ϴ� ���α׷��� ��ô�ȸ ����
		// �� ��ȸ�� ���ڵ����� ���� Ǯ�����
		// �����ڿ��� ���� �����ϱ� ���� �� ���ؾ���
		// �������� �ʰ� ctp ȸ���鿡�� ���� ������� ��
		
		// ctp���� n���� ȸ������ ����
		// ������ ȸ������ ���뿡 �ִ� ���� ������ ��� �ٸ�
		// �ּ� �ο��鿡�� ������ ���� ��ǥ
		
		// ��ȸ �����ڵ� ��ο��� ���� �����ؾ� ��
		// �� ���� k���� �������� �����Ǿ� ���� �� ����� ȸ���鿡�� ���� ������ �ϴ°�
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // ctp ȸ����
		
		int m = sc.nextInt(), k = sc.nextInt();
		int needPen = m * k;
		
		int[] ctp = new int[n];
		
		for (int i = 0; i < n; i++) {
			ctp[i] = sc.nextInt();
		}
		
		Arrays.sort(ctp); // �������� ������
		
		int cnt = 0;
		for (int i = n-1; i >= 0; i--) {
			if (needPen <= 0) {
				break;
			} else {
				needPen -= ctp[i];
				cnt++;
			}
		}
		
		if (needPen <= 0) {
			System.out.println(cnt);
		} else {
			System.out.println("STRESS");
		}
		sc.close();
	}
}
