package ch20.mysql.sec09.exam02;

import java.sql.Blob;
import java.util.Data;
import lombok.Data;

@Data //Constructor, Getter, Setter, hashCode(), equals(), toString() 자동 생성
public class Board {
	private int bno;
	private String btitle;
	private String bcontent;
	private String bwriter;
	private Data bdate;
	private String bfilename;
	private Blob bfiledata;
}
