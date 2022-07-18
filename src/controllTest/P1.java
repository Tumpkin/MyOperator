package controllTest;

public class P1 {

	public static void main(String[] args) {
		int cnt = 0;
		for (int i = 0; i < 4; i++) {
			if (cnt == 3) {
				i = 4;
			} else {
				System.out.print(i + " ");
			}
			if (i == 3) {
				i = -1;
				cnt++;
			}
		}
		System.out.println();
		// 나머지 연산자 사용
		// a % n -> 0 ~ n-1
		for (int i = 0; i < 12; i++) {
			System.out.print(i % 4 + " ");
		}
		System.out.println();

		// aBcDeFgHiJ...Z 출력
		int cnt1 = 0;
		for (int i = 97; i <= 122; i++) {
			if (cnt1 == 0) {
				System.out.print((char) i+" ");
				cnt1++;
			} else {
				System.out.print((char) (i - 32)+" ");
				cnt1 = 0;
			}
		}
	}
}