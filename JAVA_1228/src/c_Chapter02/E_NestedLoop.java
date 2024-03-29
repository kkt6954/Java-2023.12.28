package c_Chapter02;


// 중첩된 반복문(nested loop)

// 중첩 루프
// : 반복문 안에 또 다른 반복문이 있는 구조
// : 각 반복마다 내부 루프가 전체를 완전히 반복
public class E_NestedLoop {

	public static void main(String[] args) {
		// 기본 구조
//		for (초기화1; 조건1; 증감1) {
//			for(초기화2; 조건2; 증감2) {
//				// 중첩 루프 내부의 명령문
//			}
//			//외부 루프 내부의 명령문
//		}
		
		// 중첩 루프 예제
		// : 5 * 5 별 찍기
		
		// 외부 루프는 : 0부터 4까지 반복(5번)

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 중첩 for문을 사용하여 구구단 출력
		// 2단부터 9단까지 반복
		for (int i = 2; i <= 9; i++) {
//			각 단마다 1 ~ 9 까지를 반복하여 곱셈식을 작성
			for(int j = 1; j <=9; j++) {
				System.out.println(i + "X" + j + "=" + (i * j));
			}
			System.out.println();
		}
		
		
		// 중첩 for문을 사용하여
		// *
		// **
		// ***
		// ****
		// *****
		
//		전체 행의 반복으로 5번 반복
		for (int i = 1; i <= 5; i++ ) {
//			별의 개수가 1 - 5까지 증가
//			첫 번쨰 줄에 1개
//			두 번쨰 줄에 2개
//			...
//			다석 번째 줄에 5개
			for (int j = 1; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		// 1. 별 찍기 연습 문제
		// *
		// **
		// ***
		// ****
		// *****
		for (int i = 0; i < 5; i++) {
			for (int j = i; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 2. 
		//   *
		//  ***
		// *****
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 2*i -1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
