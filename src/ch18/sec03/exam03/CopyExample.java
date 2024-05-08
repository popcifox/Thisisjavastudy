package ch18.sec03.exam03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyExample {
	public static void main(String[] args) throws Exception{
		String originalFileName = "C:/Temp/test.jpg";
		String targetFileName = "C:/Temp/test2.jpg";
		
		//입출력 스트림 생성
		InputStream is = new FileInputStream(originalFileName);
		OutputStream os = new FileOutputStream(targetFileName);
		
		byte[] data = new byte[1024]; //읽은 바이트를 저장할 배열 생성
		while(true) {
			int num = is.read(data); //최대 1024바이트를 읽고 배열에 저장, 읽은 바이트는 리턴
			if(num == -1) break; //파일 다 읽으면 whil문 종료
			os.write(data, 0, num); //읽은 바이트 수만큼 출력
		}
		
		
		os.flush();
		os.close();
		is.close();
		
		System.out.println("복사가 잘 되었습니다.");
	}

}
