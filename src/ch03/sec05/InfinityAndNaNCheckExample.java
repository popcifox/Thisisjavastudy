package ch03.sec05;

public class InfinityAndNaNCheckExample {
//나눗셈 연산 후 NaN과 Infinity 처리
//숫자 / 0.0 => Infinity , 숫자 % 0.0 => NaN
// Infinity와 NaN 일때 연산하면 Infinity, NaN 만 출력됨
	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		double z = x/y;
		//double z = x % y;

		//잘못된 코드
		System.out.println(z + 2);
		
		//알맞는 코드
		//Infinity, NaN 확인을 위해 Double.isInfinite(), Double.isNaN() 문법 사용
		if(Double.isInfinite(z)|| Double.isNaN(z)) {
			System.out.println("값 산출 불가");
		}
		else
			System.out.println(z+2);
	}

}
