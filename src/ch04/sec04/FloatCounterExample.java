package ch04.sec04;
//for문 작성시 float 타입 사용x
public class FloatCounterExample {

	public static void main(String[] args) {
		for (float x=0.1f; x<1.0f; x+=0.1f ) {
			System.out.println(x);
		}

	}

}
