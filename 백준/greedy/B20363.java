package greedy;

import java.util.*;

public class B20363 {
	public static void main(String[] args) {
		// 씨앗이 x만큼의 온기와 y만큼의 수분을 가지면 당근으로 자람
		// 햇빛 1받을때 온기 1 증가
		// 햇빛 10받을때마다 수분 1 감소
		// 물 1받을 때 수분 1 증가
		// 물 10 받을때마다 온기 1감소
		
		// 온기 or 수분이 0이면 감소되지 않음
		// 맨 처음 온기와 수분 0
		// 당근을 효율적으로 키우기 위해 햇빛과 물을 주는 횟수 최소화
		
		Scanner sc = new Scanner(System.in);
		
		long s = sc.nextInt(), w = sc.nextInt();
		
		long ans = s + w;
		ans += Math.min(s,  w) / 10;
		System.out.println(ans);
		
		
		sc.close();
	}
}
