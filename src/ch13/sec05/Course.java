package ch13.sec05;

public class Course {
	//모든 사람이라면 등록가능
	public static void registerCourse1(Applicant<?> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course1를 등록함");
	}
	
	//학생만 등록가능
	public static void registerCoursel(Applicant<? extends Student>applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course2를 등록함");
	}
	
	//직장인 및 일반인만 등록 가능
	public static void registerCourse3(Applicant<? super Worker> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName()+"이(가) Course3을 등록함");
	}
}
