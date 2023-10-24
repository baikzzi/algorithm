package bruteForce;

import java.io.*;
import java.util.*;

public class B2501 {
	static int N, K, cnt, ans;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		cnt = 1;
		
		for (int i = 1; i <= N; i++) {
			if (N % i == 0 && cnt++ == K) {
				ans = i;
			}
		}
		bw.write(ans + "\n");
		
		bw.flush();
		bw.close();
		br.close();
	}
}
