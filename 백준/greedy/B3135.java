package greedy;

import java.util.Scanner;

public class B3135 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ù��° ��ư ���ļ� 1MHz ����
		// �ι�° ��ư ������ 1MHz ����
		// ������ N���� ��ư�� ���ã�� ������� �̸� ������ ���ļ��� �̵�
		
		// �������ļ� A --> ��� ���� ���ļ� B
		// ���� ���� ��ư ��
		
		int a = sc.nextInt(), b = sc.nextInt(); // A to B
		int n = sc.nextInt(); // n���� �ٿ� �̸� ������ ���ļ�
		// �� n���� ��ư�� ������ ���ļ� �� ���� ���ļ� b�� ���� ����� ��ư ã��
		// �� ���� ���� + 1 (���⼭ + 1�� ������ư ������ ��)
		
		int closest = Math.abs(a - b);
		for (int i = 0; i < n; i++) {
			int far = Math.abs(sc.nextInt() - b) + 1;
			closest = (far < closest) ? far : closest;	
		}
		
		System.out.println(closest);
		
		
		sc.close();
	}
}
