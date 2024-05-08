package ch06.sec07.exam03;
//매개변수명 이랑 필드명 동일, 필드명 구분하기 위해 this.필드명
public class Korean {
	//필드 선언
	String nation = "대한민국";
	String name;
	String ssn;
	
	//생성자 선언
	public Korean(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
}
