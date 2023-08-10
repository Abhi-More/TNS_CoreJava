package org.tnsif.checkedexception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileNotFoundExceptionExecutor {

	public static void main(String[] args) /* throws FileNotFoundException */ 
	{
		try 
		{
//			FileInputStream f = new FileInputStream("D:\\Resumes\\Kanaka\\Abhishek_More_Resume.pdf");
//			FileInputStream f = new FileInputStream("D:\\Resumes\\Kanaka\\Abhishek.pdf");
//			FileInputStream f = new FileInputStream("Abhishek_More_Resume.pdf");   // We have to give system path from root
			FileInputStream f = new FileInputStream("C:\\AbhishekCode\\TNSEclipseWorkspace\\tnsdayeleven\\src\\org\\tnsif\\checkedexception\\Abhishek_More_Resume.pdf");
			System.out.println("File Exist");
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
