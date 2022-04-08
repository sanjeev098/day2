package com.capg.cal;

import java.util.Scanner;

public class largestnumber {
	public static void main(String[] agrs) {
		int a, b, c, largest;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		a = sc.nextInt();
		System.out.println("Enter the second number:");
		b = sc.nextInt();
		System.out.println("Enter the third number:");
		c = sc.nextInt();
		// largest=;
		// System.out.println("the largest number is"+largest);
		// checking if a greater than b
		if (a > b) {
			// this means a is greater than b
			// check the a greater than c also
			if (a > c) {
				// this means a is greater than a and c
				System.out.println("a is greater "+a);
			} else {
				// this means c is greater than a which is already greater than b in line no 16
				System.out.println("c is greater "+c);
			}

		} else {
			//a is small than b that means b is greater than a
			//compare the b with c 
			if(b>c)
			{
				//if b greater than c then b is largest 
				System.out.println("b is greater " +b);
			}
			else
			{
				//b was already  greater than a and now b is greater in  line no 32 
				//b is small than C so c is greater
				System.out.println("c is greater "+c);
			}

		}

	}

}
