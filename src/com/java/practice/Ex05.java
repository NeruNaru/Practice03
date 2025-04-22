package com.java.practice;

public class Ex05 {

	public static void main(String[] args) {
		int i = 1;
		boolean flag = true;
		
		while(flag) {
			if(i>=5) {
				flag = false;
			}
			System.out.println(i);
			i=i+1;
		}
		//i의 값이 1이고 한 루틴이 진행될 때 바다 i에 1을 더해 i가 5가 될 때가지 i값을 출력
		//반복문 탈출조건: i가 5일 때 flag 값을 false로 변경
	}

}
