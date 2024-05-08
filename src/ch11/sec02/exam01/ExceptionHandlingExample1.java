package ch11.sec02.exam01;

public class ExceptionHandlingExample1 {
	public static void printLength(String data) {
		try {
			int result = data.length(); //data가 null일 경우 NullPointerException 발생
			System.out.println("문자 수: "+result);
			} catch(NullPointerException e) {
				//예외 정보를 얻는 3가지 방법
				System.out.println(e.getLocalizedMessage()); //1) 예외 발생이유만
				//System.out.println(e.toString(); //2) 예외종류 리턴
				//e.printStackTrace(); //3) 예외가 어디서 발생했는지 추적한 내용 출력
				} finally {
					System.out.println("[마무리 실행]\n");
				}
		}
	
		public static void main(String[] args) {
			System.out.println("[프로그램 시작]\n");
			printLength("ThisIsJava");
			printLength(null); // 매개값으로 null을 대입
			System.out.println("[프로그램 종료]");

		}
}
