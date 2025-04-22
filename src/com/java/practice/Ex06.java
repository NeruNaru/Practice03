package com.java.practice;

public class Ex06 {

	public static void main(String[] args) {
		int num = 1;
		while(num<=100) {
			if(num%5 == 0 && num%7 == 0) {
				System.out.println("===========");
				System.out.println(num);
				System.out.println("===========");
			}
			System.out.println("현재: " + num);
			num++;
		}

	}

}
