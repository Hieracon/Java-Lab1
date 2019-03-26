package Shapes;

public abstract class Punct {
	public double m_lungime;
	public double m_latime;
	public double m_raza_latura;
	
	Punct(double lungime, double latime){
		this.m_lungime = lungime;
		this.m_latime = latime;
	}
	
	Punct(double raza_latura){
		this.m_raza_latura = raza_latura;
	}
	
	abstract double aria();
	abstract double perimetru();
}
