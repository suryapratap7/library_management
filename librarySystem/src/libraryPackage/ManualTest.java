package libraryPackage;

public class ManualTest
{

	
	public static void main(String[] args) 
	{
		System.out.println("This application is to test Manual Class\n");
		
		Manual myManual = new Manual();
		//display the default value of attributes
		myManual.print();
		
		//call set method of Manual class
		myManual.set("11111", "OOP", "Surya\n");
		myManual.print();
		
		myManual.setAuthor("Chawda\n");
		myManual.print();
		
		//call getAuthor() method
		String author = myManual.getAuthor();
		System.out.println("\nAuthor is..." + author);
		
		myManual.ask("\nEnter all the details...");
		
		//print all the Manuals
		System.out.println("\n\nYour details are.. " + myManual);

	}
	

}

