package ch06.sec08.exam04;

public class Calculator {
	//정사각형 넓이
	double areaRectangle(double width) {
		return width * width;
	}//오버로딩
	
	//직사각형 넓이
	double areaRectangle(double width, double hight) {
		return width* hight;
	}//오버로딩
}
