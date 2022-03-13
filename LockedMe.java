package SimplilearnFinalProject;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class LockedMe {
	static final String projectFilesPath="C:\\Users\\Ravi\\Desktop\\LockedMe Project";
	
	/**
	 * this method will display menu
	 */
	public static void displayMenu() 
	
	{
		System.out.println("***********************************");
		System.out.println("\tWelcome to LockedMe.com secure app");
		System.out.println("Developed By:ISHWAR CHAWAN");
		System.out.println("***********************************");
		System.out.println("\t1.Display all files");
		System.out.println("\t2.Add a new file");
		System.out.println("\t3.Delete a file");
		System.out.println("\t4.Search a file");
		System.out.println("\t5.Exit");
		System.out.println("***********************************");
	}
	/**
	 * this method will get all the files
	 */
public static void getAllFiles() 
{
	//creating object file
	File folder=new File(projectFilesPath);
	File[] listofFiles=folder.listFiles();
	
	if(listofFiles.length>0)
	{
	System.out.println("The Files are listed below:\n");
	for(var l:listofFiles)
	{
		System.out.println(l.getName());
	}
	}
	else
	{
		System.out.println("The folder is empty");
	}
	
}
/**
 * this method will create the files
 */
public static void createFiles() 
{
	try
	{
	@SuppressWarnings("resource")
	//input from user
	Scanner obj= new Scanner(System.in);
	String filename;
	System.out.println("Enter file name:");
	filename=obj.nextLine();
	
	int linescount;
	System.out.println("Enter how many lines in the file:");
	//storing value
	linescount=Integer.parseInt(obj.nextLine());
	
	FileWriter fw=new FileWriter(projectFilesPath+"\\"+filename);
	
	//Read line by line from user
	for(int i=1;i<=linescount;i++)
	{
		System.out.println("Enter file line:");
		fw.write(obj.nextLine()+"\n");
	}
	
	System.out.println("File created sucessfully");
	fw.close();
	
}

	catch(Exception Ex) 
	{
		
	}
}
/**
 * this method will delete the files
 */
public static void deleteFiles() 
{
	try
	{
	@SuppressWarnings("resource")
	//input from user
	Scanner obj= new Scanner(System.in);
	String filename;
	System.out.println("Enter file name to be deleted:");
	filename=obj.nextLine();
	
	//Get all files names into a list
	ArrayList <String> allFilesnames=new ArrayList <String> ();
	File folder=new File(projectFilesPath);
	//reading list of files from the folder
	File[] listofFiles=folder.listFiles();

	if(listofFiles.length>0)
	{
	System.out.println("The Files are listed below:\n");
	for(var l:listofFiles)
	{
		allFilesnames.add(l.getName());
	}
	
	}
	File f=new File(projectFilesPath+"\\"+filename);
	if(allFilesnames.contains(filename))
	{
		f.delete();
		System.out.println("File deleted Sucessfully");
	}
	else
	{
		System.out.println("File does not exist");
	}
	}
	catch(Exception Ex)
	{
	
	System.out.println("unable to delete file.Please contact:admin@test.com");
}
	
}
/**
 * this method search the files
 */
public static void searchFiles() 
{
	try
	{
	@SuppressWarnings("resource")
	//input from user
	Scanner obj= new Scanner(System.in);
	String filename;
	System.out.println("Enter file name to be Searched:");
	filename=obj.nextLine();
	//Get all files names into a list
		ArrayList <String> allFilesnames=new ArrayList <String> ();
		
		File folder=new File(projectFilesPath);
		File[] listofFiles=folder.listFiles();

		if(listofFiles.length>0)
		{
		System.out.println("The Files are listed below:\n");
		for(var l:listofFiles)
		{
			allFilesnames.add(l.getName());
		}
		
		}
		
		@SuppressWarnings("unused")
		//creating object file
		File f=new File(projectFilesPath+"\\"+filename);
		if(allFilesnames.contains(filename))
		{
			System.out.println("File is available");
		}
		else
		{
			System.out.println("File is not available");
		}
}
	catch(Exception Ex)
	{
		
	}
}
}
