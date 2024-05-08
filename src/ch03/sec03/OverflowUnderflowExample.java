package ch03.sec03;

public class OverflowUnderflowExample {
//오버플로어와 언더플로어 발생시 해당 정수타입의 최소값 또는 최대값으로 회귀
	public static void main(String[] args) {
		byte var1 = 125;
		for(int i=0; i<5; i++) { //5번 실행
			var1++; //++ 연산은 var1의 값을 1 증가시킨다
			System.out.println("var1: "+var1);
		}
		
		System.out.println("-----------------");
		
		byte var2 = -125;
		for(int i=0; i<5; i++) { //5번 실행
			var2--; //--연산은 var2의 값을 1 감소시킨다
			System.out.println("var2: "+var2);
		}

	}

}
