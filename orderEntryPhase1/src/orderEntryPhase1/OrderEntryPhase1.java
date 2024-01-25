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
	private double netPrice;
	private double totDiscount;
	private double totTax;
	
	// Fetch Item Description - Alphanumeric
	public void getItemDescription()
	{
		Scanner idObj = new Scanner(System.in);
		System.out.println("Enter Item Description: ");
		
		itemDescription = idObj.nextLine();
	}
	
	// Fetch Item Number - Alphanumeric
	public void getItemNumber()
	{
		Scanner inObj = new Scanner(System.in);
		System.out.println("Enter Item Number: ");
		
		itemNumber = inObj.nextLine();
	}
	
	// Fetch Item Price
	public void getItemPrice()
	{
		Scanner ipObj = new Scanner(System.in);
		System.out.println("Enter Item Price: ");
		
		itemPrice = ipObj.nextDouble();
	}
	
	//Fetch Net Price
	public void getNetPrice()
	{
		Scanner npObj = new Scanner(System.in);
		System.out.println("Enter Net Price: ");
		
		netPrice = npObj.nextDouble();
	}
	
	//Fetch Quantity
	private void getQuantityOrdered()
	{
		Scanner qObj = new Scanner(System.in);
		System.out.println("Enter Quantity Ordered: ");
		
		itemQtyOrdered = qObj.nextInt();
	}
	
	//Fetch Total Discount
	private void getTotalDiscount()
	{
		Scanner tdObj = new Scanner(System.in);
		System.out.println("Enter Total Discount: $");
		
		totDiscount = tdObj.nextDouble();
	}
	
	//Fetch Total Tax
	private void getTotalTax()
	{
		Scanner txObj = new Scanner(System.in);
		System.out.println("Enter Tax: $");
		
		totTax = txObj.nextDouble();
	}
	
	// Printout
	public void printOut()
	{
		System.out.println("Item Number:"+itemNumber);
		System.out.println("Item Description: "+itemDescription);
		System.out.println("Item Price: $"+itemPrice);
		System.out.println("Quantity Ordered: "+itemQtyOrdered);
		System.out.println("Total Tax: $"+totTax);
		System.out.println("Total Discount: $"+totDiscount);
		System.out.println("Net Price: $"+netPrice);
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
		oep.getTotalTax();
		oep.getTotalDiscount();
		oep.getNetPrice();
		
		// Display Data
		System.out.println("Order Entry: \n");
		oep.printOut();
	}
}
