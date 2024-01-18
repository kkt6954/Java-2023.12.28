package k_Chapter10;

interface Flyable {
	int MAX_SPEED = 100; // public static final 생략
	void fly(); // public abstract 생략
	
	// 디폴트 메서드
	default void land() { System.out.println("Landing"); }
	// 정적 메서드
	static int getWingCount() { return 2; }
}
class Bird implements Flyable {
	// 인터페이스에 정의된 상수 사용 가능
	public void fly() { System.out.println("Bird is flying at speed" + MAX_SPEED); }
	@Override
	public void land() { System.out.println("...landing..."); }
}


public class C_Interface02 {
	public static void main(String[] args) {
		Bird bird = new Bird();
		
		// 구현 메서드
		bird.fly();
		// 디폴트 메서드
		bird.land(); // 재정의 가능
		// 정적 메서드 : 인터페이스 이름으로 직접 호츨
		System.out.println(Flyable.getWingCount());	
	}

}
