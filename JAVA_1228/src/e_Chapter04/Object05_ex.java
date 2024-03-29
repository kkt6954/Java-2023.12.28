package e_Chapter04;

// 게임 캐릭터 클래스(GameCharacter)
class GameCharacter {
// 이름(name), 레벨(level), 힘(Strength) 속성
// 캐릭터의 정보를 출력(displayInfo) 메서드
// - "Name : " + name + " Level : " + level + "Strength : " + strength
	String name;
	int level;
	int strength;
	
	void displayInfo() {
		System.out.println("Name : " + name + ", " + " Level : " + level + ", "+ "Strength : " + strength );
	}
	
	GameCharacter(String name, int level, int strength){
		this.name = name;
		this.level = level;
		this.strength = strength;
	}
	

// 생성자 - 각 필드의 데이터를 초기화

}
public class Object05_ex {

	public static void main(String[] args) {
		// 캐릭터 객체 생성
		// "Warrior", 10, 100 초기화
		GameCharacter gameCharacter = new GameCharacter("Warrior", 10, 100);
		
		gameCharacter.displayInfo();
		
		// 캐릭터 정보 출력

	}

}
