package libraryPackage;

public class Manual 
{

	//attributes
	String serialNumber;
	String title;
	String author;
	
	// Constructor called Manual with default values
	public Manual()
	{
		serialNumber = "??????";
		title = "Untitled";
		author = "Unknown";
		
	}
	
	
	// print method
	public void print()
	{
		System.out.println("Serial Number: " + serialNumber);
		System.out.println("Title: " + title);
		System.out.println("Author: "+ author);
	}
	// print heading
	public void print (String heading)
	{
		System.out.println(heading);
		print();
	}
	// toString method which prints string and integer in one line
	public String toString()
	{
		return "Serial Number: " + serialNumber + ", Title: " + title + ", Author: " + author;
	}
	
	

	//set method which set's the value of attributes
	public void set( String aSerialNumber, String aTitle, String aAuthor)
	{
		serialNumber= aSerialNumber;
		title = aTitle;
		author = aAuthor;
	}
	//set's the value of serialNumber
	public void setSerialNumber(String aSerialNumber)
	{
		serialNumber= aSerialNumber;
	}
	//set's the value of title
	public void setTitle(String aTitle)
	{
		title = aTitle;
	}
	//set's the value of author
	public void setAuthor(String aAuthor)
	{
		author = aAuthor;
	}
	
	
	
	//Create get method which will get serialNumber
	public String getSerialNumber()
	{
		return serialNumber;
	}
	//get's title
	public String getTitle()
	{
		return title;
	}
	//get's author
	public String getAuthor()
	{
		return author;
	}
	
	
	//Create a ask method which prompt's user to enter details of manual
	public void ask(String aPrompt)
	{
		System.out.println(aPrompt);
		setSerialNumber( Console.askString("Serial Number: "));
		setTitle( Console.askString("Title: "));
		setAuthor( Console.askString("Author: "));
	}
	
	
	
	
}

