package Run;

import CarteTelefon.*;
import java.util.Scanner;

public class Test {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		boolean ok = true;
		
		Carte carte_tel = Carte.getInstance();
		
		do
		{
			System.out.println("Pentru a adauga un abonat apasati 1.");
			System.out.println("Pentru a cauta un abonat dupa nume apasati 2.");
			System.out.println("Pentru a iesi apasati alt buton.");
			
			int check = scan.nextInt();
			
			if(check == 1)
			{
				scan.nextLine();
				System.out.print("Numele abonatului este:");
				String nume = scan.nextLine();
				System.out.print("Adresa abonatului este:");
				String adresa = scan.nextLine();
				System.out.print("Numarul de telefon al abonatului este:");
				String nr_tel = scan.nextLine();
				
				carte_tel.adaugare_abonat(nume, adresa, nr_tel);
			}
			else
			{
				if(check == 2)
				{
					scan.nextLine();
					System.out.print("Numele abonatului cautat este:");
					String nume = scan.nextLine();
					System.out.println();
					
					carte_tel.cautare_nume(nume);
				}
				else
				{
					ok = false;
				}
			}
			System.out.println();
		}
		while(ok);
		
		scan.close();
	}

}
