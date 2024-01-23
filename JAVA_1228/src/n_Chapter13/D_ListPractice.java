package n_Chapter13;

import java.util.ArrayList;
import java.util.LinkedList;

// 이벤트 관리 시스템

// 이벤트 참가자 명단 관리*
// : 사전에 등록, 이벤트 당일에는 춫가적인 참가자 등록이 없음
// >> ArrayList (등록 추가, 삭제 X / 참가자 조회 빠름)

// 대기열 관리*
// : 이벤트에는 한정된 좌석만 존재. 좌석이 모두 차면 추가로 도착하는 참가자들은 대기열에 등록
// : 위의 이벤트 참가자들이 퇴장하는 경우 입장이 가능
// >> LinkedList (등록, 추가, 삭제가 빈번함 / 참가자 조회 X)

// 참가자 조회
// : 이벤트 진행 중에 특정 참가자가 참석했는지 확인 점검

class EventManagement {
	ArrayList<String> participantList = new ArrayList<String>();
	LinkedList<String> waitingQueue = new LinkedList<String>();

	// 참가자 명단에 참가자 추가
	void addParticipant(String name) {
		participantList.add(name);
	}
	
	void addWaitingQueue(String name) {
		waitingQueue.add(name);
	}
	
	// 참가자가 이벤트를 떠날때
	void leaveParticipant(String name) {
		
	}
	
	// 특정 참가자 조회
	boolean checkParticipant (String name) {
		return participantList.contains(name);
	}
}

public class D_ListPractice {
	public static void main(String[] args) {
		
	}
}
