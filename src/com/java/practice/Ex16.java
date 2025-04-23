package com.java.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		int sum = 0;
		int count = 0;
		
		num = num - (num%5);
		
		for(int i = 5 ; i<=num ; i += 5) {
			if(num%i == 0) {
				count++;
				sum += i;
			} else {
				count++;
				sum += i;
			}
		}
		System.out.println("5의 배수 개수: " + count);
		System.out.println("5의 배수 합: " + sum);
		
		sc.close();

	}

}
