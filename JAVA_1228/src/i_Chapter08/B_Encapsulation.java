package i_Chapter08;

//! 캡슐화
// : 객체 지향 프로그램에서 데이트와 해당 데이터를 처리하는 함수를 하나로 묶는것
// - 객체 내부의 구현을 숨기고 외부에서는 제공된 메서드를 통해서만 접근할 수 있도록 하는것을 목적으로 함
// - 데이터 보호, 유지보수성 향상, 사용의 편의성 증대

// getter & setter 메서드
// - 캡슐화된 데이터에 안전하게 접근하고 수정할 수 있도록 하는 기능
// getter
// : 객체의 특정 필드 값을 읽을 수 있게 해주는 메서드
// setter
// : 객체의 특정 필드 값을 설정할 수 있게 해주는 메서드

class Student {
	// private 접근 제어
	private String name;
	private int age;
	
	// score(점수) 필드를 선언 - private
	private int score;
	// : 해당 필드에 대한 getter, setter 구현
	// score 점수에 접근하기 위한 getter 메서드
	public int getScore() {return score;}
	
	public void setScore(int score) {
		// : 점수 값을 설정할 때는 0점보다 크고 100점 보다 작은지 확인하는 검사 코드 추가
		if (score >= 0 && score <=100) {
			this.score = score;
		} else {
			// : 유효하지 않은 점수일 경우 : "유효하지 않은 점수입니다." 출력
			System.out.println("유효하지 않은 점수입니다.");
		}
	}
	
	// getter & setter
	// - 캡슐화되어 있는 데이터 접근
	// 메서드 형식을 get변수 & set변수로 지정하는 것을 권장
	// - 해당 메서드의 구현목적에 대한 설명
	public String getName() {
		// private 선언이 되어 있는 name변수는 반드시 getName 메서드를 통해서만 외부 클래스 또는 외부 패키지에서 접근이 가능
		return name;
	}
	public void setName(String name) {this.name = name;}
	
	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}
}

public class B_Encapsulation {
	public static void main(String[] args) {
		Student student1 = new Student();
//		student.name = "이승아"; - Error
		
//		setter를 통한 데이터 수정
		student1.setName("이승아");
		student1.setAge(28);
//		socre 필드를 설정하고 접근하는 예시
		student1.setScore(85);
		
//		getter를 통한 데이터 접근
		System.out.println(student1.getName());
		System.out.println(student1.getAge());
		System.out.println(student1.getScore());
		
		student1.setScore(-10); // 유효하지 않은 점수입니다.
		student1.getScore();
		
	}

}