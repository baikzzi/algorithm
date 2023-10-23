package javaBasic;

import java.io.*;

public class B24267 {
	static Long N, cnt, ans;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		N = Long.parseLong(br.readLine());
		
//		MenOfPassion(N);
		ans = (N * (N-1) * (N-2)) / 6;
		bw.write(ans + "\n");
		bw.write(3 + "\n");
	
		bw.flush();
		bw.close();
		br.close();
	}
	static int MenOfPassion(int N) {
		int sum = 0;
		for (int i = 1; i <= N-2; i++) {
			for (int j = i+1; j <= N-1; j++) {
				for (int k = j+1; k <= N; k++) {
//					sum += i*j*k; // 코드 1
					cnt++;
				}				
			}
		}
		System.out.println(cnt);
		return sum;
	}
}
