package lab1;

public class CaineCuPete extends Caine
{	
	public CaineCuPete(String nume, String culoare, double inaltime, double greutate, int varsta)
	{
		super(nume, culoare, inaltime, greutate, varsta);
	}
	
	void tip_caine()
	{
		System.out.println("Cainele are pete");
	}
}
