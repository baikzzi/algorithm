package greedy;

import java.io.*;

public class B12927 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		int[] arr = new int[str.length() + 1];
		
		for (int i = 1; i <= str.length(); i++) {
			arr[i] = str.charAt(i-1)=='Y'? 1 : 0;			
		}
		
		int cnt = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == 1) {
				cnt ++;
				for (int j = 1; j*i < arr.length; j++) {
					arr[j*i] = (arr[j*i] + 1) % 2;
				}
			}
		}
		bw.write(cnt + "\n");
		bw.flush();
		bw.close();
		br.close();
	}

}
