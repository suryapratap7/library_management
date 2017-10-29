package libraryPackage;

import java.util.ArrayList;

public class Library 
{
	//Create a Arraylist
	ArrayList <Manual> myLibrary;
	ArrayList <String> serialNo;
	
	//Create a constructor
	public Library()
	{
		myLibrary = new ArrayList <Manual> ();
		serialNo = new ArrayList <String> ();
		
	}
	
	//get's number of manuals in myLibrary
	public int getSize()
	{
	 return myLibrary.size();
	}
	
	//add manual in myLibrary and serialNumber in serialNo 
	public void add(Manual aManual)
	{
		myLibrary.add(aManual);
		serialNo.add(aManual.getSerialNumber());
	}
	
	public void remove(Manual aManual)
	
	{
		myLibrary.remove(aManual);
		serialNo.remove(aManual.getSerialNumber());
	}
	
	//print all the details of manuals of myLibrary with heading
	public void print(String header)
	{
		System.out.println(header);
		int nManuals = myLibrary.size();
		for (int i=0; i< nManuals; i++ )
			System.out.println(myLibrary.get(i));
	}
	
	//find details of manual with given serialNumber
	public Manual find(String aSerialNo)
	{
		int index = serialNo.indexOf(aSerialNo);
		if (index == -1)
			return null;
		else
			return myLibrary.get(index);
	}

}
