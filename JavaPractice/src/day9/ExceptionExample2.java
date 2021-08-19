package day9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ExceptionExample2 {
	
	//Java8 버전 이상부터는 하단 코드처럼 사용
	static void copy(String src, String dest) throws IOException { //만약 IOException을 안 던지면 catch구문 작성해야함
		try(InputStream in = new FileInputStream(src);
				OutputStream out = new FileOutputStream(dest)) {
				byte[] buf = new byte[1024];
				int n;
				while((n = in.read(buf)) >= 0) {
					out.write(buf, 0, n);
				}
		}
	}
	
	
	/* Java8 버전부터 하단의 코드보단 상단의 코드처럼 사용해야함
	 * ==> src에 있는 파일을 dest에 있는 파일로 복사하는 구문
	
	static void copy(String src, String dest) throws IOException {
		InputStream in = null;
		OutputStream out = null;
		try {
			out = new FileOutputStream(dest);
			try {
				in = new FileInputStream(src);
				
				byte[ ] buf = new byte[1024];
				int n;
				while((n = in.read(buf)) >= 0)
					out.write(buf, 0, n);
			} finally {
				if(in != null) {
					try {
						in.close();
					} catch (IOException e) {
						// TODO: handle exception
					}
				}
			}
		}finally {
			if(out != null) {
				try {
					out.close();
				}catch(IOException e) {
					// .....
				}
			}
		}
	}*/
}
	
	
	
	
	
	
	
	
	
	
