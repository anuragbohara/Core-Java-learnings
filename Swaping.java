package com.learnjava;

import java.util.Scanner;

public class Swaping {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter A : ");
		int a = sc.nextInt();
		
		System.out.print("Enter B : ");
		int b = sc.nextInt();
		
		System.out.println("***************** With Third Variable **********************");
		
		int temp = 0;
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("A = " + a);
		System.out.println("B = " + b);
		
		System.out.println("****************** Without Third Variable ********************");
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("A = " + a);
		System.out.println("B = " + b);
		
		sc.close();
	}

}
