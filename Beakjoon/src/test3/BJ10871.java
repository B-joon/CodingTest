package test3;

import java.util.Scanner;

/**
 * 
 * 백준 조건문
 * 10871번
 * X보다 작은 수
 * 
 */

public class BJ10871 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			if (arr[i] < x) {
				System.out.print(arr[i] + " ");
			}
		}
		
	}
}
