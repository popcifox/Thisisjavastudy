package ch06.sec11.exam02;
//상수 = 불변값 = static 이면서 final 속성을 가짐
//초기값은 선언시 주는게 일반적이지만 복잡한 초기화 필요시 정적 블록에서 초기화 가능
public class Earth {
	//상수 선언 및 초기화
	static final double EARTH_RADIUS = 6400;
	
	//상수 선언
	static final double EARTH_SURFACE_AREA;
	
	//정적 블록에서 상수 초기화
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS ;
	}
}
