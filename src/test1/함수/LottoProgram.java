package test1.�Լ�;

import java.util.Scanner;
//Ʈ������ 
public class LottoProgram {
	
	public static void main(String[] args) {
     
		//������
		int[] lotto = new int[6];
		
		//���(�˰���)
		printMenu();//f3 alt + ȭ��ǥ �ش� �Լ��� �̵�
	
		switch(inputMenu()) {
		case 1:
		    inputLottoManual(lotto);
		    break;
		case 2:    
		    genLottoAuto(lotto);
		    break;
		case 3:
		    exitProgram();
		    break;
		default:
			errorMessage();
			break;
		}
	}



	private static void errorMessage() {
		System.out.println("�� �� �Է��ϼ̽��ϴ�.");

	}

	private static int exitProgram() {
		return 0;
	}
	

	private static void genLottoAuto(int[] lotto) {

	}

	private static void inputLottoManual(int[] lotto) {
		int[] innumber = new int[6];
        		
		System.out.println("��ȣ�� �Է��ϼ���");
		

	}

	private static int inputMenu() {//����ڿ��� ���� �Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("�޴� ��ȣ�� �Է��ϼ���: ");
		int menu = sc.nextInt();
		return menu;
	}
	private static void printMenu() {
		System.out.println("-----lotto------");
		System.out.println("\t1 ����");
		System.out.println("\t2 �ڵ�");
		System.out.println("\t3 ����");
	}

}
