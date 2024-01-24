package n_Chapter13;

import java.util.HashMap;
import java.util.Map;

//! Map 인터페이스
// : 키(key)와 값(value)의 쌍으로 요소를 저장하는 데이터 구조
// : 키(key)는 고유한 데이터, 하나의 값을 가르킴

//! 주요 특징
// - 키의 유일성 : 모든 키는 고유해야 함 / 각 키는 하나의 값에만 매핑됨
// - 값의 중복 허용 : 값은 중복이 가능
// - 순서는 : 대부분의 Map 구현체는 순서 보장 X / 예외) LinkedHashMap은 예외

//!. 구현체
// 1.HashMap
// : 해시 테이블을 사용하여 키-값 쌍을 저장
// : 순서를 유지X(삽입 순서나 요소의 정렬 상태를 보장하지 않음) >> 작업 시간 빠름
// : null 허용(키와 값 모드 null 허용)

// 2. LinkedHashMap
// : 삽입 순서를 유지
// : 요소의 삽입 순서가 중요하고 빠른 검색이 필요할 때 주로 사용

// 3. TreeMap
// : 키-값 쌍을 트리에 저장, 키에 따라 정렬되어 저장
// : 키에 null값 허용 X (값에는 null값 가능)

public class F_Map {
	public static void main(String[] args) {
		
		//! Map인터페이스 메서드
		// put(K Key, V Value) : 키와 값을 Map에 추가
		// get(Object key) : 지정된 키에 매핑된 '값'을 반환
		// remove(Object key) : 주어진 키와 연관딘 키-값 쌍 삭제(반환)
		// containsKey(object key) : 주어진 키가 Map에 있는지 확인하여 boolean으로 반환
		// keySet() : Map의 키 Set을 반환
		// values() : Map의 값 컬렉션을 반환
		// entrySet() : Map의 키-값 쌍을 나타내는 Set을 반환
		
		//! Map 컬렉션 선언 방법
		// Map<키타입, 값타입> 인스턴스명 = new HashMap<키타입, 값타입>();
		
		// 래퍼클래스(Wrapper Class)
		// : 기본테이터 타입을 객체로 다루기 위해 사용
		// : 컬럭션 프레임워크는 객체를 저장하기 때문에 래퍼클래스를 사용
		// String : 문자열을 담는 클래스 타입
		// Integer : 숫자를 담는 클래스 타입
		Map<String, Integer> student = new HashMap<String, Integer>();
		
		// 값 추가
		// 이름(String) - 키, 나이(Integer) - 나이
		student.put("SeungAh", 28);
		student.put("DoKyung", 30);
		student.put("JuHeon", 32);
		
		// 값 가져오기
		System.out.println(student.get("DoKyung")); // 30
		
		// 값 제거
		student.remove("SeungAh");
		System.out.println(student); // {DoKyung=30, JuHeon=32}
		
		// 키를 통한 값을 검사
		System.out.println(student.containsKey("JuHeon")); // true
		
		// 키-값 쌍의 수를 반환
		System.out.println(student.size()); // 2
	}

}
