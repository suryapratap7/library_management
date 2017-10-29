package libraryPackage;

public class Main
{

	//main method
	public static void main(String[] args) 
	{
		
			    // Constructs new Library container
				Library stock = new Library();
				// declare new variable which contain reference to  Manual
				Manual myManual ;
				//Create boolean variable with initialised value false
				boolean finished = false;
				//declare char variable
				char option;
				
				System.out.println("this is test of menu");
				
				// while statement begins
				while(! finished)
				{
					//call's a method name askOption in Console class
					option = Console.askOption("\nA)dd D)elet P)rint F)ind Q)uit ");
					
					//Compare each character given in case options and execute matched case
					switch(option)
					{
					//option add
					case 'A':
						myManual = new Manual();
						myManual.ask("\nEnter details...");
						stock.add(myManual);
						break;
						
					case 'D':
						String theSerialNo = Console.askString("\nEnter your manual's serial no.: ");
						myManual = stock.find(theSerialNo.trim());
						if(myManual == null)
							System.out.println("\nThere is no such manual in stock");
						else
							stock.remove(myManual);
						
						
					//option print
					case 'P':
						stock.print("\nManuals are....");
						break;
						
					//option find
					case 'F':
						String aSerialNo = Console.askString("\nEnter your manual's serial no.: ");
						
						 myManual = stock.find(aSerialNo.trim());
						if(myManual == null)
							System.out.println("\nThere is no such manual in stock");
						else
						    myManual.print("\nDetails of your manual are...\n");
						break;
						
					//option quit
					case 'Q':
						finished = true;
						break;
						
						
					case '\0':
						break; 
					
					// print following if the character dosen't match	
					default:
						System.out.println("Error: invalid option");
						break;
						
					}//end of switch
				}// end of while loop
				
				
		
				
		
	}// end of main function

}// end of class
