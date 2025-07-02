package controlCode2;

// 134p : 예제5-4번 이등변 역삼각형 만들기
public class Triangle {
	public static void main(String[] args) {

		for(int i = 0; i < 7; i++) {
			for(int j = 6; j <= 6 - i; j--) { // 0-1-2-3-4-5-6 칸 순서로 공백
				System.out.print(" ");
			}
			for(int k = 0; k <= 2*i+1; i++) { // 13 - 11 - 9 - 7 - 5 - 3 - 1 순서로 * 출력
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
