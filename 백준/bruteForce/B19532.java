package bruteForce;

import java.io.*;
import java.util.*;

public class B19532 {
	static int a, b, c, d, e, f;
	public static void main(String[] args) throws IOException {
		// ���ڰ� 2���� ������������ �ذ��ϴ� ����� ���� �����ϰ�, ������ ���� ������ ������ �´�.
		// ���� ���������Ŀ��� x�� y�� ���� ����Ͻÿ�
		// ax + by = c
		// dx + ey = f
		// a, b, c, d, e, f, x, y ��� -999 ~ 999�� ����ǰ� �����ϴ� (x, y)�� �����ϰ� ����
		// x�� y�� �������� ������ ���
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		d = Integer.parseInt(st.nextToken());
		e = Integer.parseInt(st.nextToken());
		f = Integer.parseInt(st.nextToken());
		
		for (int i = -999; i <= 999; i++) {
			for (int j = -999; j <= 999; j++) {
				if (a*i + b*j == c && d*i + e*j == f) {
					System.out.println(i + " " + j);
					System.exit(0);
				}
			}
		}
	}
}
