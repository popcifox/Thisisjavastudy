package ch11.sec06;

public class InsufficientException extends Exception{ //일반예외로 선언
	public InsufficientException() {
	}
	//두개의 생성자 선언
	public InsufficientException(String message) {
		super(message);
	}
}
