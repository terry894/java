package test1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
//숫자 입출력 
public class BmpProgram {

	public static void main(String[] args) throws IOException {
		
		byte[] buf = new byte[10];
		//=============로드=============
		FileInputStream fin = new FileInputStream("res/image.bmp");
		
		fin.read(buf);
		fin.close();//읽고나면 바로 닫는다 
		
		System.out.printf("buf %x %x \n", buf[0], buf[1]);
	    //==========파일크기============
		int size = (buf[2]  & 0xff) << 0  | // 0x000000ff->0xff
				   (buf[3]  & 0xff) << 8 |
				   (buf[4]  & 0xff) << 16|
		           (buf[5]  & 0xff) << 24;
		//2,3,4,5 -> 5,4,3,2 로바꾸는 과정
		//0000 1111
		//0000 1010
		 //byte 형식인 buf[2]는 1111 1010 이였는데 이를 int형으로 바꾸면서 1111 1111 1111 1111 1111 1111 1111 1010 왼쪽으로 밀기때문에 1로채워짐
		//따라서 mask처리를 해야한다 0000 0000 0000 0000 0000 1111 1111 과 &연산 =>16진수로 바꾸면 0x000000ff
		//=============출력==============
		System.out.println(size);
		
	
		
		//read() :숫자 , next(),nextline() :문자, 
		//write(): 문자 숫자 모두 입력가능? 더편리하게 printf()를 사용 
		//0bxxxxxx:2진수표현
		//0x:16진수표현
		
		
	}

}
