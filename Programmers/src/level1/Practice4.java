package level1;

// 핸드폰 번호 가리기

public class Practice4 {
	
	public static void main(String[] args) {
		
		String phone_number = "01033334444";
		
		System.out.println(solution(phone_number));
		
	}
	
	public static String solution(String phone_number) {
		String answer = "";
		String sumStar;
		String[] a = new String[phone_number.length()];
		
		for (int i = 0; i < phone_number.length() - 4; i++) {
			sumStar = phone_number.valueOf(phone_number.charAt(i));
			a[i] = sumStar.replace(sumStar, "*");
			answer += a[i];
		}
		
		answer += phone_number.substring(phone_number.length() - 4);
		
		return answer;
	}
	
}
