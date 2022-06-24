package level1;

import java.util.Arrays;

// 제일 작은 수 제거하기

public class Practice8 {

	public static void main(String[] args) {
		
		int[] arr = {4,3,2,1};
		System.out.println(Arrays.toString(solution(arr)));
		
		int[] arr2 = {10};
		System.out.println(Arrays.toString(solution(arr2)));
		
	}
	
	public static int[] solution(int[] arr) {
		int[] answer = {};
		
		if (arr.length == 1) {
			answer = new int[1];
			if (arr[0] == 10) {
				answer[0] = -1;
				return answer;
			}
			answer[0] = arr[0];
			return answer;
		}
		
		int min = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		
		int index = 0;
		answer = new int[arr.length - 1];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != min) {
				answer[index] = arr[i];
				index++;
			}
		}
		
		return answer;
	}
	
}
