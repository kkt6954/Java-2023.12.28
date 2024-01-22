package m_Chapter12;

public class A_Exception {

	public static void main(String[] args)  {
//		System.out.println();
		
		// 1. 체크 예외
		// : 개발자가 예외를 처리해야만 하는 예외
		// : 컴파이러가 예외 처리 코드가 있는지 확인하고, 처리하지 않은 경우 예외 발생
		
		// 2. 언체크 예외
		// : 컴파일러가 강제로 예외 처리를 확인하지 않은 예외
		// : 처리를 선택적으로 진행
		
		//! try-catch블록
		// 기본형태
//		try {
//			// 예외가 발생할 수 있는 코드	
//		} catch (ExceptionType e){
//			// 예외가 발생했을 때 실행할 코드
//		} catch (ExceptionTyep e2){
//		} 	// 예외2가 발생했을 때 실행할 코드
		
		// try 블록 : 예외가 발생할 수 있는 코드를 포함
		// catch 블록 : 특정 예외 타입이 발생했을 때 실행될 코드르 정의
			// 다중 catch 블록으로 사용 가능 (여러 예외 처리) 
		
		try {
			int division = 10 / 0;
			} catch (ArithmeticException e) { 
				System.out.println("0으로 나눌 수 없습니다.");
				}
		
		try {
			int division = 10 / 0;
			} catch (Exception e) { 
				System.out.println("0으로 나눌 수 없습니다.");
				}
		
		try {
			String text = null; // null의 계산은 예외 - NullPointerException 발생 
			System.out.println(text.length());
			int division = 10 / 0; // 정수를 0으로 나눌 수 없음 - ArithmeticException 발생
		} catch (NullPointerException e) {
			System.out.println("null 참조 발생");
			} catch (ArithmeticException e){
				System.out.println("산술적 예외 발생");
				}
		
		// finally 블럭
		// : try-catch 구조의 일부(선택사항)
		// : 예외 발생 여부와 관계없이 항상 실행되는 코드 블록
		try {
		int[] numbers = new int[5];
		numbers[10] = 50; // - Error ArrayIndexOutOfBoundsException 발생
		} catch (ArrayIndexOutOfBoundsException e) {
		 System.out.println("배열 인덱스 초과 오류 발생");
		} finally {
			System.out.println("finally 블록 실행");
		}
		try {
		int[] numbers = new int[5];
		numbers[1] = 50;
		} catch (ArrayIndexOutOfBoundsException e) {
		 System.out.println("배열 인덱스 초과 오류 발생");
		} finally {
			System.out.println("finally 블록 실행");
		} // 오류 여부 상관 없이 finally 실행
		
		// throw 블록
		// : 예외를 직접 발생 시키는데 사용
		// : 특정 조건에서 예뢰를 발생시키고 싶을때 사용 가능
		// : 주로 조건문과 같이 사용
		// 예) 나이에 음수 X - 나이값에 음수가 담기는 경우 예외 발생
		
		// 기본 형태
		// throw new 예외타입("예외처리구문");
		int age = -10;
		
		// 예외 발생
		// age 값이 0 미만일 경우 예외 발생
		// : 발생하는 예외를 사용자 정의로 처리함
		// : 잘못된 값을 지정해도 나머지 실행 로직에 방해되지 X
		try {
		if ( age < 0 ) {
//			throw new ExceptionType("Exception Message");
			throw new Exception("나이는 음수가 될 수 없습니다."); // Unhandled exception type Exception
			}
		} catch (Exception e) {	System.out.println("양수를 입력 해주세요"); }
		
		System.out.println("반드시 실행해야할 코드");
	}

}