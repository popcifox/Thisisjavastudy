package ch04.sec07;
//반복문 바깥쪽 까지 종료해야할시 break이름;
public class BreakOutterExample {

	public static void main(String[] args) {
		Outter:for(char upper='A'; upper<='Z'; upper++) {
			for(char lower='a';lower<='z';lower++) {
				System.out.println(upper + "-" + lower);
				if(lower == 'g'){
					break Outter;
				}
			}
		}

	}

}
