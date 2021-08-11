package com.bridgelabz.BCJ;
import java.io.*;
import java.util.Scanner;
import java.lang.*;

public class SwappingNibbles {
	
	public static void main(String[] args) {
		int decimal_no,i=0;
		double value = 0 ;
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the decimal number :- ");
		decimal_no = sc.nextInt();
		int binary_seq[] = new int[8];
		int x[] = new int[8];
		int new_binary[] = new int[8];
		while(decimal_no > 0) {
			binary_seq[i++] = decimal_no % 2;
			decimal_no = decimal_no / 2;
		}
		System.out.println("The binary sequence of entered decimal number is :- ");
		for(i=0;i<4;i++) {
			//x[i] = binary_seq[4+i];  //last 4 item
			new_binary[i] = binary_seq[4+i];
			new_binary[4+i] = binary_seq[i];
		}
		for(i=0;i<8;i++) {
			System.out.println(binary_seq[7-i]); //first  4 item
			x[i] = new_binary[7-i];
			
		}
		System.out.println("The Binary sequence after swapping Nibbles\n");
		for(i=0;i<8;i++) {
			System.out.println(x[i]);
			if(new_binary[i] != 0 ) {
				value = value + Math.pow(2, i);
			}
		}
		System.out.println("The value is after reversing is " + value);		
	}

}
