package com.Programing;

public class PrimeNumbers {

	public static void main(String[] args) {
		int num=3;
		int count=0;
		if(num>1) {
			for(int i=1;i<=num;i++) {
				if(num%i==0) 
					count++;
				}
			     if(count==2) {
			    	 System.out.println("num is prime");
			     }
			     else {
			    	 System.out.println("number is not prime");
			     }
			}
		}

	}


