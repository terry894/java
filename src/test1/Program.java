package test1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Program {



	public static void main(String[] args) throws IOException {
	int[] nums = new int[10];

     FileInputStream fin = new FileInputStream(	"C:\\eclipse\\workspace\\myeong\\res\\data.txt");//파일을 fin객체에 불러온다
     
     Scanner fscan = new Scanner(fin);//fin객체에 잇는내용을 fscan에 가지고온다
     int sum = 0,avg =0,count=0;

     while(fscan.hasNext()) {//true,false로 반환{
    	 sum += fscan.nextInt();
      
    	 count++;
     }
    
     //API: 프로그램이 입출력장치를 사용하기위해서 사용하는 인터페이스
     //인터페이스: 분리해서 사용ㅇ할수있게 해주는역할
     avg = sum/count;
     System.out.println("총합" + sum);
     System.out.println("평균" + avg);
     
     fscan.close();  
     fin.close();//fin이 물고있기때문에 닫아줘야 한다
	}
    //System.in 콘솔로입력
    //fin 파일로 입력
	//"C:\\eclipse\\workspace\\myeong\\ src\\res\\data.txt" 파일을 읽어오기위한 버퍼 
    //nextint - 사이띄기전까지 읽어오고 int형반환
	//언어 + 도구(입/출력)[콘솔,입력,ui껍데기(웹,윈도우)]
	//버퍼:줄을세우는 역할
	
	}



