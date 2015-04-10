
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Prob01
	{
	public static void main(String[] args) throws FileNotFoundException
		{
		Scanner input = new Scanner(new File("Prob01.txt"));
		while(input.hasNextInt())
			{					
			int index = input.nextInt();
			if(index % 3 == 0 && index % 7 == 0)
				{
				System.out.println("CODEQUEST");
				}
			if(index % 3 == 0 && index % 7 != 0)
				{
				System.out.println("CODE");
				}
			if(index % 3 != 0 && index % 7 == 0)
				{
				System.out.println("QUEST");
				}
			else
				{
				System.out.println(index);
				}				
			}
		}
	}
	
