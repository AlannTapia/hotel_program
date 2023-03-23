package project_package_1;

import java.util.Scanner;
import java.util.Random;

public class Project_1 {

	public static void main(String[] args) {
		
int NumberofNights,NumberofGuests,RoomOption,AAAMember,ClubMember,RandomChance,MealPlan;

Random RandmNum = new Random(); // This is for the Random number discount in the Club member Section
RandomChance = RandmNum.nextInt(10);

double RandomDiscount = 0;

Scanner input = new Scanner(System.in);

	System.out.println("ROOM OPTIONS");
	System.out.println("1. Single @ $50.50 per night");
	System.out.println("2. Double @ $75.00 per night");
	System.out.println("3. Queen @ $100.75 per night");
	System.out.println("4. King @ $150.25 per night");
	System.out.println("5. Master Suite @ $225.50 per night \n \n");
	
// // // // // // // // // // // // // // // // // // // // // // // // // // // // // // //
	
	System.out.print("Please type in the number of guests here:");
				NumberofGuests = input.nextInt();
	System.out.print("Please your choice of room (enter 1/2/3/4/5 corresponding to the options shown above):");
		RoomOption = input.nextInt();
			if (RoomOption < 0 || RoomOption > 5) {
	 System.out.print(" Room Number not valid. Please Try Again");
		}
		
		System.out.print("Please enter the number of nights: ");
				NumberofNights = input.nextInt();
		// Since I don't think you need a limit on how many nights you can stay, So I won't make a limit. :)
		System.out.print("Are you a AAA member (enter 1 for yes, 0 for no)?");
	    		AAAMember = input.nextInt();
    		if (AAAMember < 0 || AAAMember > 1) {
    			System.out.print("Invalid Response, please try again.");
    		}
    	System.out.print("Are you a club member (enter 1 for yes, 0 for no)?");
    				ClubMember = input.nextInt();
			if (ClubMember < 0 || ClubMember > 1) {
				System.out.print("Invalid Response, please try again.");		
			}
		System.out.print("\n");
// // // // // // // // // // // // // // // // // // // // // // // // // // // // // // //

			if (ClubMember == 1 && RandomChance >= 4 && NumberofNights >= 4) {
				System.out.println("Congratulations! you've qualified for our \"Stay 4 nights get 1 free promotion\"");
				System.out.println("Discount will be applied during checkout depending on the number of days \n");
				if (NumberofNights < 4 &&  RoomOption == 1) {
						RandomDiscount = 0;
					}
					else if (NumberofNights >= 4 && NumberofNights < 8 && RoomOption == 1) {
						RandomDiscount = 50.50;
					}
					else if (NumberofNights >= 8 && NumberofNights < 12 && RoomOption == 1)	{
						RandomDiscount = 101;
					}
					else if (NumberofNights >= 12 && NumberofNights < 16 && RoomOption == 1)	{
						RandomDiscount = 151.5;
					}
					else if (NumberofNights >= 16 && NumberofNights < 20 && RoomOption == 1)	{
						RandomDiscount = 202.00;
					}
					else if (NumberofNights >= 20 && NumberofNights < 24 && RoomOption == 1)	{
						RandomDiscount = 252.5;
					}
					else if (NumberofNights < 4 && RoomOption == 2)	{
						RandomDiscount = 0;
					}
					else if (NumberofNights >= 4 && NumberofNights < 8 && RoomOption == 2)	{
						RandomDiscount = 75.00;
					}
					else if (NumberofNights >= 8 && NumberofNights < 12 && RoomOption == 2) {
						RandomDiscount = 150.00;
					}
					else if (NumberofNights >= 12 && NumberofNights < 16 && RoomOption == 2)	{
						RandomDiscount = 225.00;
					}
					else if (NumberofNights >= 16 && NumberofNights < 20 && RoomOption == 2)	{
						RandomDiscount = 300.00;
					}
					else if (NumberofNights >= 20 && NumberofNights < 24 && RoomOption == 2)	{
						RandomDiscount = 375.00;
					}
					else if (NumberofNights < 4 && RoomOption == 3)	{
						RandomDiscount = 0;
					}
					else if (NumberofNights >= 4 && NumberofNights < 8 && RoomOption == 3)	{
						RandomDiscount = 100.75;
					}
					else if (NumberofNights >= 8 && NumberofNights < 12 && RoomOption == 3) {
						RandomDiscount = 201.5;
					}
					else if (NumberofNights >= 12 && NumberofNights < 16 && RoomOption == 3)	{
						RandomDiscount = 302.25;
					}
					else if (NumberofNights >= 16 && NumberofNights < 20 && RoomOption == 3)	{
						RandomDiscount = 403;
					}
					else if (NumberofNights >= 20 && NumberofNights < 24 && RoomOption == 3)	{
						RandomDiscount = 503.75;
					}
					else if (NumberofNights < 4 && RoomOption == 4)	{
						RandomDiscount = 0;
					}
					else if (NumberofNights >= 4 && NumberofNights < 8 && RoomOption == 4)	{
						RandomDiscount = 150.25;
					}
					else if (NumberofNights >= 8 && NumberofNights < 12 && RoomOption == 4) {
						RandomDiscount = 300.5;
					}
					else if (NumberofNights >= 12 && NumberofNights < 16 && RoomOption == 4)	{
						RandomDiscount = 450.75;
					}
					else if (NumberofNights >= 16 && NumberofNights < 20 && RoomOption == 4)	{
						RandomDiscount = 601;
					}
					else if (NumberofNights >= 20 && NumberofNights < 24 && RoomOption == 4)	{
						RandomDiscount = 751.25;
					}
					else if (NumberofNights < 4 && RoomOption == 5)	{
						RandomDiscount = 0;
					}
					else if (NumberofNights >= 4 && NumberofNights < 8 && RoomOption == 5)	{
						RandomDiscount = 225.50;
					}
					else if (NumberofNights >= 8 && NumberofNights < 12 && RoomOption == 5) {
						RandomDiscount = 451;
					}
					else if (NumberofNights >= 12 && NumberofNights < 16 && RoomOption == 5)	{
						RandomDiscount = 676.5;
					}
					else if (NumberofNights >= 16 && NumberofNights < 20 && RoomOption == 5)	{
						RandomDiscount = 902;
					}		
					else if (NumberofNights >= 20 && NumberofNights < 24 && RoomOption == 5)	{
						RandomDiscount = 1127.50;
					}
			}
			else  {
				System.out.println("Unfortunetly, you didn't qualify for our \"Stay 4 nights get 1 free promotion\". Better luck next time! \n");
					RandomDiscount = 0;
			}
			
// // // // // // // // // // // // // // // // // // // // // // // // // // // // // // //			
	
			System.out.println("MEAL PACKAGES (PRICES SHOWN ARE PER NIGHT)");
			System.out.println("0. Complimentary @ $0 per guest");
			System.out.println("1. Standard @ $30 per guest");
			System.out.println("2. Deluxe @ $50 per guest");
				if (RoomOption == 5) {
					System.out.println("3. Indulgence @ $85 per guest \n");
					System.out.println("Please select your desired meal package (enter 0/1/2/3 corresponding to the options shown \nabove):");
				}
				else if (RoomOption < 5 && RoomOption >0) {
					System.out.println("2. Deluxe @ $50 per guest\n");
					System.out.println("Please select your desired meal package (enter 0/1/2 corresponding to the options shown \nabove):");
				}
			MealPlan = input.nextInt();
			
				if (MealPlan < 0 || MealPlan > 3) {
					System.out.println("Invalid Response, Please try again");
				}
						input.close();

// // // // // // // // // // // // // // // // // // // // // // // // // // // // // // //
						
			double TotalRoomCost = 0,PreCost = 0,AAADiscount = 0,TotalCost = 0,RoomCost = 0,MealCost = 0,TotalMealCost = 0;
			
			if (RoomOption == 1) {
				RoomCost = 50.50;
			}
			else if (RoomOption == 2) {
				RoomCost = 75.00;
			}
			else if (RoomOption == 3) {
				RoomCost = 100.75;
			}
			else if (RoomOption == 4) {
				RoomCost = 150.25;
			}
			else if (RoomOption == 5) {
				RoomCost = 225.50;
			}
			
TotalRoomCost = (NumberofNights * RoomCost);

//// // // // // // // // // // // // // // // // // // // // // // // // // // // // // //
	switch (MealPlan) {
	 case 0:
		 MealCost =  0;
	 break;
	 case 1:
		 MealCost =  30;
	 break;
	 case 2:
		 MealCost =  50;
	 break;
	 case 3:
		 MealCost =  85;
	 break;
	}

TotalMealCost = (NumberofGuests * NumberofNights * MealCost);


//// // // // // // // // // // // // // // // // // // // // // // // // // // // // // //

PreCost = (TotalRoomCost + TotalMealCost);

////// // // // // // // // // // // // // // // // // // // // // // // // // // // // //

if (AAAMember == 1) {
	AAADiscount = (PreCost * .10);
}
else if (AAAMember == 0 ) {
	AAADiscount = 0;
}
//////// // // // // // // // // // // // // // // // // // // // // // // // // // // //

TotalCost = (PreCost - AAADiscount - RandomDiscount);

////////// // // // // // // // // // // // // // // // // // // // // // // // // // //



	System.out.println("CHECKOUT");
	System.out.println("Room Cost:\t\t" + "$" + TotalRoomCost);
	System.out.println("Meal Cost:\t\t" + "+$" + TotalMealCost);
	System.out.println("Preliminary Total Cost:\t" + "$" + PreCost);
	System.out.println("AAA Discount:\t\t" + "-$" + AAADiscount);
	System.out.println("Club Member Discount:\t" + "-$" + RandomDiscount);
	System.out.println("Total Cost of Booking:\t" + "$" + TotalCost);
	
		input.close();
	
	}
}
