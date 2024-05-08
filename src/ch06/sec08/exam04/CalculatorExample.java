package ch06.sec08.exam04;
//오버로딩: 메소드 이름은 같은데 매개변수의 타입, 개수, 순서가 다른 메소드를 여러개 선언한것
public class CalculatorExample {

	public static void main(String[] args) {
		// 객체생성
		Calculator myCalcu = new Calculator();
		
		//정사각형의 넓이 구하기
		double result1 = myCalcu.areaRectangle(10);
		
		//직사각형의 넓이 구하기
		double result2 = myCalcu.areaRectangle(10, 20);
		
		System.out.println("정사각형 넓이=" + result1);
		System.out.println("직사각형 넓이=" + result2);
	}

}
