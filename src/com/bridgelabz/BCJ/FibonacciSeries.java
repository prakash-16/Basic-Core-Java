package com.bridgelabz.BCJ;

import java.util.Scanner;

public class FibonacciSeries {
	
	public static final int first_no = 0, second_no =1;
	public static void main(String[] args) {
		int N,i,sum;
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the number for series :- ");
		N = sc.nextInt();
		int fib_series[] = new int[N];
		fib_series[0] = first_no;
		fib_series[1] = second_no;
		for(i=2;i<N;i++) {
			sum = fib_series[i-1] + fib_series[i-2];
			fib_series[i] = sum; 
		}
		System.out.println("The fibonacci series is :- ");
		for(i=0;i<N;i++) {
			System.out.println(fib_series[i]);
		}
	}

}
