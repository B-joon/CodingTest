package test2;

import java.util.Scanner;

/**
 * 
 * 백준 조건문
 * 2753번
 * 윤년
 * 
 */

public class BJ2753 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		
	}
}
