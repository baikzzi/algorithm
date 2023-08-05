package javaBasic;

import java.util.Scanner;

public class B25206 {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		double totalScore = 0.0; // 전체 이수학점
		double beforeDiv = 0.0; //곱해서 나누기 전 것들 다 더하기
		
		for (int i = 0; i < 20; i++) {
			String courseName = in.next(); // 안씀
			double score = in.nextFloat();
			String grade = in.next();
			
			
//			System.out.println(courseName);
//			System.out.println(score);
//			System.out.println(grade);
						
			if (grade.equals("P")) { // P (pass)인 과목은 계산안하고 넘아가기
				continue;
			} else {
				totalScore += score; // 이수학점 추가
				beforeDiv += (score * gradeToDouble(grade)); // 학점과 성적 곱해서 누적
			} 
			
//			System.out.println(totalScore);
//			System.out.println(beforeDiv);
			

		}
		
		System.out.printf("%.6f", beforeDiv / totalScore);
		
		in.close();
	}
	
	public static double gradeToDouble(String str) { // String 타입의 학점을 double 타입으로 바꿔주는 메소드
		if (str.equals("A+")) {
			return 4.5;
		} else if (str.equals("A0")) {
			return 4.0;
		} else if (str.equals("B+")) {
			return 3.5;
		} else if (str.equals("B0")) {
			return 3.0;
		} else if (str.equals("C+")) {
			return 2.5;
		} else if (str.equals("C0")) {
			return 2.0;
		} else if (str.equals("D+")) {
			return 1.5;
		} else if (str.equals("D0")) {
			return 1.0;
		} else {
			return 0.0;
		}
	}

}
