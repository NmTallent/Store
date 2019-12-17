package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		//System.out.println("How many items are in the store?");
		int storNumItems = scan.nextInt();
		String [] items = new String[storNumItems];
		
		
		for(int i = 0; i<storNumItems; i++)
		{
			//System.out.println("What is the name of item number: " + (i+1) + "?");
			items[i] = scan.next();
			//System.out.println("What is the price of this item?");
			double [] itemsPrice = new double [storNumItems];
			itemsPrice[i] = scan.nextDouble();
		}
		
		//System.out.println("Please enter the number of customers.");
		int numberOfCustomers = scan.nextInt();
		double numOfCust = numberOfCustomers;
		String [] customers = new String[numberOfCustomers];
		int itemIdentifier=0;
		int [] numOfItemPurchased = new int[storNumItems];
		int [] numCustomersPurchased = new int [storNumItems];
		double [] totalOfArray = new double [numberOfCustomers];
		String [] totalPriceArray = new String[numberOfCustomers];
		int count = 0;
		double totalOfAllPurchases = 0;
		double average = 0;
		double largestPurchase = totalOfArray[0];
		double smallestPurchase = 999999999;
		int maxPos = 0;
		int minPos = 0;
		

		for(int i = 0; i<numberOfCustomers; i++)
		{
			double totalPrice = 0;
			//System.out.println("Please enter the first name of the customer.");
			String firstName = scan.next();
			//System.out.println("Please enter the corresponding last name");
			String lastName = scan.next();
			int [] custBought = new int[storNumItems];
			for(int q = 0; q<storNumItems;q++)
			{
				custBought[q] = 0;
			}
			customers[i] = firstName + ". " + lastName;
			//System.out.println("Please enter the number of different items purchased.");
			int numPurchased = scan.nextInt();
			for(int k = 0; k<numPurchased; k++)
			{
				
				//System.out.println("How many of these did they purchase?");
				count = scan.nextInt();
				
				//System.out.println("What item is in item slot " + (k+1) + "?");
				String item = scan.next();
				
				

				for(int r = 0; r<storNumItems; r++)
				{
					
					if(items[r].equals(item))
					{
						itemIdentifier = r;
						if(custBought[r] == 0)
						{
							numCustomersPurchased[r] = (numCustomersPurchased[r]+1);
							custBought[r] = custBought[r]+1;

						}
					}
				}
				numOfItemPurchased[itemIdentifier] = (numOfItemPurchased[itemIdentifier] + count);
				
			}
			
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

		for(int t = 0; t<(items.length);t++)
		{
			if(numOfItemPurchased[t]==0)
			{
				System.out.println("No customers bought " + items[t]);
			}
			if(numOfItemPurchased[t]!=0)
			{
			System.out.println(numCustomersPurchased[t] +" customers bought " + numOfItemPurchased[t] + " "
							+ items[t]);
			}
			
		}
	}		
}

