package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1439 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		char prevChar = str.charAt(0);
		int zero = 0;
		int one = 0;
		
		if (prevChar == '0') {
			zero++;
		} else {
			one++;
		}
		
		for (int i = 1; i < str.length(); i++) {
			char nowChar = str.charAt(i);
			if (nowChar != prevChar) {
				if (nowChar == '0') {
					zero++;
				} else {
					one++;
				}
				prevChar = nowChar;
			}
		}
		
		System.out.println(Math.min(zero, one));
		
	}

}
