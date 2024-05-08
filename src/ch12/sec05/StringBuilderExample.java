package ch12.sec05;

public class StringBuilderExample {
	public static void main(String[] args) {
		String data = new StringBuilder()
				.append("DEF") //메소드 체이닝 패턴
				.insert(0, "ABC") //메소드 체이닝 패턴
				.delete(3, 4) //메소드 체이닝 패턴
				.toString(); //메소드 체이닝 패턴
		System.out.println(data);

	}

}
