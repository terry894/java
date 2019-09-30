package test1.함수;

import java.util.Scanner;
//트리구조 
public class LottoProgram {
	
	public static void main(String[] args) {
     
		//데이터
		int[] lotto = new int[6];
		
		//기능(알고리즘)
		printMenu();//f3 alt + 화살표 해당 함수로 이동
	
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
		System.out.println("잘 못 입력하셨습니다.");

	}

	private static int exitProgram() {
		return 0;
	}
	

	private static void genLottoAuto(int[] lotto) {

	}

	private static void inputLottoManual(int[] lotto) {
		int[] innumber = new int[6];
        		
		System.out.println("번호를 입력하세요");
		

	}

	private static int inputMenu() {//사용자에게 값을 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("메뉴 번호를 입력하세요: ");
		int menu = sc.nextInt();
		return menu;
	}
	private static void printMenu() {
		System.out.println("-----lotto------");
		System.out.println("\t1 수동");
		System.out.println("\t2 자동");
		System.out.println("\t3 종료");
	}

}
