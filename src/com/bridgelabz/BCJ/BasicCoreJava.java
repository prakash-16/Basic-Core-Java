package com.bridgelabz.BCJ;
import java.util.*;
public class BasicCoreJava {
	
	public static void main(String[] args) {
		int N,i;
	    System.out.println("Enter Power :- ");
	    Scanner sc = new Scanner(System.in);
	    N = sc.nextInt();
	    double x[] = new double[31];
	    if(N>=0 && N<=31) {
	    	for(i=0;i<N;i++) {
	    		x[i] = Math.pow(2, i);
	    	}
	    	for(i=0;i<=N;i++) {
	    		System.out.println(x[i]);
	    	}
	    }
	    else {
	    	System.out.println("Overflowed");
	    }
	    		
	}

}
