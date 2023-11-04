package dp;

import java.io.*;
import java.util.*;

public class B15645 {
	static int N, maxAns, minAns;
	static int[][] arr, dpMax, dpMin;
	public static void main (String[] args) throws IOException {
		// N�ٿ� 0 �̻� 9������ ���ڰ� 3���� �����ִ�
		// �������� ������ �ϰ� �ִµ�, �� ������ ù �ٿ��� �����ؼ� ������ �ٿ��� ������ �Ǵ� �����̴�.
		// ���� ó���� �����ִ� �� ���� ���� �� �ϳ��� ��� ����
		// �׸��� �����ٷ� �������µ�, ���� �ٷ� ������ �� ������ ���� ���������� �ִ�.
		// �ٷ� �Ʒ��� ���� �Ѿ�ų� �ƴϸ� �ٷ� �Ʒ��� ���� �پ��ִ� ���θ� �̵� ����
		// ����ǥ�� �־����� ��, ���� �� �ִ� �ִ� ����, �ּ� ������ ���ϴ� ���α׷� �ۼ�
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
