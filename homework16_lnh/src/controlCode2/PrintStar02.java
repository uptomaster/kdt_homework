package controlCode2;
// 143p - 6번 문제
public class PrintStar02 {
	public static void main(String[] args) {

		for(int i = 0; i <= 6; i+=2) {
			for(int j = 0; j < 6 - i; j++) {
				System.out.print(" "); // 공백 : 6 -> 4 -> 2 -> 0
			}
			for(int k = 0; k <= i; k++) { // 1 -> 3 -> 5 -> 7
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
