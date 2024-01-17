package parentsPackage;

// import 패키지명.클래스명;(같은 패키지의 다른 클래스도 가능)
import i_Chapter08.AccessExample;


public class OtherClass {
	public static void main(String[] args) {
		// 외부 패키지의 클래스를 사용한 객체 인스턴스화
		AccessExample example = new AccessExample(); // public
		System.out.println(example.publicVar);
//		System.out.println(example.protectedVar);  - Error(The field AccessExample.privateVar is not visible)
//		System.out.println(example.defaultVar); - Error(The field AccessExample.privateVar is not visible)
//		System.out.println(example.privateVar); - Error(The field AccessExample.privateVar is not visible)
		
		// public 메서드를 통해 AccessExample 내의 제한된 변수에 접근 가능
		example.showAccess();
//		example.showProtected(); - Error(The field AccessExample.privateVar is not visible)
//		example.showDefault(); - Error(The field AccessExample.privateVar is not visible)
//		example.showPrivate(); - Error(The field AccessExample.privateVar is not visible)

		
	}
}
