/*

Program: MasteryProject2.java          Last Date of this Revision: April 28th

Purpose: An application that converts the specified number of different coins into dollars.

Author: Eli Norman 
School: CHHS
Course: Computer Programming 20
 

*/


package Mastery;

import java.util.Scanner;

public class MasteryProject2 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your total coins.");
		
		System.out.println("Quarters: ");
		int quarters = input.nextInt();
		
		System.out.println("Dimes: ");
		int dimes = input.nextInt();
		
		System.out.println("Nickels: ");
		int nickels = input.nextInt();
		
		System.out.println("Pennies: ");
		int pennies = input.nextInt();
		
		String total = getDollarSum(pennies, nickels, dimes, quarters);
		
		System.out.println("\nTotal dollars: " + total);
		
		input.close();
	}
	
	public static String getDollarSum(int pennies, int nickels, int dimes, int quarters)
	{
		int totalCents = pennies + (nickels * 5) + (dimes * 10) + (quarters * 25);
		
		double dollars = totalCents / 100.0;
		
		return String.format("$%.2f", dollars);
	}

}
