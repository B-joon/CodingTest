package test2;

import java.util.Scanner;

/**
 * 
 * 백준 조건문
 * 2884번
 * 알람 시계
 * 
 */

public class BJ2884 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		int subM = m - 45;
		
		if (0 <= h && h <= 23 && 0 <= m && m <= 59) {
			if (subM < 0) {
				h = h - 1;
				subM += 60;
				if (h < 0) {
					h += 24;
				}
			}
		}
		System.out.println(h + " " + subM);
	}
}
