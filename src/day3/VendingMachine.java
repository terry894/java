package day3;

import java.util.Scanner;

public class VendingMachine {
	public static void main(String[] args) {
		// 자판기

		// 1. 레드불 2. 둘둘다방커피 3.봉봉 4.식혜 5.사이다

		System.out.println("----------------");
		System.out.println("먹어봐 자판기");
		System.out.println("----------------");
		System.out.println("메뉴");
		System.out.println("1. 레드불  2. 둘둘 다방 커피  3. 봉봉");
		System.out.println("2,000원          500원                   1,200원");
		System.out.println("4. 식혜     5. 사이다");
		System.out.println("1,000원          900원");

		System.out.println("----------------");
		// 2. 사용자로부터 돈을 입력받는다

		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하세요:");
		int money = sc.nextInt(); // 금액을 입력받는다
		System.out.println(money);

		// 3. 사용자가 메뉴를 선택한다.

		System.out.print("메뉴를 선택하세요:");
		int menu = sc.nextInt(); //메뉴를 입력 받는다
		System.out.println(menu);

		// 4. 수량을 선택한다.

		System.out.print("수량을 입력하세요:");
		int num = sc.nextInt(); // 수량을 입력받는다
		System.out.println(num);

		int choice = 0; //해당 하는 메뉴의 금액이 들어갈 변수 선언 
		int total = 0; // 해당하는 메뉴와 수량의 곱이 들어갈 변수 선언 
		String name = "";
		switch (menu) {
		case 1:
			name = "레드불";
			choice = 2000; // 해당하는 메뉴의 금액이 변수 choice안에 들어간다
			break;
		case 2:
			name = "둘둘 다방커피";
			choice = 500;
			break;
		case 3:
			name = "봉봉";
			choice = 1200;
			break;
		case 4:
			name = "식혜";
			choice = 1000;
			break;
		case 5:
			name = "사이다";
			choice = 900;
			break;

		}
		total = choice * num; //전체금액은 선택한 메뉴의 금액 * 수량 
		System.out.println("total:" + total); // 전체 금액 출력 

		// 5. 잔액이 충분하다면 6번 부족 하면 7
		System.out.println("----------------");
		if (money >= total) { // 6. 선택한 음료를 제공한다. 선택한 메뉴의 전체 금액이 입력한 금액보다 작을때
			System.out.println("주문하신 음료가 나왔습니다");
			System.out.println(name + ": " + num);
		} else { // 잔액이 부족하면 7번 
			System.out.println("잔액이 부족합니다");
			System.out.println("다시 이용해 주세요");
		}

		// 8. 잔돈을 반환한다.
		System.out.println("----------------");
		int remoney;
		remoney = money - total;
		System.out.println("잔돈을 반환 합니다");
		System.out.println(remoney);

	}
}
