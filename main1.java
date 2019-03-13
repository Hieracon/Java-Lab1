import java.util.Scanner;

import lab1.CaineCuPete;
import lab1.CaineFaraPete;

public class main1
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Daca cainele are pete apasati 1." + "\n" + "Daca nu are pete apasati 2.");
		int temp = scan.nextInt();
		int ok = 0;
		
		do{
			if(temp == 1)
			{
				CaineCuPete obj1 = new CaineCuPete();
		
				obj1.read();
				obj1.display();
				
				ok = 1;
			}
			else
			{
				if(temp == 2)
				{
					CaineFaraPete obj2 = new CaineFaraPete();
				
					obj2.read();
					obj2.display();
					
					ok = 1;
				}
				else
				{
					System.out.print("Daca cainele are pete apasati 1." + "\n" + "Daca nu are pete apasati 2.");
					temp = scan.nextInt();
				}
			}
		}
		while(ok == 0);
		scan.close();
	}
}