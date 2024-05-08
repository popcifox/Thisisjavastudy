package ch05.sec05;

public class EmptyStringExample {

	public static void main(String[] args) {
		String hobby = ""; //빈 문자열도 String객체로 생성되기 때문에 변수가 빈 문자열을 참조하는지 조사하려면 equls() 메소드 사용
		if(hobby.equals("")) {
			System.out.println("hobby 변수가 참조하는 String 객체는 빈 문자열");
		}

	}

}
