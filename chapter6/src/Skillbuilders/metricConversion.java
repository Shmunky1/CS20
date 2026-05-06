package Skillbuilders;
import java.text.DecimalFormat;
import java.util.Scanner;
public class metricConversion
{
	static DecimalFormat dcf = new DecimalFormat("0.0");
	//Converting inches to centimeters
	public static void inchesToCentimeters(int number)
	{
		double answer;
		
		answer = number * 2.54;
		
		System.out.println("\n"+ number
				+ " inches equals"
				+ dcf.format(number) + "centimeters.");
		
	}
	
	public static void feetToCentimeters(int number)
	{
		double answer;
		
		answer = number * 30.48;
		
		System.out.println("\n"+ number
				+ " feet equals"
				+ dcf.format(number) + "centimeters.");
	
	}
	
	public static void yardsToMeters(int number)
	{
		double answer;
		
		answer = number * 0.91;
		
		System.out.println("\n"+ number
				+ " yards equals"
				+ dcf.format(number) + "meters.");
	}
	
	public static void mileToKilometers(int number)
	{
		double answer;
		
		answer = number * 1.6;
		
		System.out.println("\n"+ number
				+ " miles equals"
				+ dcf.format(number) + "kilometers.");
	}
	public static void cmToInches(int number)
	{
		double answer;
		
		answer = number * 0.91;
		
		System.out.println("\n"+ number
				+ " cm equals"
				+ dcf.format(number) + "inches.");
	}
	public static void cmToFeet(int number)
	{
		double answer;
		
		answer = number * 0.91;
		
		System.out.println("\n"+ number
				+ " cm equals"
				+ dcf.format(number) + "inches.");
	}
	public static void main(String[]args)
	{
		int choice;
		int number;
		Scanner input = new Scanner (System.in);
		System.out.println("enter a number: ");
		number = input.nextInt();
		System.out.println();
		System.out.println("Convert:");
		System.out.println("1. Inches to Centimeters/t"
							+ "5. Centimeters to Inches");
		System.out.println("2. Feet to Centimeters/t"
				+ "6. Centimeters to Feet");
		System.out.println("3. Yards tometers/t"
				+ "7. meters to yards");
		System.out.println("4. miles to kilometers/t"
				+ "8. kilometers to miles");
		
		System.out.println("Enter your choice: ");
		choice = input.nextInt();
		
		{
		switch(choice)
		{
		case 1:  inchesToCentimeters(number);break;
		
		case 2:  feetToCentimeters(number);break;
		
		case 3:  yardsToMeters(number);break;
		
		case 4:  mileToKilometers(number);break;
		}
	}
	}
}

