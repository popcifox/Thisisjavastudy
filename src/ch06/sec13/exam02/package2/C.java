package ch06.sec13.exam02.package2;
import ch06.sec13.exam02.package1.*;
public class C {
	//필드 선언
	A a1 = new A(true); //o
	A a2 = new A(1); // x default 생성자 접근 불가,같은 패키지만 가능
	A a3 = new A("문자열"); //x, private생성자 접근불가, 같은 클래스내만 가능
}
