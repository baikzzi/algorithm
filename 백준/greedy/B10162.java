package greedy;

import java.util.Scanner;

public class B10162 {
	public static void main(String[] args) {
		// 전자레인지 버튼 A,B,C 각각 5분, 1분 10초
		// 버튼 최소로 눌러 입력된 T에 정확히 맞추기
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		if (t % 10 != 0) {
			System.out.println(-1);
		} else {
			int a = t / 300;
			t -= a * 300;
			int b = t / 60;
			t -= b * 60;
			int c = t / 10;
			System.out.println(a + " " + b + " " + c);
		}
		
		sc.close();
	}
}
