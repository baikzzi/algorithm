package javaBasic;

import java.io.*;

public class B9012 {
	static int N;
	static String str;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			str = br.readLine();			
			if (vps(str)) bw.write("YES\n");
			else bw.write("NO\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
	static boolean vps(String str) {
		int openCnt = 0;
		
		for (int i = 0; i < str.length(); i++) {
			String st = str.charAt(i) + "";
			
			if (st.equals("(")) {
				openCnt++;
			} else {
				if (openCnt <= 0) {
					return false;
				}
				openCnt--;
			}
		}
		if (openCnt == 0) return true;
		else return false;
	}
}
