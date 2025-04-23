package com.java.practice;

public class Ex09 {

	public static void main(String[] args) {
		for(int line = 1 ; line<=10 ; line++) {
			System.out.println("");
			for(int step = 0 ; step+line<=9+line ; step++) {
				System.out.print(step+line + "\t");
			}
		}

	}

}
