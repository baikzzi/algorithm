package javaBasic;

import java.io.*;

public class B2292 {
	static int N, ans, compareNum;
	public static void main(String[] args) throws IOException {
		// 육각형으로 이루어진 벌집
		// 중앙의 방 1부터 시작해 이웃하는 방에 돌아가면서 1씩 증가하는 번호로 주소를 매김
		// N이 주어졌을 때, 1부터 N번 방까지 최소 개수의 방을 지나서 갈 때
		// 몇개의 방을 지나서 왔는지 구하는 프로그램 작성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		N = Integer.parseInt(br.readLine());
		ans = 1;
		compareNum = 1;
		while (N > compareNum) {
			compareNum += 6 * ans++; 
		}
		
		bw.write(ans + "\n");
		
		bw.flush();
		bw.close();
		br.close();
	}
}
