package javaBasic;

import java.io.*;

public class B1193 {
	static int N, cross_cnt, prev_acc_sum, i, j;	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		N = Integer.parseInt(br.readLine());
		if (N == 1) {
			bw.write("1/1\n");
		} else {
			cross_cnt = 2;
			prev_acc_sum = 1;
			while (true) {
				if (N <= prev_acc_sum + cross_cnt) {
					if (cross_cnt % 2 == 0) { // 짝수 == 위에서 아래로
						bw.write((N - prev_acc_sum) + "/" + (cross_cnt - (N - prev_acc_sum - 1)) + "\n");
					} else { // 홀수 == 아래서 위로
						bw.write((cross_cnt - (N - prev_acc_sum - 1)) + "/" + (N - prev_acc_sum) + "\n");
					}
					break;
				} else {
					prev_acc_sum += cross_cnt;
					cross_cnt++;
				}	
			}
		}
		
		bw.flush();
		bw.close();
		br.close();		
	}
}
