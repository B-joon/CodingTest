package test2;

import java.util.Scanner;

/**
 * 
 * 백준 조건문
 * 2525번
 * 오븐 시계
 * 
 */

public class BJ2525 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int min = sc.nextInt();
		
		int selectTime = sc.nextInt();
		
		int sumTime = min + selectTime + hour * 60;
		
		hour = sumTime / 60;
		sumTime %= 60;
		
		if (hour > 23) {
			hour -= 24;
		}
		
		System.out.println(hour + " " + sumTime);
	}
}
