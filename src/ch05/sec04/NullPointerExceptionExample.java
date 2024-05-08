package ch05.sec04;
//예외(프로글램 실행도중 발생하는 오류, 변수가 null인 상태에서 객체의 데이터나 메소드를 사용하려 할때 발생하는 예외
public class NullPointerExceptionExample {

	public static void main(String[] args) {
		int [] intArray = null;
		//intArray[0] = 10; //NullPointerException
		
		String str = null;
		//System.out.println("총 문자 수 : " + str.length());//NullPointerException

	}

}
