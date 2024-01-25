//Thora Cummins
//CIS406
//Class Project Phase 1

package orderEntryPhase1;
import java.util.Scanner;



public class OrderEntryPhase1
{
	// private vars
	private String itemDescription;
	private String itemNumber;
	private double itemPrice;
	private int itemQtyOrdered;
	
	// Fetch Item Description - Alphanumeric
	public String getItemDescription()
	{
		Scanner idObj = new Scanner(System.in);
		System.out.println("Enter Item Description: ");
		
		itemDescription = idObj.nextLine();
		return itemDescription;
	}
	
	
	// Fetch Item Number - Alphanumeric
	public String getItemNumber()
	{
		Scanner inObj = new Scanner(System.in);
		System.out.println("Enter Item Number: ");
		
		itemNumber = inObj.nextLine();
		return itemNumber;		
	}
	
	// Fetch Item Price
	public double getItemPrice()
	{
		Scanner ipObj = new Scanner(System.in);
		System.out.println("Enter Item Price: ");
		
		itemPrice = ipObj.nextDouble();
		return itemPrice;
	}
	
	//Fetch Quantity
	private int getQuantityOrdered()
	{
		Scanner qObj = new Scanner(System.in);
		System.out.println("Enter Quantity Ordered: ");
		
		itemQtyOrdered = qObj.nextInt();
		return itemQtyOrdered;
	}
	
	// Printout
	public void printOut()
	{
		System.out.println("Item Number:"+itemNumber);
		System.out.println("Item Description: "+itemDescription);
		System.out.println("Item Price: $"+itemPrice);
		System.out.println("Item Quantity Ordered: "+itemQtyOrdered);
	}
	
	// ------------------------------------------------
	public static void main(String[] args)
	{
		OrderEntryPhase1 oep = new OrderEntryPhase1();
		
		// Fetch Variable data
		oep.getItemNumber();
		oep.getItemDescription();
		oep.getItemPrice();
		oep.getQuantityOrdered();
		
		// Display Data
		System.out.println("Order Entry: \n");
		System.out.println("\n");
		oep.printOut();
	}
}
