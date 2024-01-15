package g_Chapter06;

// BaseballPlayer 클래스
// : 선수의 이름(name), 타율(battingAverage), 홈런수(HomeRuns)
// : 이름 - 문자열, 타율 - 실수, - 홈런수 - 정수

// : 생성된 선수의 총 수(playerCount) - 모든 인스턴스에서 공유

// 생성자 - this.
// : 생성시 선수의 이름, 타율, 홈런 수를 받아서 인스턴수 변수 초기환
// : 생성시 정적 변수를 후위 증가(변수명++)

// 메서드
// : updateStats : 선수의 타율과 홈런 수를 업데이트하는 메서드
// : 매게변수로 newBattingAverage, newHomeRuns를 입력
// : 타율 업데이트, 홈런 수 업데이트 (기존의 인스턴스 변수에 재할당)
class BaseballPlayer {
	private String name;
	private double battingAverage;
	private int homeRuns;
	
	private static int playerCount = 0;
	
	public BaseballPlayer(String name, double battingAverage, int homeRuns) {
		this.name = name;
		this.battingAverage = battingAverage;
		this.homeRuns = homeRuns;
		playerCount++;
	}
	public void updateStats(double newBattingAverage, int newHomeRuns) {
		battingAverage = newBattingAverage;
		homeRuns = newHomeRuns;
	}
}
public class MethodPractice {
	public static void main(String[] args) {
		// BaseballPlayer 클래스를 야구선수 3명의 객체 생성
		// 총 생성된 선수의 수를 출력
		BaseballPlayer player1 = new BaseballPlayer("Hoo", 0.325, 20);
		BaseballPlayer player2 = new BaseballPlayer("Ryu", 0.275, 15);
		BaseballPlayer player3 = new BaseballPlayer("Kim", 0.375, 19);

		System.out.println("총 생성된 선수의 수: " + playerCount);
	}
}

