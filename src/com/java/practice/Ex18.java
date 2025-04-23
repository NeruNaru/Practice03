package com.java.practice;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		for(int line = num ; line>=1 ; line--) {
			for(int again = 0 ; again<line ; again++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for(int line = 2 ; line<=num ; line++) {
			for(int again = 0 ; again<line ; again++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		sc.close();

	}

}
