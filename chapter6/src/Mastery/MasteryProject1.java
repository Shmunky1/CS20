/*

Program: MasteryProject1.java          Last Date of this Revision: April 23rd

Purpose: An application that displays a symmetrical pyramid based on the height that the user inputs.

Author: Eli Norman 
School: CHHS
Course: Computer Programming 20
 

*/


package Mastery;

import java.util.Scanner;

public class MasteryProject1 
{
	public static void main(String[] args)
	{
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter the height of the triangle: ");
			int height = input.nextInt();
			
			for (int i = 1; i <= height; i++)
			{
				addSpaces(height - i);
				drawBar(2 * i - 1);
			}
			
			input.close();
			
	}
	
	public static void addSpaces(int count)
	{
		for (int i = 0; i < count; i++)
		{
			System.out.print(" ");
		}
	}
	
	public static void drawBar(int length)
	{
		for (int i = 0; i < length; i++)
		{
			System.out.print("*");
		}
		
		System.out.println();
	}

}
