package ch06.sec07.exam02;

public class KoreanExample {

	public static void main(String[] args) {
		// Korean 객체 생성
		Korean k1 = new Korean("박자바","011225-1234567");
		//Korean 객체 데이터 읽기
		System.out.println("K1.natino : " + k1.nation);
		System.out.println("K1.name : " + k1.name);
		System.out.println("K1.ssn : " + k1.ssn);
		System.out.println();
		
		//또 다른 Korean객체 생성
		Korean k2 = new Korean("김자바","930525-0654321");
		//또 다른 Korean 객체 데이터 읽기
		System.out.println("K2.natino : " + k2.nation);
		System.out.println("K2.name : " + k2.name);
		System.out.println("K2.ssn : " + k2.ssn);
		System.out.println();
	}

}
