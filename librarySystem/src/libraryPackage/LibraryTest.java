package libraryPackage;

public class LibraryTest {

	public static void main(String[] args) 
	{
		System.out.println("This application is to test Library Class\n");
		
		// Constructs new Library container
		Library myLibrary = new Library();
		
		Manual manual1 = new Manual();
		//ask user to enter details
		manual1.ask("Enter detail of Manual 1....");
		// add reference of details of manual1 in myLibrary
		myLibrary.add(manual1);
		
		
		Manual manual2 = new Manual();
		//ask user to enter details
		manual2.ask("\nEnter detail of Manual 2....");
		myLibrary.add(manual2);
		
		//print manuals of my library
		myLibrary.print("\n Your Manuals are...");
		//call getSize method of Library class
		System.out.println("\nNumber of Manuals are: " + myLibrary.getSize());

		
	}

}
