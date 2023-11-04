package dp;

import java.io.*;
import java.util.*;

public class B15645 {
	static int N, maxAns, minAns;
	static int[][] arr, dpMax, dpMin;
	public static void main (String[] args) throws IOException {
		// N줄에 0 이상 9이하의 숫자가 3개씩 적혀있다
		// 내려가기 게임을 하고 있는데, 이 게임은 첫 줄에서 시작해서 마지막 줄에서 끝나게 되는 놀이이다.
		// 먼저 처음에 적혀있는 세 개의 숫자 중 하나를 골라서 시작
		// 그리고 다음줄로 내려가는데, 다음 줄로 내려갈 때 다음과 같은 제약조건이 있다.
		// 바로 아래의 수로 넘어가거나 아니면 바로 아래의 수와 붙어있는 수로만 이동 가능
		// 숫자표가 주어졌을 때, 얻을 수 있는 최대 점수, 최소 점수를 구하는 프로그램 작성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		N = Integer.parseInt(br.readLine());
		arr = new int[N][3];
		dpMax = new int[N][3];
		dpMin = new int[N][3];
		
		StringTokenizer st;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 3; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for (int i = 0; i < 3; i++) {
			dpMax[0][i] = arr[0][i];
			dpMin[0][i] = arr[0][i];
		}
		
		for (int i = 1; i < N; i++) {
			for (int j = 0; j < 3; j++) {
				if (j == 0) {
					dpMax[i][0] = Math.max(dpMax[i-1][0], dpMax[i-1][1]) + arr[i][0]; 
					dpMin[i][0] = Math.min(dpMin[i-1][0], dpMin[i-1][1]) + arr[i][0];
				} else if (j == 1) {
					dpMax[i][1] = Math.max(dpMax[i-1][0], Math.max(dpMax[i-1][1], dpMax[i-1][2])) + arr[i][1]; 
					dpMin[i][1] = Math.min(dpMin[i-1][0], Math.min(dpMin[i-1][1], dpMin[i-1][2])) + arr[i][1];
				} else { // j == 2
					dpMax[i][2] = Math.max(dpMax[i-1][1], dpMax[i-1][2]) + arr[i][2]; 
					dpMin[i][2] = Math.min(dpMin[i-1][1], dpMin[i-1][2]) + arr[i][2];
				}
			}
		}
		maxAns = Math.max(dpMax[N-1][0], Math.max(dpMax[N-1][1],  dpMax[N-1][2]));
		minAns = Math.min(dpMin[N-1][0], Math.min(dpMin[N-1][1],  dpMin[N-1][2]));
		
		bw.write(maxAns + " " + minAns + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}
