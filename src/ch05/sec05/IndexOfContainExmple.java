package ch05.sec05;

public class IndexOfContainExmple {

	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		String substring = subject.substring(location); //substring:문자열 잘라내기, 프로그래밍 문자열 잘라내기
		System.out.println(substring);
		
		location = subject.indexOf("자바");
		if(location != -1) { //포함되어 있지 않은 경우:-1, 포함된 경우:1
			System.out.println("자바와 관련된 책이군요.");
		}else {
			System.out.println("자바와 관련없는 책이군요");
		}
		
		boolean result = subject.contains("자바"); //주어진 문자열이 단순히 포함되어 있는지만 조사하고 싶을때 .contains()
		if(result) {
			System.out.println("자바와 관련된 책이군요");
		} else {
			System.out.println("자바와 관련없는 책이군요");
		}

	}

}
