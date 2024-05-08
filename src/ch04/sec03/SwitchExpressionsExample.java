package ch04.sec03;

public class SwitchExpressionsExample {
//expressions(표현식) break문 없에는 대신 화살표와 중괄호 사용 가독성 높임
	public static void main(String[] args) {
		char grade = 'B';
		
		switch(grade) {
		case 'A', 'a' -> {
			System.out.println("우수회원입니다");
			}
		case 'B', 'b' -> {
			System.out.println("일반 회원입니다.");
			}
		default -> {
			System.out.println("손님입니다");
			}
		}
		
		switch(grade) {
		case 'A', 'a' -> System.out.println("우수 회원입니다");
		case 'B', 'b' -> System.out.println("일반 회원입니다");
		default -> System.out.println("손님입니다");
		}
	}

}
