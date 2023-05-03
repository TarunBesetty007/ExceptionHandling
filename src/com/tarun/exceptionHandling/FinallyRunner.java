package com.tarun.exceptionHandling;

import java.util.Scanner;

public class FinallyRunner {

	public static void main(String[] args) {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			int[] num = { 1, 2, 3, 4, 5 };
			int number = num[5];
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			System.out.println("Before scanner close");
			sc.close();
		}
		System.out.println("Just before closing out main");
	}

}
