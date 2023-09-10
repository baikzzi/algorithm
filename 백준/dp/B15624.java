package dp;

import java.io.*;

public class B15624 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		if (n < 2) {
			long[] fibo = new long[2];
			
			fibo[0] = 0;
			fibo[1] = 1;
			
			bw.write(fibo[n] + "\n");
		} else {
			long[] fibo = new long[n+1];
			fibo[0] = 0;
			fibo[1] = 1;
			
			for (int i = 2; i <= n; i++) {
				
				fibo[i] = (fibo[i-1] + fibo[i-2]) % 1000000007;
			}
			bw.write(fibo[n] + "\n");
		}
		
		
		bw.flush();
		br.close();
		bw.close();
	}

}
