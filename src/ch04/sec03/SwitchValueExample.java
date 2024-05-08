package ch04.sec03;

public class SwitchValueExample {

	public static void main(String[] args) {
		String grade = "B";
		
		//JAVA 11 이전 문법
		int score1 = 0;
		switch(grade) {
			case "A":
				score1 = 100;
				break;
			case "B":
				int result = 100 - 20;
				score1 = result;
				break;
			default:
				score1 = 60;
		}
		System.out.println("score1: " + score1);
		
		//JAVA 12부터 가능
		int score2 = switch(grade) {
		case "A" -> 100;
		case "B" -> {
				int result = 100 - 20;
				//Java 13부터 가능, switch expressions 중괄호 사용시 yield 키워드로 값 지정 이 경우에는 default 반듯이 존재
				yield result;
			}
			default -> 60;
		};
		System.out.println("score2: " + score2);

	}

}
