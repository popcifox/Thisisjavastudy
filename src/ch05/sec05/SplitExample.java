package ch05.sec05;

public class SplitExample {

	public static void main(String[] args) {
		String board = "1,자바 학습,참조 타입 String을 학습합니다.,홍길동";
		
		
		//문자열 분리, split메소드는 쉼표로 문자열 배열을 얻을수 있다
		String[] tokens = board.split(",");
		
		//인덱스별로 읽기
		System.out.println("번호: "+ tokens[0]);
		System.out.println("제목: "+ tokens[1]);
		System.out.println("내용: "+ tokens[2]);
		System.out.println("성명: "+ tokens[3]);
		System.out.println();
		
		//for 문을 이용한 읽기
		for(int i = 0; i <tokens.length; i++) {
			System.out.println(tokens[i]);
		}

	}

}
