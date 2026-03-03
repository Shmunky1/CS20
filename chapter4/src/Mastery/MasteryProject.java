package Mastery;
import java.util.Scanner;

public class MasteryProject
{
	
	public static void main(String[]args)
	{
		double testP;
		char lG='#';
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please input your test percent: ");
		testP = input.nextDouble();
		
		if(testP >= 90 && testP <= 100)
		{
			lG = 'A';
		}
		
		else if (testP <= 89 && testP >= 80)
		{
			lG ='B';
		}
		
		else if (testP <= 79 && testP >= 70)
		{
			lG = 'C';
		}
		
		else if (testP <= 69 && testP >= 60)
		{
			lG = 'D';
		}
		
		else if (testP < 60)
		{
			lG = 'F';
		}
		
		System.out.println("Your percentile grade is " + (testP) + "%");
		System.out.println("Your letter grade is : " + (lG));
	}

}
