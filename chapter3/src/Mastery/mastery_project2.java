package Mastery;

import java.util.Scanner;

public class mastery_project2 
{
	public static void main(String[] args)
	{
		double YOB, MOB, DOB;
		
		double CY, CM, CD;
		
		double daysA, hoursA, hoursS;
		
		Scanner input = new Scanner(System.in);

		
		System.out.println("Please input the year of your birth :  ");
		YOB = input.nextDouble();
		
		System.out.println("Please input the month of your birth :  ");
		MOB = input.nextDouble();
		
		System.out.println("Please input the day of your birth :  ");
		DOB = input.nextDouble();
	
		Scanner input1 = new Scanner(System.in);

		
		System.out.println("Please input the current year : ");
		CY = input1.nextDouble();
		
		System.out.println("Please input the current month : ");
		CM = input1.nextDouble();
		
		System.out.println("Please input the current day : ");
		CD = input1.nextDouble();
		
		
		daysA = (CY * 365 + CM * 30 + CD - YOB * 365 - MOB * 30 - DOB);
		
		hoursA = (daysA * 24);
		hoursS = (daysA * 8);
		
		System.out.println("You have been alive for " + (daysA) + " days!");
		System.out.println("You have spent " + (hoursS) + " hours sleeping.");
	}

	
}
