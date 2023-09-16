package dp;

import java.io.*;

public class B11053 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		String[] strArr = br.readLine().split(" ");
		int[] arr = new int[n];
		int[] lis = new int[n]; // longest increase subsequence
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(strArr[i]);
		}
		
		lis[0] = 1;
		int ans = lis[0];
		for (int i = 0; i < n; i++) {
			lis[i] = 1;
			for (int j = i - 1; j >= 0; j--) {
				if (arr[i] > arr[j]) {
					lis[i] = Math.max(lis[i], lis[j] + 1);
				}
			}
			ans = Math.max(ans,  lis[i]);
		}
		bw.write(ans + "\n");
		
		bw.flush();
		bw.close();
		br.close();
	}

}
