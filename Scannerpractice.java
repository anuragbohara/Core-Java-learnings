package com.regex;
import java.util.Scanner;


public class Scannerpractice {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		
		System.out.print("Enter your experince: ");
		double experince = sc.nextDouble();
		
		System.out.print("Do you enjoy work: ");
		boolean enjoy = sc.nextBoolean();
		
		System.out.println("Hello " + name + ",Your age is " + age + "\nit's your experince " + experince +" years" +  "\ngood to know that you enjoy your work " + enjoy);
		
		
	    System.out.print("-----------------------------------------------------------------------------------\n");
	    
	    System.out.print("Enter 1st number : ");
	    int a = sc.nextInt();
	    
	    System.out.print(" Enter 2nd number :  ");
	    int b = sc.nextInt();
	    
	    System.out.println(a + b);
	}

}
