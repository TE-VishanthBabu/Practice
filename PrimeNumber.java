package com.te.program.workout;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number to check prime or not");
		int a=sc.nextInt();
		int flag = 0;
		int m = a / 2;
		{
			if (a == 0 || a == 1) {
				System.out.println(a + "is not prime number");
			} else {
				for (int i = 2; i <= m; i++) {
					if (a % i == 0) {
						flag = 1;
						break;
					}
				}
				String st = flag == 0 ? a + " prime number" : a + " is not prime number";
				System.out.println(st);
			}

		}
	}
}
