package com.java.practice;

import java.util.Scanner;
import java.util.Random;

public class Ex20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int no = random.nextInt(100);
		
		System.out.println("=======================");
		System.out.println("\t [숫자맞추기 게임 시작]");
		System.out.println("=======================");
		System.out.println("정답: " +no);
		
		while(true) {
			System.out.print(">>");
			int user_answer = sc.nextInt();
			if(user_answer == no) {
				System.out.println("정답입니다.");
				break;
			} else {
				if(user_answer < no) {
					System.out.println("더 높게");
				} else {
					System.out.println("더 낮게");
				}
			}
		}
		
		sc.close();
		

	}

}
