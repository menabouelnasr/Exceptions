import java.io.*;
public class ExceptionExample 
{

	public static void main(String[] args) 
	{
		FileInputStream fis = null;
		
		try
		{
			fis = new FileInputStream("c:\\myfile.txt");
			
			int k;
			while((k= fis.read()) != -1)
			{
				System.out.println((char)k);
			}
		}catch (Exception e)
		{
			System.out.println("You fool! There is no file.");
		}

	}
	//Change
}
