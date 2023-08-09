package javaBasic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B25497 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		br.readLine();
		String str = br.readLine();
		
		int cnt = 0;
		int cntL = 0;
		int cntS = 0;
		boolean check = true;
		
		for (int i = 0; check && i < str.length(); i++) {
			check = true;
			
			switch (str.charAt(i)) {
				case 'L': cntL++; break;
				case 'S': cntS++; break;
				case 'R': if (cntL == 0) { check = false; } else { cnt++; cntL--; } break; 
				case 'K': if (cntS == 0) { check = false; } else { cnt++; cntS--; } break;
				default: cnt++; }
		}
		System.out.println(cnt);
		
		
	}

}
