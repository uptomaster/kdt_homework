package controlCode2;

// p.143 - 5번 : 다중 반복문을 사용해서 * 출력하기
public class PrintStar01 {

	public static void main(String[] args) {

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3 - i; j++) { // 3 -> 2 -> 1 -> 0
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) { // 1 -> 2 -> 3 -> 4
				System.out.print("* ");
			}
			System.out.println();

		}

	}
}

//   *
//  * *
// * * *
//* * * *  
