package ch08.sec02;

public class RemoteControlExample {
	public static void main(String[] args) {
		/*텔리비젼클래스
		RemoteControl rc;
		rc = new Television();
		//RemoteControl rc = new Television() 가능함
		rc.turnOn();
		 */
		RemoteControl rc;
		
		//rc 변수에 Television 객체를 대입
		rc = new Television();
		rc.turnOn();
		
		//rc 변수에 Audio 객체를 대입(교체시킴)
		rc = new Audio();
		rc.turnOn();
	}
}
