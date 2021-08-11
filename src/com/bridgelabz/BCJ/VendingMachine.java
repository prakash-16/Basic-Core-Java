package com.bridgelabz.BCJ;

import java.util.Scanner;

public class VendingMachine {
	
	public static void main(String[] args) {
		
		int chng,rem,rev_N=0,x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the change in rupees :- ");
		chng = sc.nextInt();
		int notes[] = new int[] { 1, 2, 5, 10, 50, 100, 500, 1000 };
		int data[] = new int[40];
		while(chng>0) {
			rem = chng % 10;
			if(rem>0) {
				if(rem>5) {
				    x = rem-5;
					
				}
				else if(rem>2) {
					x =rem -2
				}
				else {
					
				}
			}
		}
		
	}

}
