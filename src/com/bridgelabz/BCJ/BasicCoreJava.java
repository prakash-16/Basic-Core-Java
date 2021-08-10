package com.bridgelabz.BCJ;
import java.util.*;
public class BasicCoreJava {
	
	public static void main(String[] args) {
		float harmonic_result=1;
		int N,i;
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the value of N :- ");
    	N = sc.nextInt();
    	for(i=2;i<=N;i++) {
    		harmonic_result = harmonic_result + (float)1 / i;		
    	}
    	System.out.println("The Harmonic value is " + harmonic_result);
	    		
	}

}
