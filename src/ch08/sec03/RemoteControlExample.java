package ch08.sec03;
//상수는 인터페이스 소속 멤버이므로 인터페이스로 바로 접근해 상수값을 읽을수 있음

public class RemoteControlExample {
	public static void main(String[] args) {
		System.out.println("리모콘 최대 볼륨: "+RemoteControl.MAX_VOLUME);
		System.out.println("리모콘 최저 볼륨: "+RemoteControl.MIN_VOLUME);
	}

}
