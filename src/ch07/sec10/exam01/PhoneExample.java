package ch07.sec10.exam01;

public class PhoneExample {

	public static void main(String[] args) {
		// Phone phone = new Phone(); //x
		SmartPhone smartphone = new SmartPhone("홍길동");
		
		SmartPhone.turnOn();
		SmartPhone.internetSearch();
		SmartPhone.turnOff();
	}

}
