package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1343 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		String result = "";
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '.') {
				result += ".";
				continue;
			} else if (i + 3 < str.length()) { // "AAAA", "BB" 검사
				if (str.substring(i, i+4).equals("XXXX")) { // "AAAA" 검사
					result += "AAAA";
					i += 3;
				} else if (str.substring(i, i+2).equals("XX")) { // "BB" 검사
					result += "BB";
					i += 1;
				} else {
					result = "-1";
					break;
				}
			} else if (i + 1 < str.length()) {
				if (str.substring(i, i+2).equals("XX")) { // "BB" 검사
					result += "BB";
					i += 1;
				} else {
					result = "-1";
					break;
				}				
			} else {
				result = "-1";
				break;
			}
		}
		
		System.out.println(result);

	
	}

}
