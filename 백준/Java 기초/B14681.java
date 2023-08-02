package JavaBasic;

import java.util.Scanner;

public class B14681 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(), b = sc.nextInt();
        
        
        int space = (a > 0) ? ((b > 0) ? 1 : 4) : ((b > 0) ? 2 : 3);
//        
//        if (a > 0) {
//        	if (b > 0) {
//        		space = 1;
//        	} else {
//        		space = 4;
//        	}
//        } else {
//        	if (b < 0) {
//        		space = 2;
//        	} else {
//        		space = 3;
//        	}
//        }
        
        System.out.println(space);
        sc.close();
	}
}

