package com.bridgelabz.BCJ;
import java.util.*;
public class DecimalToBinary {
	
	public static void main(String[] args) {
		int decimal_no,i=0;
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the decimal number :- ");
		decimal_no = sc.nextInt();
		int binary_seq[] = new int[8];
		for(i=0;i<8;i++) {
			if(decimal_no > 0) {
				binary_seq[i] = decimal_no % 2;
				decimal_no = decimal_no / 2;
			}
			else {
				break;
			}
		}
		System.out.println("The binary sequence of entered decimal number is :- ");
		for(i=0;i<8;i++) {
			System.out.println(binary_seq[7-i]);
			
		}
	}

}
