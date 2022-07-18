package controllTest;

import java.util.Scanner;

public class ForTask {
	public static void main(String[] args) {
		// 브론즈
		// 1~100까지 출력
//		for (int i = 1; i <= 100; i++) {
//			System.out.println(i);
//		}
//
////		// 100~1까지 출력
//		for (int i = 0; i < 100; i++) {
//			System.out.println(100 - i);
//		}
//
////		// 1~100까지 중 짝수 만 출력
//		for (int i = 2; i <= 100; i += 2) {
//			System.out.println(i);
//		}
//
//		// 최소한의 방법
//		for (int i = 0; i < 50; i++) {
//			System.out.println((i+1)*2);
//		}
		
//		// 실버
//		int sum = 0;
//		// 1~10까지 합 출력
//		for (int i = 1; i <= 10; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
//
////		// 1~n까지 합 출력
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		for (int i = 0; i <= n; i++) {
//			sum += i;
//		}
//		System.out.println(sum);

//		// 골드
//		// A~F까지 출력
//		for (int i = 65; i < 71; i++) {
//			System.out.println((char) i);
//		}
//
////		// A~F까지 중 C제외하고 출력
//		for (int i = 65; i < 71; i++) {
//			if (67 != i) {
//				System.out.println((char) i);
//			}
//		}

		// 다이아
		// 0 1 2 3 0 1 2 3 0 1 2 3 출력
		int cnt = 0;
		for (int i = 0; i < 4; i++) {
			if (cnt == 3) {
				i = 4;
			}else {
			System.out.print(i+" ");
			}
			if (i == 3) {
				i = -1;
				cnt++;
			}
		}
		// a % n -> 0 ~ n-1
		for (int i = 0; i < 12; i++) {
			System.out.println(i%4);
		}

		// aBcDeFgHiJ...Z 출력
		int cnt1 = 0;
		for (int i = 97; i <= 122; i++) {
			if (cnt1 == 0) {
				System.out.println((char) i);
				cnt1++;
			} else {
				System.out.println((char)( i - 32));
				cnt1 = 0;
			}
		}
	}
}
