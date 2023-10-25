package bruteForce;

import java.io.*;

public class B2231 {
	static int N, start_num, len_N, sum, temp;
	static String strN;
	public static void main(String[] args) throws IOException {
		// 어떤 자연수 N이 있을 때, 그 자연수 N의 분해합은 N과 N을 이루는 각 자리수의 합을 의미한다.
		// 어떤 자연수 M의 분해합이 N인 경우, M을 N의 생성자라 한다.
		// ex) 245의 분해합 (=245 + 2 + 4 + 5)이다. 이때 245는 256의 생성자가 된다.
		// 물론 어떤 자연수에 생성자가 없을 수도 여러개일 수도 있다.
		// 가장 작은 생성자를 구하는 프로그램을 작성하시오
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
