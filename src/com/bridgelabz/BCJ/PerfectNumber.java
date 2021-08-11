package com.bridgelabz.BCJ;

import java.util.Scanner;

public class PerfectNumber {
	
	public static void main(String[] args) {
		int n,i=1,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :- ");
		n = sc.nextInt();
		while(i <= n/2) {
			if(n % i == 0) {
				sum = sum + i;
			}
			i++;
		}
		if(sum == n) {
			System.out.println("It is perfect numeber");
		}
		else
		{
			System.out.println("It is not a perfect number");
		}
	}

}
