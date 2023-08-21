package javaBasic;

//import java.util.Scanner;
//
//public class B2890 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		int r = sc.nextInt(), c = sc.nextInt();
//		// r개의 줄에 c열의 위성사진
//		
//		char[][] arr = new char[r][c];
//		boolean[] goalin = new boolean[r];
//		
//		for (int i = 0; i < r; i++) {
//			String str = sc.next();
//			
//			for (int j = 0; j < c; j++) {
//				arr[i][j] = str.charAt(j);
//			}
//		}
//		
//		int rank = 0;
//		int[] result = new int[r];
//		boolean lineRank = false;
//		
//		for (int i = c - 2; i > 0; i--) {
//			for (int j = 0; j < r; j++) {
//				if (arr[j][i] != '.' ) {
//					int number = Integer.parseInt(String.valueOf(arr[j][i]));
//					if (goalin[number] == false) {
//						goalin[number] = true;
//						if (lineRank) {
//							result[number] = rank;
//						} else {
//							lineRank = true;
//							result[number] = ++rank;
//						}
//						
//					}
//				}	
//			}
//			lineRank = false;
//		}
//		
//		
//		for (int i = 1; i < result.length; i++) {
//			System.out.println(result[i]);
//		}
//		
//		
//		sc.close();
//	}
//
//}

import java.io.*;
import java.util.StringTokenizer;

public class B2990 {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stoi = new StringTokenizer(read.readLine());
        int R = Integer.parseInt(stoi.nextToken());
        int C = Integer.parseInt(stoi.nextToken());

        char[][] map = new char[R][C];
        for(int i = 0; i < R; i++) {
            String str = read.readLine();
            for(int j = 0; j < C; j++) {
                map[i][j] = str.charAt(j);
            }
        }

        int g = 1;
        int[] grade = new int[10];
        for(int j = C - 2; j > 0; j--) {
            boolean fix = false;
            for(int i = 0; i < R; i++) {
                if(map[i][j] != '.') {
                    // 첫 순위를 저장
                    int team = (int) map[i][j] - 48;
                    if(grade[team] == 0) {
                        grade[team] = g;
                        fix = true;
                    }
                }
            }

            if(fix) g++; 
        }

        for(int i = 1; i <= 9; i++) {
            System.out.println(grade[i]);
        }
    }
}
