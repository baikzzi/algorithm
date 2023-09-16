package dp;

import java.io.*;

public class B1463 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n+1];
		
		if (n == 1) {
			bw.write(0 + "\n");
		} else {
//			for (int i = 2; i <= n; i++) {
//				arr[i] = i-1;
//			}
			
			for (int i = 2; i <= n; i++) {
				if (i % 2 == 0 && i % 3 == 0) {
					arr[i] = Math.min(arr[i-1]+1,  Math.min(arr[i/2] + 1, arr[i/3] + 1));
				} else if (i % 2 == 0) {
					arr[i] = Math.min(arr[i-1]+1,  arr[i/2] + 1);
				} else if (i % 3 == 0) {
					arr[i] = Math.min(arr[i-1]+1,  arr[i/3] + 1);
				} else {
					arr[i] = arr[i-1] + 1;
				}
			}			
			
			bw.write(arr[n] + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	
	}
}
