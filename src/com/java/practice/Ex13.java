package com.java.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i = 1 ; i <= num ; i++) {
			sum += i;
		}
		
		System.out.println("합계: " + sum);
		
		sc.close();

	}

}
