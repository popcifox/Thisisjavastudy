package ch07.sec09;

public class Student extends Person {
	//필드 선언
	public int sudentNo;
	
	//생성자 선언
	public Student(String name, int sudentNo) {
		super(name);
		this.sudentNo = sudentNo;
	}
	
	//메소드 선언
	public void study() {
		System.out.println("공부를 합니다.");
	}
}
