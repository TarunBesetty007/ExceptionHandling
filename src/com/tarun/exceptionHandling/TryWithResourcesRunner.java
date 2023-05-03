package com.tarun.exceptionHandling;

import java.util.Scanner;

public class TryWithResourcesRunner {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int[] num = { 1, 2, 3, 4, 5 };
			int number = num[5];
		}
	}

}
