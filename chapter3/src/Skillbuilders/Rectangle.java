package Skillbuilders;

import java.util.Scanner;

public class Rectangle 
{
	
	public static void main(String[] args)
	{
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Please enter the height of the rectangle in cm : ");
		int height = userInput.nextInt();
		
		System.out.print("Please enter the length of the rectangle in cm : ");
		int length = userInput.nextInt();
		
		int perimeter = 2 * length + 2 * height;
		
		System.out.print("The perimeter of the recantgle is : " + perimeter);
	}
	
	

}
