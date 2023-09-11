package dp;

import java.io.*;
import java.util.*;

public class B15489 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int r = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken()), w = Integer.parseInt(st.nextToken());
		long[][] arr = new long[r+w-1][r+w-1];
		
		for(int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i < j) {
					continue;
				} else if (j == 0 || i == j) {
					arr[i][j] = 1;
				} else if (i > j) {
					arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
				}
			}
		}
		
		long ans = 0;
		
		for (int i = 0; i < w; i++) {
			for (int j = 0; j <= i; j++) {
				ans += arr[i+r-1][j+c-1];
			}
		}
		bw.write(ans + "\n");
		
		bw.flush();
		br.close();
		bw.close();
	}

}
