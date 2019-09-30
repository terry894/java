package test1.함수;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyProgram {

	public static void main(String[] args) throws IOException {

		FileInputStream fin = new FileInputStream("res/image.bmp");
		FileOutputStream fout = new FileOutputStream("res/image_copy.bmp");
		
		byte[] buf = new byte[1024];
		int size = 0;
		
		while((size = fin.read(buf)) != -1) 
			fout.write(buf, 0, size);
			
		fin.close();
		fout.close();
		
		System.out.println("작업종료");
	}

}
