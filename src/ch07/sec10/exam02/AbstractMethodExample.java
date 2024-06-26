package ch07.sec10.exam02;

public class AbstractMethodExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sound();
		
		Cat cat = new Cat();
		cat.sound();
		
		//매개변수의 다향성
		animalSound(new Dog());
		animalSound(new Cat());

	}
	
	public static void animalSound(Animal animal) { //13,14줄 자동타입변환
		animal.sound(); //재정의된 메소드 호출
	}

}
