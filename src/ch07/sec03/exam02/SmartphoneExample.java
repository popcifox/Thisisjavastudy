package ch07.sec03.exam02;

public class SmartphoneExample {

	public static void main(String[] args) {
		// Smartphone 샛체 생성
		SmartPhone myPhone = new SmartPhone("갤럭시","은색");
		
		//Phone으로부터 상속 받은 필드 읽기
		System.out.println("모델: "+myPhone.model);
		System.out.println("색상: "+myPhone.color);

	}

}
