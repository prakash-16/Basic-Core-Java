package com.bridgelabz.BCJ;
import java.util.*;
public class BasicCoreJava {
	
	public static void main(String[] args) {
		double no_of_flips,percentage_of_flip;
		double Head = 0.0, Tail = 0.0;
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the number of flips :- ");
		no_of_flips = sc.nextFloat();
		double result_of_flip = Math.floor(Math.random());
		if(result_of_flip<0.5) {
			Tail++;
		}
		else {
			Head++;
		}
		
		percentage_of_flip = (Head/no_of_flips)*100;
		System.out.println("The percentage of Heads is " + percentage_of_flip);
		percentage_of_flip = (Tail/no_of_flips)*100;
		System.out.println("The percentage of Tails is " + percentage_of_flip);
		
		
	}

}
