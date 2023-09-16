package dp;

import java.io.*;

public class B11722 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		String[] strArr = br.readLine().split(" ");
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(strArr[i]);
		}
		int[] lds = new int[N]; // longest decrease subsequence
		lds[0] = 1;
		for (int i = 1; i < N; i++) {
			lds[i] = 1;
			for (int j = i-1; j >= 0; j--) {
				if (arr[i] < arr[j]) {
					lds[i] = Math.max(lds[i],  lds[j]+1);
				}
			}
		}
		int ans = lds[0];
		for (int i = 1; i < N; i++) {
			ans = Math.max(ans,  lds[i]);
		}
		bw.write(ans + "\n");
		
		
		bw.flush();
		bw.close();
		br.close();
	}
}
