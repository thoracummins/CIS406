//Thora Cummins
//CIS406
//Class Project Phase 1

package orderEntryPhase1;
import java.util.Scanner;



public class OrderEntryPhase1
{

	// Fetch Item Description - Alphanumeric
	public static String getItemDescription()
	{
		Scanner idObj = new Scanner(System.in);
		System.out.println("Enter Item Description: ");
		
		String itemDesc = idObj.nextLine();
		return itemDesc;
	}
	
	
	// Fetch Item Number - Alphanumeric
	public static String getItemNumber()
	{
		Scanner inObj = new Scanner(System.in);
		System.out.println("Enter Item Number: ");
		
		String itemNumber = inObj.nextLine();
		return itemNumber;		
	}
	
	// Fetch Item Price
	public static double getItemPrice()
	{
		Scanner ipObj = new Scanner(System.in);
		System.out.println("Enter Item Price: ");
		
		double itemPrice = ipObj.nextDouble();
		return itemPrice;
	}
	
	// Printout
	public static void printOut(String itemNumber, String itemDescription, double itemPrice)
	{
		System.out.println("Item Number:"+itemNumber);
		System.out.println("Item Description: "+itemDescription);
		System.out.println("Item Price: $"+itemPrice);
	}
	
	// ------------------------------------------------
	public static void main(String[] args)
	{
		OrderEntryPhase1 oep = new OrderEntryPhase1();
		
		System.out.println("Order Entry: \n");
		String itemNumber = oep.getItemNumber();
		String itemDesc = oep.getItemDescription();
		double itemPrice = oep.getItemPrice();
		
		System.out.println("\n");
		oep.printOut(itemNumber, itemDesc, itemPrice);
	}
}
