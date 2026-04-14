package Mastery;
import java.util.Scanner;

public class Mastery_project2 
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the first hour: ");
		int hour = input.nextInt();
		
		System.out.println("Morning(AM) or afternoon(PM): ");
		String period = input.next().toLowerCase();
		
		System.out.println("Enter the amount of hours elapsed: ");
		int elapsed = input.nextInt();

		if (period.equals("pm") && hour != 12)
		{
			hour += 12;
		}
		else if (period.equals("am") && hour == 12)
		{
			hour = 0;
		}
		
		hour = (hour + elapsed) % 24;
		
		String newPeriod;
		if (hour >= 12)
		{
			newPeriod = "pm";
		}
		else
		{
			newPeriod = "am";
		}
		
		int displayHour = hour % 12;
		if (displayHour == 0)
		{
			displayHour = 12;
		}

		System.out.println("The time is now: " + displayHour + ":00" + newPeriod);

	}
	                                                                                                                                            

}
