package greedy;

import java.io.*;

public class B13413 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// 카메라, 센서, 라즈베리 파이, 집게발을 이용해 로봇 완성
		// 이 로봇을 통해 오셀로 재배치 작업 하려고 함
		// 오셀로 말은 앞면이 검정, 뒷면이 흰색으로 된 말
		// 로봇을 이용하여 초기 상태를 목표상태로 바꾸는 일
		
		// 1. 배치된 말 중 임의의 2개의 말을 골라 서로의 위치를 바꾼다.
		// 2. 말 1개를 들어 뒤집어 ㄶ아 색상을 변경한다.
		
		// 목표 상태로 달성을 위한 최소 횟수 구하는 프로그램 작성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		final int TESTCASE = Integer.parseInt(br.readLine());

		for (int i = 0; i < TESTCASE; i++) {
			int n = Integer.parseInt(br.readLine());
			String before = br.readLine();
			String after = br.readLine();
			
			int bCnt = 0, wCnt = 0;
			
			for (int j = 0; j < n; j++) {
				if (before.charAt(j) == after.charAt(j)) {
					continue;
				} else if (before.charAt(j) == 'B') {
					bCnt++;
				} else {
					wCnt++;
				}
			}
			int cnt = Math.max(bCnt, wCnt);			
			bw.write(cnt + "\n");
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
}
