package ch12.sec09;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatExample {
	public static void main(String[] args) {
		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd");
		System.out.println( sdf.format(now) );

		sdf = new SimpleDateFormat("yyy년 MM월 dd일");
		System.out.println( sdf.format(now) );
		
		sdf = new SimpleDateFormat("yyy.MM.dd a HH:mm:ss");
		System.out.println( sdf.format(now));
		
		sdf = new SimpleDateFormat("오늘은 E요일");
		System.out.println( sdf.format(now) );
		
		sdf = new SimpleDateFormat("올해의 D번재 날");
		System.out.println( sdf.format(now));
		
		sdf = new SimpleDateFormat("이번의 d번째 날");
		System.out.println( sdf.format(now) );
	}

}
