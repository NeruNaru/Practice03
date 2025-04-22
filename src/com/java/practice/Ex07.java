package com.java.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int no = sc.nextInt();
		//no값을 입력 (no: 출력하고 싶은 총 줄 수)
		
		for(int line = 1 ; line<=no ; line++) {
			System.out.println("");
			//line이 no와 같아질 때까지 줄바꿈을 반복
			for(int again = 1 ; again<=line ; again++) {
				System.out.print(line);
				//again값이 line값과 같아질 때까지 line값을 반복 출력
			}
		}
		sc.close();
	}

}
