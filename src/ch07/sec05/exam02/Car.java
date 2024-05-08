package ch07.sec05.exam02;
//final 메소드는 자식 클래스에서 재 정의가 불가능하다, 오버라이딩 불가능
public class Car {
	//필드 선언
	public int speed;
	
	//메소드 선언
	public void speedUp() {
		speed += 1;
	}
	
	//final 메소드
	public final void stop() {
		System.out.println("차를멈춤");
		speed = 0;
	}
}
