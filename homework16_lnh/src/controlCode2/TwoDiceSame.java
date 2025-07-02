package controlCode2;

// 143p 4번 : 두 개의 주사위가 같은 값이 나올 때까지 반복
public class TwoDiceSame {

	public static void main(String[] args) {
		// while문을 사용해서 반복하고, 반복 횟수와 주사위 눈의 번호를 출력하기

		int[] dice_A = new int[] { 1, 2, 3, 4, 5, 6 };
		int[] dice_B = new int[] { 5, 3, 6, 4, 2, 1 };

		// 반복횟수를 담은 변수와 주사위 눈의 번호
		int num = 0; // 주사위 눈 번호를 담을 변수
		int count = 0; // 반복횟수
		while (count < 6) {
			 if(dice_A[count] == dice_B[count]) {
				 num = count + 1;
				 count++;
				 break;
			 }
			 else {
				 count++;
				 continue;
			 }
			 
		}
		System.out.println("두 주사위가 같은 값이 나온 번호 : " + num + ", 반복 횟수 : " + count);

	}
}
