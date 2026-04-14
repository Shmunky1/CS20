package Mastery;

import java.util.Scanner;

class Mastery_project 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a positive integer: ");
		int digitLimit = input.nextInt();

		while(digitLimit > 0) 
		{
	  		System.out.println(digitLimit % 10);
	  		digitLimit = digitLimit / 10;
		}
	}
}