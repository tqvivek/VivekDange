/****** 11)Write a Java program to input electricity consumption unit and calculate totalelectricity billaccording to the given
condition: For first 50 units Rs. 0.50/unit For next 100 units Rs. 0.75/unit For next 100 units Rs. 1.20/unit For unit
above 250 Rs. 1.50/unit An additional surcharge of 20% is added to the bill *****/

import java.util.Scanner;

public class ElectricityBill
 {
	
	public static void main(String[] args) 
	{
		int Units;
		double Amount, Sur_Charge, Total_Amount;
		
		Scanner sc = new Scanner(System.in);
		System.out.print(" Please Enter the Units that you Consumed  : ");
		Units = sc.nextInt();
  
	  	if (Units < 50)
	  	{
	        Amount = Units * 2.60;
	  		Sur_Charge = 25;  	
	  	} 
	  	else if (Units <= 100)
	  	{
	  		// For the First Fifty Units Charge = 130 (50 * 2.60)
	  		// Next, we are removing those 50 units from total units
	  		Amount = 130 + ((Units - 50 ) * 3.25);
	  		Sur_Charge = 35; 	
	  	}
	  	else if (Units <= 200)
	  	{
	  		// First Fifty Units charge = 130, and 50 - 100 is 162.50 (50 * 3.25)
	  		// Next, we are removing those 100 units from total units
	  		Amount = 130 + 162.50 + ((Units - 100 ) * 5.26);
	  		Sur_Charge = 45; 	
	  	}
	  	else
	  	{
	  		/* First Fifty Units = 130, 50 - 100 is 162.50, 
	  		 and 100 - 200 is 526 (100 * 5.65)
	  		Next, we are removing those 200 units from total units */
		   	Amount = 130 + 162.50 + 526 + ((Units - 200 ) * 7.75); 
		   	Sur_Charge = 55; 
		}
		
		Total_Amount = Amount + Sur_Charge;
		System.out.println("\n Electricity Bill  =  " + Total_Amount);
	}

}