package greedy;

import java.io.*;
import java.util.*;

public class B12782 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		final int TESTCASE = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < TESTCASE; i++) {
			int cnt0 = 0, cnt1 = 0;
			
			st = new StringTokenizer(br.readLine());
			String num1 = st.nextToken(), num2 = st.nextToken();
			
			for (int j = 0; j < num1.length(); j++) {
				if (num1.charAt(j) != num2.charAt(j)) {
					if (num1.charAt(j) == '1') {
						cnt0++;
					} else {
						cnt1++;
					}
				}
			}
			
			if (cnt0 >= cnt1) {
				sb.append(cnt0);
			} else {
				sb.append(cnt1);
			}
			
			sb.append("\n");
		}
		
		
		bw.write(sb.toString());
		bw.flush();
		br.close();
		bw.close();
	}
}
