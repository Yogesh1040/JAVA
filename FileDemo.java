package p4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo 
{
	File f;
	String fName, path;
	long size;
	
	public FileDemo() throws IOException
	{
		f = new File("yash.txt");
		if(f.exists() == true)
		{
			System.out.println("File Already Exits");
		}
		else
		{
			System.out.println("File Does Not Exists");
			f.createNewFile();
		}
		
		System.out.println("Name - "+f.getName());
		System.out.println("Path - "+f.getPath());
		System.out.println("Abs Path - "+f.getAbsolutePath());
		
		if(f.canWrite() == true)
		{
			System.out.println("Write ");
			
			
		}
		if(f.canRead() == true)
		{
			System.out.println("Read");
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		
		FileDemo f1 = new FileDemo();
	}

}
