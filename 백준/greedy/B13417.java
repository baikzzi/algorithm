package greedy;

import java.io.*;
import java.util.*;

public class B13417 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
				
		int TEST_CASE = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < TEST_CASE; i++) {
			int n = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			String ans = st.nextToken();
			
			for (int j = 1; j < n; j++) {
				String cha = st.nextToken();
				if (ans.substring(0).compareTo(cha) > -1) {
					ans = cha + ans;
				} else {
					ans = ans + cha;
				}
				
			}
			bw.write(ans + "\n");
		}
		
		
		bw.flush();
		bw.close();
		br.close();
	}
}

