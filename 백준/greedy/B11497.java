package greedy;

import java.io.*;
import java.util.*;

public class B11497 {
	static int TESTCASE, size, maxGap;
	static int[] arr, logSeq;
	public static void main(String[] args) throws IOException {
		// 남규는 통납무 세워놓고 건너뛰기를 좋아함
		// N개의 통나무를 원형으로 세워두고 뛰어 놀려함
		// 인접한 옆 통나무로 건너뛰는데 이때 각 인접한 통나무의 높이 차가 최소가 되게 하려 함
		// 통나무 건너뛰기의 난이도는 인접한 두 통나무 간의 높이의 차의 최댓값으로 결정된다.
		// 높이가 {2, 4, 5, 7, 9}인 통나무로 [2, 9, 7, 4, 5]순서로 세웠다면
		// 가장 첫 통나무 2와 가장 마지막 통나무 5 역시 인접해 있다.
		// 이때의 난이도는 | 2-9 | = 7 이다. 
		// 더 나은 배열 [2, 5, 9, 7, 4]를 만들 수 있고 이때 난이도는 |5-9| = 4이다.
		// 이때 최소 난이도 4가 정답
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		TESTCASE = Integer.parseInt(br.readLine());
		while(TESTCASE-- > 0) {
			size = Integer.parseInt(br.readLine());
			arr = new int[size];
			logSeq = new int[size];
			
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < size; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(arr);
			
			
			for (int i = 0; i < size-1; i+=2) {
				logSeq[i/2] = arr[i];
				logSeq[size-1-(i/2)] = arr[i+1];
			}
			if (size % 2 != 0) { // 길이가 홀수면 하나 남은거 맞는 자리에 추가해주기
				logSeq[size/2] = arr[size-1];
			}
			
			maxGap = Math.abs(logSeq[size-1] - logSeq[0]);
			for (int i = 0; i < size - 1; i++) {
				maxGap = Math.max(maxGap, Math.abs(logSeq[i] - logSeq[i+1]));
			}
			
			bw.write(maxGap + "\n");
		}		
		
		bw.flush();
		bw.close();
		br.close();		
	}
}
