package b_chapter01;

// 자바 형 변환(타입 변환)
// : 하나의 타입을 다른 타입으로 바꾸는 것

// 자료형의 크기에 따른 형 변환 규칙
// 정수 타입 : byte(1) < short(2) < int(4) < long(8)
// 문자형 : char(2)
// 실수형 : float(4) < double(8)
// byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)
// : 메모리 설계 상 정수 타입보다 실수 타입이 더 크다.

public class C_TypeConversion {

	public static void main(String[] args) {
		
		// 1. 강제 형 변환(명시적)
		// : 크기가 작은 자료형으로의 변환 
		byte small_bowl = 10; // 작은 그릇
		int big_bowl = 10000; // 큰 그릇
		
		byte a = 32; // 1 byte 자료형
		short b = a; // 1 byte 자료형에 저장된 값을 2byte로 변환
		int c = b;
		long d = c;
		
//		작은 범위의 타입을 큰 타입으로 넣을때는
//		자동으로 형 변환을 컴파일러가 수행
		big_bowl = small_bowl;
		
		// 2. 자동 형 변환(묵시적)
		// : 크기가 큰 자료형으로의 변환
		int number = 1234;
		float float_number = number ; // int 보다 float 이 더 크다.
		
		float flo_number = 3.14F;
//		float 이 int 보다 크기 때문에 자동 형 변환 불가 (값 손실 발생)
//		int int_number = flo_number; - Error
		
//		명시적 형 변환: (작은변환자료형)큰데이터값;
		int int_number = (int)flo_number;
		
		int num = 60000;
		byte value = (byte)num;
		
		double dbNum = 12.3456;
		int intNum = (int)dbNum;
		// 실수로 정수로 강제 타입 변환시 소수점 이하의 데이터가 버려짐
		System.out.println(intNum);
		
//		char 자료형의 형 변환
//		: char 자료형의 경우 
//		 한 개의 문자 값에 대한 자료형
//		 문자값을 작은 따옴표로 감싸는 형태
		
//		: char 문자값을 표현하는 방식
//			- 일반 문자값 사용, 아스키코드값, 유니코드값
		
		char a1 = 'a'; // 문자값
		char a2 = 97; // 아스키코드값
		char a3 = '\u0061'; // 유니코드값
		char a4 = 98;
		char a5 = '\u0062';
		char a6 = 96;
		
		int i1 = 97;
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);
		System.out.println(a6);
		
		System.out.println(i1);
		
//		byte 자료형을 char 자료형으로 변환(byte에서 char)
//		: char 자료형에는 음수 표현식이 없음 ( 0 ~65535)
//		: byte 의 음수자료형에 대한 요류를 방지하기 위해 변환 불가
		byte byte_type  = 10;
//		char char_type = byte_type; - Error
		
//		Short 자료형으로는 변환이 가능 (-32768 ~ 32767)(Short에서 char)

	}

}
