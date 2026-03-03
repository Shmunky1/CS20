package Mastery;

import java.text.NumberFormat;
import java.util.Scanner;

public class mastery_project 
{

	public static void main(String[] args) 
	{
		double food, clothing, entertainment, rent;
		
		double totalCost, foodP, clothingP, entertainmentP, rentP;
		
	    Scanner input = new Scanner(System.in);
	    
	    System.out.println("Food: $ ");
	    
	    food = input.nextDouble();
	    
	    
	    System.out.println("Clothing: $ ");
	    
	    clothing = input.nextDouble();
	    
	    
	    System.out.println("Entertainment: $ ");
	    
	    entertainment = input.nextDouble();
	    
	    
	    System.out.println("Rent: $ ");
	    
	    rent = input.nextDouble();
	    
	    
	    totalCost = (food + clothing + entertainment + rent);
	    
	    foodP = food / totalCost;
	    clothingP = clothing / totalCost;
	    entertainmentP = entertainment / totalCost;
	    rentP = rent / totalCost;
	    
	    NumberFormat nf = NumberFormat.getPercentInstance();
	    NumberFormat nc = NumberFormat.getCurrencyInstance();
	    
	    
	    System.out.println("Spendings \t\t\t Spending Distribution");
	    System.out.println("Food: $" + (food) + "\t\t\t " + nf.format(foodP));
	    System.out.println("Clothing: " + nc.format(clothing) + "\t\t " + nf.format(clothingP));
	    System.out.println("Entertainment: " + nc.format(entertainment) + "\t\t " + nf.format(entertainmentP));
	    System.out.println("Rent: " + nc.format(rent) + "\t\t\t " + nf.format(rentP));

	    
		
	}

}
	

