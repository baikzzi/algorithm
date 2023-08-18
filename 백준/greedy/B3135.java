package greedy;

import java.util.Scanner;

public class B3135 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 첫번째 버튼 주파수 1MHz 증가
		// 두번째 버튼 주차수 1MHz 감소
		// 나머지 N개의 버튼은 즐겨찾기 기능으로 미리 지정된 주파수로 이동
		
		// 현재주파수 A --> 듣고 싶은 주파수 B
		// 가장 적은 버튼 수
		
		int a = sc.nextInt(), b = sc.nextInt(); // A to B
		int n = sc.nextInt(); // n개의 줄에 미리 지정된 주파수
		// 위 n개의 버튼에 지정된 주파수 중 목적 주파수 b와 가장 가까운 버튼 찾고
		// 그 둘의 차이 + 1 (여기서 + 1은 지정버튼 누르는 것)
		
		int closest = Math.abs(a - b);
		for (int i = 0; i < n; i++) {
			int far = Math.abs(sc.nextInt() - b) + 1;
			closest = (far < closest) ? far : closest;	
		}
		
		System.out.println(closest);
		
		
		sc.close();
	}
}
