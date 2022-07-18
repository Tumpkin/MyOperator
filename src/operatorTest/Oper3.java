package operatorTest;

import java.util.Scanner;

public class Oper3 {

	public static void main(String[] args) {
		// 사용자에게 키를 입력받고, 정수라면 정수로 출력
		// 실수라면 실수로 출력
		// 예) 183 -> 183 출력
		// 183.5 -> 183.5 출력
		// 삼항 연산자를 사용한다.

		// 정수인지 실수인지 : 전체에서 진수부를 뻈을 때 0인지 아닌지 검사
		// 3.5 - 3 = 0.5 -> 실수
		// 3.0 - 3 = 0.0 -> 정수
		Scanner sc = new Scanner(System.in);

		// key입력 받고 key,result 초기화
		String key = sc.next(), result = "";

		// 입력받은 키를 실수와 정수로 형변환
		double keyS = Double.parseDouble(key);
		int keyJ = (int) keyS;

		// tybe 초기화
		boolean tybe = false;

		// 정수인지 실수인지 판단
		keyS = keyS - keyJ; // 실수 -정수
		tybe = 0 < keyS; // 0이 keyS보다 작니?
		result = tybe ? key : "" + keyJ;

		// 결과
		System.out.println(result);

		//------------------------------
		
		  double height = 0.0;
	      boolean check = false;
	      String message = "키 : ", format = null;
	      char newLine = '\n';
	      
	      System.out.print(message);
	      height = sc.nextDouble();
	      
	      check = height - (int)height == 0;
	      
//	      System.out.println(check ? (int)height : height);
	      format = check ? "%.0fcm%c" : "%.2fcm%c";
	      System.out.printf(format, height, newLine);

		
	}

}
