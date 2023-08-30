package greedy;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class B20044 {
	public static void main(String[] args) throws IOException {
		// 코딩 프로젝트 공정한 팀구성 하려함
		// 두명 한팀, 각 학생들의 코딩 역량이 다 다름
		// 코딩 역량의 합을 최대한 일정하게 유지하려 함
		// 학생들의 코딩 역량이 주어졌을 때 팀 구성에 도움되는 프로그램을 작성해라
		
		// 학생 수 2n
		// 각 학생의 코딩 역량 w
		// 팀 g의 코딩역량은 학생들의 코딩 역량의 합
		// 제일 못하는 팀의 역량이 최대가 되도록
		
		Scanner sc = new Scanner(System.in);
		
		int teamNum = sc.nextInt();
		int stuNum = 2 * teamNum;
		int[] ability = new int[stuNum];
		
		for (int i = 0; i < stuNum; i++) {
			ability[i] = sc.nextInt();
		}
		
		Arrays.sort(ability);
		
		int min = 999999999;
		
		for (int i = 0; i < teamNum; i++) {
			min = Math.min(min,  ability[i] + ability[stuNum-i-1]);			
		}
		
		System.out.println(min);
		sc.close();
	}

}
