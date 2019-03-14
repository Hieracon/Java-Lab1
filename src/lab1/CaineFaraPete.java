package lab1;

public class CaineFaraPete extends Caine
{
	public CaineFaraPete(String nume, String culoare, double inaltime, double greutate, int varsta)
	{
		super(nume, culoare, inaltime, greutate, varsta);
	}
	
	void tip_caine()
	{
		System.out.println("Cainele nu are pete");
	}
}
