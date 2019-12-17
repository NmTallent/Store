package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		//System.out.println("Please enter the number of customers.");
		int numberOfCustomers = scan.nextInt();
		String [] customers = new String[numberOfCustomers];
		String [] totalPriceArray = new String[numberOfCustomers];
		int itemNumber = 0;
		
		

		for(int i = 0; i<numberOfCustomers; i++)
		{
			double totalPrice = 0;
			//System.out.println("Please enter the first name of the customer.");
			String firstName = scan.next();
			//System.out.println("Please enter the corresponding last name");
			String lastName = scan.next();
			customers[i] = firstName.charAt(0) + ". " + lastName;
			//System.out.println("Please enter the number of items purchased.");
			int numPurchased = scan.nextInt();
			for(int k = 0; k<numPurchased; k++)
			{
				itemNumber = 1;
				//System.out.println("How many of this item did you purchase?");
				int count = scan.nextInt();
				//System.out.println("What item is in item slot " + (itemNumber) + "?");
				String item = scan.next();
				
				
				//System.out.println("How much did the item cost individually?");
				double price = scan.nextDouble() * count;
				totalPrice = totalPrice + price;
				itemNumber = itemNumber + 1;
				
			}
			totalPriceArray[i] = String.format("%.2f", totalPrice);
			
		}
		for(int z = 0; z<numberOfCustomers; z++)
		{
			System.out.println(customers[z] + ": " + totalPriceArray[z]);
		}
		
	}
}
