package test1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Program {



	public static void main(String[] args) throws IOException {
	int[] nums = new int[10];

     FileInputStream fin = new FileInputStream(	"C:\\eclipse\\workspace\\myeong\\res\\data.txt");//������ fin��ü�� �ҷ��´�
     
     Scanner fscan = new Scanner(fin);//fin��ü�� �մ³����� fscan�� ������´�
     int sum = 0,avg =0,count=0;

     while(fscan.hasNext()) {//true,false�� ��ȯ{
    	 sum += fscan.nextInt();
      
    	 count++;
     }
    
     //API: ���α׷��� �������ġ�� ����ϱ����ؼ� ����ϴ� �������̽�
     //�������̽�: �и��ؼ� ��뤷�Ҽ��ְ� ���ִ¿���
     avg = sum/count;
     System.out.println("����" + sum);
     System.out.println("���" + avg);
     
     fscan.close();  
     fin.close();//fin�� �����ֱ⶧���� �ݾ���� �Ѵ�
	}
    //System.in �ַܼ��Է�
    //fin ���Ϸ� �Է�
	//"C:\\eclipse\\workspace\\myeong\\ src\\res\\data.txt" ������ �о�������� ���� 
    //nextint - ���̶�������� �о���� int����ȯ
	//��� + ����(��/���)[�ܼ�,�Է�,ui������(��,������)]
	//����:��������� ����
	
	}



