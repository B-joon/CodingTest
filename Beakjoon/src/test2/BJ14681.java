package test2;

import java.util.Scanner;

/**
 * 
 * 백준 조건문
 * 14681번
 * 사분면 고르기
 * 
 */

public class BJ14681 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if (x > 0) {
			if (y > 0) {
				System.out.println(1);
			} else if (y < 0) {
				System.out.println(4);
			}
		} else if (x < 0) {
			if (y > 0) {
				System.out.println(2);
			} else if (y < 0) {
				System.out.println(3);
			}
		}
		
	}
}
