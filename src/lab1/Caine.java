package lab1;

public abstract class Caine {
	public String m_nume;
	public String m_culoare;
	public double m_inaltime;
	public double m_greutate;
	public int m_varsta;
	
	Caine(String nume, String culoare, double inaltime, double greutate, int varsta)
	{
		this.m_nume = nume;
		this.m_culoare = culoare;
		this.m_inaltime = inaltime;
		this.m_greutate = greutate;
		this.m_varsta = varsta;
	}
	
	abstract void tip_caine();
}
