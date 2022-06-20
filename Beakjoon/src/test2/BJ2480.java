package test2;

import java.util.Scanner;

/**
 * 
 * 백준 조건문
 * 2480번
 * 주사위 세개
 * 
 */

public class BJ2480 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int result = 0;
		
		if (a == b && b == c) {
			result = a * 1000 + 10000;
		} else if (a == b) {
			result = a * 100 + 1000;
		} else if (a == c) {
			result = a * 100 + 1000;
		} else if (b == c) {
			result = b * 100 + 1000;
		} else if (a != b && b != c) {
			if (a > b && a > c) {
				result = a * 100;
			} else if (b > a && b > c) {
				result = b * 100;
			} else if (c > a && c > b) {
				result = c * 100;
			}
		}
		
		System.out.println(result);
		
	}
}
