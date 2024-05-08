package ch02.sec01;

public class PromotionExample {

	public static void main(String[] args) {
		//자동타입변환 작은거 -> 큰거
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue: "+ intValue);
		
		char charVale = '가';
		intValue = charVale;
		System.out.println("가의 유니코드"+ intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue: "+ longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue: "+floatValue);
		
		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println("doubleValue: "+doubleValue);
	}

}
