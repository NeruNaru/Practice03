package com.java.practice;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money = 0;
		
		while(true) {
			System.out.println("==========================");
			System.out.println("| 1.예금 2.출금 3.잔고 4.종료 |");
			System.out.println("==========================");
			System.out.print("선택> ");
			int select = sc.nextInt();
			if(select == 4) {
				System.out.println("프로그램 종료");
				break;
			} else {
				if(select == 1) {
					System.out.println("예금하실 금액을 입력해주세요.");
					System.out.print("예금액: ");
					int plus_money = sc.nextInt();
					System.out.println("=========================");
					System.out.println("입력하신 금액: " + plus_money);
					System.out.println("예상 예금액: " + (money+plus_money));
					System.out.println("=========================");
					System.out.println("예금하시겠습니까?");
					System.out.println("1.예 2.아니오");
					System.out.print("선택>");
					int real = sc.nextInt();
					if(real == 1) {
						money = money+plus_money;
					} else {
						System.out.println("초기화면으로 돌아갑니다");
					}
				} else {
					if(select == 2) {
						System.out.println("출금하실 금액을 입력해주세요.");
						System.out.println("현재 예금액: " + money);
						System.out.println("======================");
						System.out.print("출금액> ");
						int minus_money = sc.nextInt();
						if(money >= minus_money) {
							System.out.println("===============================");
							System.out.println("출금액: " + minus_money);
							System.out.println("예상 잔여 예금액" + (money-minus_money));
							System.out.println("===============================");
							System.out.println("출금 하시겠습니까?");
							System.out.println("1.예 2.아니오");
							int real = sc.nextInt();
							if(real == 1) {
								money = money-minus_money;
							}else {
								System.out.println("초기화면으로 돌아갑니다.");
							}
						} else {
							System.out.println("출금액이 예금액보다 많습니다.");
							System.out.println("초기화면으로 돌아갑니다.");
						}
					} else {
						if(select == 3) {
							System.out.println("현재 예금액: " +money);
						} else {
							System.out.println("에러: 다시 입력해주세요");
						}
					}
				}
			}
		}
		
		System.out.println("==========================");
		System.out.println("| 1.예금 2.출금 3.잔고 4.종료 |");
		System.out.println("==========================");
		
		sc.close();

	}

}
