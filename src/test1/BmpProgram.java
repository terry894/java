package test1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
//���� ����� 
public class BmpProgram {

	public static void main(String[] args) throws IOException {
		
		byte[] buf = new byte[10];
		//=============�ε�=============
		FileInputStream fin = new FileInputStream("res/image.bmp");
		
		fin.read(buf);
		fin.close();//�а��� �ٷ� �ݴ´� 
		
		System.out.printf("buf %x %x \n", buf[0], buf[1]);
	    //==========����ũ��============
		int size = (buf[2]  & 0xff) << 0  | // 0x000000ff->0xff
				   (buf[3]  & 0xff) << 8 |
				   (buf[4]  & 0xff) << 16|
		           (buf[5]  & 0xff) << 24;
		//2,3,4,5 -> 5,4,3,2 �ιٲٴ� ����
		//0000 1111
		//0000 1010
		 //byte ������ buf[2]�� 1111 1010 �̿��µ� �̸� int������ �ٲٸ鼭 1111 1111 1111 1111 1111 1111 1111 1010 �������� �б⶧���� 1��ä����
		//���� maskó���� �ؾ��Ѵ� 0000 0000 0000 0000 0000 1111 1111 �� &���� =>16������ �ٲٸ� 0x000000ff
		//=============���==============
		System.out.println(size);
		
	
		
		//read() :���� , next(),nextline() :����, 
		//write(): ���� ���� ��� �Է°���? �����ϰ� printf()�� ��� 
		//0bxxxxxx:2����ǥ��
		//0x:16����ǥ��
		
		
	}

}
