package com.bridgelabz.BCJ;
import java.util.*;
public class ReverseANumber {
	
	public static void main(String[] args) {
		int N,rev_N=0,rem;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :- ");
		N = sc.nextInt();
		while(N>0) {
			rem = N % 10;
			rev_N = rev_N * 10 + rem;
			N =N / 10;
		}
		System.out.println("The reverse number is " + rev_N);
	}

}
