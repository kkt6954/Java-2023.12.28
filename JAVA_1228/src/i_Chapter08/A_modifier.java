package i_Chapter08;
// 자바 패키지 또는 클래스 파일간의 코드 연결을 위해서는 
// immport문을 사용하여 클래스 파일명을 명시해야한다.
// 같은 패키지 내 : import 클래스명;
// 다른 패키지 : import 패키지명.클래스파일명(클래스가 존재하는 파일명);
import parentsPackage.ParentsClass;


//! 접근 제어자

// 1. 정의 
// : 클래스, 메서드, 변수의 접근 범위를 제어

// 2. 종류
// : private, default, protected, public
// : 클래스나 멤버 변수, 메서드, 생성자에 접근 제어자가 저장되어 있지 않은 경우 default(기본값)으로 지정

// 3. 범위
// public > protected > (default) > private
// private : 같은 클래스 내에서만 접근가능
// protected : 같은 패키지 내에서, 그리고 다른 패키지의 자손 클래스에서 접근이 가능
// (default) : 같은 패키지 내에서만 접근이 가능
// public : 접근 제한이 전혀 없이 접근 가능

// 1. private
class PrivateCalss {
	// 같은 클래스 내에서만 접근 가능한 private 멤버 변수
	private int myField;
	private void myMethod() {}
}
// 2. default(생략 가능해서 생략)
// : 같은 패키지 내라면 중북 X
// : 패키지 외부에서는 접근 X
class DefaultClass{
	// 같은 패키지 내의 다른 클래스들이 접근 가능
	int myField;
	void myMethod() {}
}

// 3. protected
// : 동일한 패키지 내의 모든 클래스와 다른 패키지의 하위 클래스에서 접근 가능
class ProtectedClass extends ParentsClass {
	protected int myField;
	
	// 메서드 호출은 항상 실행 메서드 내에서 작성되어야 한다.
	// : 클래스 본문 안에서 직접 실행 코드(출력, 메서드 호출) 지정 X
	// : 메서드 내에서 실행코드 작성
	public ProtectedClass() {
		// 생성자에서 부모 클래스 protected 필드의 메서드에 접근
		// 부모 클래스의 public 필드에 접근
		System.out.println(protectedField);
		
		// 부모 클래스의 private 필드에 접근
		protectedMethod();
	}
	
	
	protected void myMethod() {}
}

// 4. public(예시 parentsPackage)
// : 어떤 클래스든 어떤 패키지 내에 있든 접근 가능



class ChildClass extends PrivateCalss {
	void childMethod() {
//						 부모 클래스의 myField변수가 private 설정이 되어있어 해당 클래스 외부에서는 접근 불가
//		super.myField; - Error
	}
}
public class A_modifier {

	public static void main(String[] args) {
		

	}

}
