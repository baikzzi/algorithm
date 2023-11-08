package greedy;

import java.io.*;
import java.util.*;

public class B26091 {
	static int TESTCASE, N, cnt;
	static int[] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		TESTCASE = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for (int i = 0; i < TESTCASE; i++) {
			cnt = 0;
			N = Integer.parseInt(br.readLine());
			arr = new int[N];
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}

			for (int j = 0; j < N-1; j++) {
				for (int k = j+1; k < N; k++) {
					if (arr[j] > arr[k]) {
						int temp = arr[j];
						arr[j] = arr[k];
						arr[k] = temp;
						cnt++;
					}
				}
			}
			bw.write(cnt + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
