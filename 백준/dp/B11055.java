package dp;

import java.io.*;

public class B11055 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		String[] strArr = br.readLine().split(" ");
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(strArr[i]);
		}
		
		int[] bis = new int[n]; // biggest increase subsequence
		bis[0] = arr[0];
		
		int ans = bis[0];
		
		for (int i = 1; i < n; i++) {
			bis[i] = arr[i];
			for (int j = i - 1; j >= 0; j--) {
				if (arr[i] > arr[j]) {
					bis[i] = Math.max(bis[i], bis[j] + arr[i]);
				}
			}
			ans = Math.max(ans, bis[i]);
		}
		bw.write(ans + "\n");
		
		bw.flush();
		bw.close();
		br.close();
	}
}
