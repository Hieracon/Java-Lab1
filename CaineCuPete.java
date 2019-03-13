package lab1;

import java.util.Scanner;

public class CaineCuPete implements Caine
{
	private String m_nume;
	private double m_inaltime;
	private double m_greutate;
	private int m_varsta;
	private String m_culoare;
	private int m_nr_pete;
	
	public CaineCuPete()
	{
		m_nume = "";
		m_inaltime = 0.0;
		m_greutate = 0.0;
		m_varsta = 0;
		m_culoare = "";
		m_nr_pete = 0;
	}
	
	public void read()
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduceti numele:");
		m_nume = scan.nextLine();
		
		System.out.print("Introduceti culoarea:");
		m_culoare = scan.nextLine();
		
		System.out.print("Introduceti inaltimea:");
		m_inaltime = scan.nextDouble();
		
		System.out.print("Introduceti greutatea:");
		m_greutate = scan.nextDouble();
		
		System.out.print("Introduceti varsta:");
		m_varsta = scan.nextInt();
		
		System.out.print("Introduceti numarul petelor:");
		m_nr_pete = scan.nextInt();
		
		scan.close();
    }
	
	public void display() 
	{
		System.out.println("Nume: " + m_nume);
		System.out.println("Culoare: " + m_culoare);
		System.out.println("Inaltime: " + m_inaltime);
		System.out.println("Greutate: " + m_greutate);
		System.out.println("Varsta: " + m_varsta);
		System.out.println("Numar pete: " + m_nr_pete);
	}
}
