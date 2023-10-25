package bruteForce;

import java.io.*;

public class B2231 {
	static int N, start_num, len_N, sum, temp;
	static String strN;
	public static void main(String[] args) throws IOException {
		// � �ڿ��� N�� ���� ��, �� �ڿ��� N�� �������� N�� N�� �̷�� �� �ڸ����� ���� �ǹ��Ѵ�.
		// � �ڿ��� M�� �������� N�� ���, M�� N�� �����ڶ� �Ѵ�.
		// ex) 245�� ������ (=245 + 2 + 4 + 5)�̴�. �̶� 245�� 256�� �����ڰ� �ȴ�.
		// ���� � �ڿ����� �����ڰ� ���� ���� �������� ���� �ִ�.
		// ���� ���� �����ڸ� ���ϴ� ���α׷��� �ۼ��Ͻÿ�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		N = Integer.parseInt(br.readLine());
		
		if (N < 10) {
			if (N % 2 == 0) bw.write(N / 2 + "\n");
			else bw.write(0 + "\n");
		}
		else {
			strN = Integer.toString(N);
			len_N = strN.length();
			start_num = N - (len_N * 9);
			
			for (int i = start_num; i <= N; i++) {
				sum = 0;
				sum += i;
				temp = i;
				
				for (int j = 0; j < len_N; j++) {
					sum += (temp % 10);
					temp /= 10;
				}
				
				if (sum == N) {
					bw.write(i + "\n");
					break;
				} else if (i == N) bw.write(0 + "\n");
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
