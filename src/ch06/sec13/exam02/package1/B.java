package ch06.sec13.exam02.package1;

public class B {
	//필드 선언
	A a1 = new A(true); //ㅇ
	A a2 = new A(1); //ㅇ
	A a3 = new A("문자열"); //x private 생성자 접근 불가, 같은 클래스내 객체만 사용 가능
}
