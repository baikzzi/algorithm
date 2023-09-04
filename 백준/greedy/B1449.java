package greedy;

import java.util.*;

public class B1449 {
	public static void main(String[] args) {
		// ���������� ���� ���� ���� �ű��ϰԵ� 
		// ���� ���ʿ��� ������ŭ ������ �Ÿ��� ���� ����
		// ���̰� L�� ������ ���Ѱ� ����������
		// �� ���� �� ��� �� ��ġ�� �¿� 0.5��ŭ ������ ��� ���� �ٽô� �� ���ٰ� ������
		// ���� ���� ���� ��ġ�� / ������ ���̰� �־����� ��
		// �ʿ��� ������ �ּ� ���� ���ϱ�
		// �������� �ڸ� �� ���� ���� ���̴� ���� �����ϴ�.
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), l = sc.nextInt();
		int[] hole = new int[n];
		
		for (int i = 0; i < n; i++) {
			hole[i] = sc.nextInt();
		}
		
		Arrays.sort(hole);
		
		int cnt = 0;
		int covered = 0;
		for (int i = 0; i < n; i++) {
			if (hole[i] <= covered) {
				continue;
			} else {
				cnt++;
				covered = hole[i] + l - 1;
			}
			
		}
		
		System.out.println(cnt);
		
		
		sc.close();
	}

}
