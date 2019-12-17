package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		//System.out.println("How many items are in the store?");
		int storNumItems = scan.nextInt();
		String [] items = new String[storNumItems];
		double [] itemsPrice = new double [storNumItems];
		
		for(int i = 0; i<storNumItems; i++)
		{
			//System.out.println("What is the name of item number: " + (i+1) + "?");
			items[i] = scan.next();
			//System.out.println("What is the price of this item?");
			itemsPrice[i] = scan.nextDouble();

		}
		
		//System.out.println("Please enter the number of customers.");
		int numberOfCustomers = scan.nextInt();
		double numOfCust = numberOfCustomers;
		String [] customers = new String[numberOfCustomers];
		double [] totalOfArray = new double [numberOfCustomers];
		String [] totalPriceArray = new String[numberOfCustomers];
		int itemIdentifier=0;
		double totalOfAllPurchases = 0;
		double average = 0;
		double largestPurchase = totalOfArray[0];
		double smallestPurchase = 999999999;
		int maxPos = 0;
		int minPos = 999999;
		

		for(int i = 0; i<numberOfCustomers; i++)
		{
			double totalPrice = 0;
			//System.out.println("Please enter the first name of the customer.");
			String firstName = scan.next();
			//System.out.println("Please enter the corresponding last name");
			String lastName = scan.next();
			customers[i] = firstName + " " + lastName;
			//System.out.println("Please enter the number of items purchased.");
			int numPurchased = scan.nextInt();
			for(int k = 0; k<numPurchased; k++)
			{
				//System.out.println("How many of these did they purchase?");
				int count = scan.nextInt();
				
				//System.out.println("What item is in item slot " + (k+1) + "?");
				String item = scan.next();
				for(int r = 0; r<storNumItems; r++)
				{
					if(items[r].equals(item))
					{
						itemIdentifier = r;
					}
				}
				totalPrice = totalPrice + itemsPrice[itemIdentifier]*count;
				
			}
			totalOfArray[i] = totalPrice;
			totalPriceArray[i] = String.format("%.2f", totalPrice);
			
		}
		for(int e = 0;e<numberOfCustomers;e++)
		{
			totalOfAllPurchases = totalOfAllPurchases + totalOfArray[e];
			average = totalOfAllPurchases /numOfCust;
		}
		
		for(int y = 0; y<numberOfCustomers; y++)
		{
			if(totalOfArray[y]>largestPurchase)
			{
				largestPurchase = totalOfArray[y];
			}
		}
		for(int u = 0; u<numberOfCustomers; u++)
		{
			if(largestPurchase == totalOfArray[u])
			{
				maxPos = u;
			}
		}
		
		for(int c = 0; c<numberOfCustomers; c++)
		{
			if(totalOfArray[c]<smallestPurchase)
			{
				smallestPurchase = totalOfArray[c];
			}
		}
		for(int v = 0; v<numberOfCustomers; v++)
		{
			if(smallestPurchase == totalOfArray[v])
			{
				minPos = v;
			}
		}
		String averageText = String.format("%.2f", average);
		String largestPurchaseText = String.format("%.2f",largestPurchase);
		String smallestPurchaseText = String.format("%.2f", smallestPurchase);
		System.out.println("Biggest: " + customers[maxPos] + " (" + largestPurchaseText + ")");
		System.out.println("Smallest: " + customers[minPos] + " (" + smallestPurchaseText + ")");
		System.out.println("Average: " + averageText);	
	}		
}

