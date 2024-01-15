package g_Chapter06;

// 음식점 클래스
// : 다양한 방법으로 주문을 받는 예시

// 주문 메서드(placeOrder)
// : 메뉴 이름만 제공
// : 메뉴 이름과 수량 제공
// : 메뉴 이름과 특별 요청 사항 제공
// : 메뉴 이름과 수량과 특별 요청 사항 제공
class Restaurant{
	
	// 자리 번호와 기본 주문 메서드 (메뉴 이름)
	void placeOrder (int number, String dish) {
		System.out.println(number + dish);
	}
	
	// 자리 번호와 메뉴 이름과 수량 제공 메서드
	void placeOrder (int number, String dish, int quantity) {
		System.out.println(number + dish + "+" + quantity);
	}
	// 자리 번호와 메뉴 이름과 특별 요청 사항 제공
	void placeOrder (int number, String dish, String specialRequests) {
		System.out.println(number + dish + "+" + specialRequests);
	}
	// 자리 번호와 메뉴 이름과 수량과 특별 요청 사항 제공
	void placeOrder (int number, String dish, int quantity, String specialRequests) {
		System.out.println(number + dish + "+" + quantity + "+"+ specialRequests);
	}
}

public class Overloading02 {

	public static void main(String[] args) {
		// 1번 테이블 (피자)
		Restaurant order1 = new Restaurant();
		order1.placeOrder(1, "pizza");
		
		// 3번 테이블 (햄버거 2개)
		Restaurant order2 = new Restaurant();
		order2.placeOrder(3, "buger", 2);
		
		// 1번 테이블 추가 주문 (파스타, 치즈 많이)
		order1.placeOrder(1, "pasta", "Extra Cheese");
		
		// 2번 테이블 (샐러드 3개, 드레싱 없이)
		Restaurant order3 = new Restaurant();
		order3.placeOrder(2, "Salad", 3, "No dressing");
		
	}

}
