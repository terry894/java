package test1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class APIProgram {
	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = new FileOutputStream("res/api-out.txt");
		PrintStream fout = new PrintStream(fos);
		FileInputStream fin = new FileInputStream("res/data.txt");
		
		int b1 = System.in.read();
		System.out.println(b1);
		
		int b2 = fin.read();
		fout.println(b2);
		
		fin.close();
		fout.close();
		
	}
}
