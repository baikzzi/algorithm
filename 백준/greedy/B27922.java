package greedy;

import java.io.*;
import java.util.*;

public class B27922 {
	static int N, K, max, ans;
	static int[][] arr, sum;
	public static void main(String[] args) throws IOException {
		// 현대모비스 입사 프로젝트
		// 효율적인 공부를 위해 통신기술, 알고리즘, 기계구조학 역량을 기르는 강의 N개
		// i번째 강의는 세 종류의 역량을 각각 ai, bi, ci 만큼 증가 시켜줌
		// 시간이 모자라 두가지 역량만 최대화 하려함
		// n개의 강의중 k개의 강의를 수강했을 때 얻을 수 있는 두 종류의 역량의 합이 최댓값
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		arr = new int[N][3];
		sum = new int[3][N];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 3; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for (int i = 0; i < N; i++) {
			sum[0][i] = arr[i][0] + arr[i][1]; // a+b
			sum[1][i] = arr[i][0] + arr[i][2]; // a+c
			sum[2][i] = arr[i][1] + arr[i][2]; // b+c
		}
		
		for (int i = 0; i < 3; i++) {
			Arrays.sort(sum[i]);
		}
		
		for (int i = 0; i < 3; i++) {
			ans = 0;
			for (int j = N-1; j >= N-K; j--) {
				ans += sum[i][j];
			}
			max = Math.max(max,  ans);
		}
		
		bw.write(max + "\n");
		
		bw.flush();
		bw.close();
		br.close();
	}
}
