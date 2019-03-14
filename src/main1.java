import java.util.Scanner;

import lab1.*;

public class main1
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
			
		System.out.print("Introduceti numele:");
		String nume = scan.nextLine();
			
		System.out.print("Introduceti culoarea:");
		String culoare = scan.nextLine();
			
		System.out.print("Introduceti inaltimea:");
		double inaltime = scan.nextDouble();
			
		System.out.print("Introduceti greutatea:");
		double greutate = scan.nextDouble();
			
		System.out.print("Introduceti varsta:");
		int varsta = scan.nextInt();
		
		System.out.print("Daca cainele are pete apasati 1." + "\n" + "Daca nu are pete apasati 2.");
		int temp = scan.nextInt();
		int ok = 0;
		
		do{
			if(temp == 1)
			{
				CaineCuPete obj1 = new CaineCuPete(nume, culoare, inaltime, greutate, varsta);
				
				System.out.print("Introduceti numarul petelor:");
				int nr_pete = scan.nextInt();
				
				System.out.println("Nume: " + obj1.m_nume);
				System.out.println("Culoare: " + obj1.m_culoare);
				System.out.println("Inaltime: " + obj1.m_inaltime);
				System.out.println("Greutate: " + obj1.m_greutate);
				System.out.println("Varsta: " + obj1.m_varsta);
				System.out.println("Numarul petelor: " + nr_pete);
				
				ok = 1;
			}
			else
			{
				if(temp == 2)
				{
					CaineFaraPete obj2 = new CaineFaraPete(nume, culoare, inaltime, greutate, varsta);
					
					System.out.println("Nume: " + obj2.m_nume);
					System.out.println("Culoare: " + obj2.m_culoare);
					System.out.println("Inaltime: " + obj2.m_inaltime);
					System.out.println("Greutate: " + obj2.m_greutate);
					System.out.println("Varsta: " + obj2.m_varsta);
					
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