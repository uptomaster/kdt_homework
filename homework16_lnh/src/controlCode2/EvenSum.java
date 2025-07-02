package controlCode2;

// 143p - 3번 : 1부터 100까지 정수 중에서 짝수만을 더해 출력
public class EvenSum {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 2; i <= 100; i+=2) {
			sum += i;
		}
		System.out.println("짝수의 합 : " + sum);
	}


}
