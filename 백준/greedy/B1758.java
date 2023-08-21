package greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class B1758 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		Integer arr[] = new Integer[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr, Comparator.reverseOrder());
		
		// 팁 계산
		long totalTip = 0;
		for (int i = 0; i < n; i++) {
			long tip = arr[i] - (i);
			if (tip <= 0) {
				break;
			}
			totalTip += tip;
		}
		
		bw.write(totalTip + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}
