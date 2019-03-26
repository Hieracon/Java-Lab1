package Shapes;

public class Dreptunghi extends Punct {
	public Dreptunghi(double lungime, double latime){
		super(lungime, latime);
	}
	
	public double aria() {	
		return m_lungime * m_latime;
	}
	
	public double perimetru() {
		return 2*(m_lungime + m_latime);
	}
}
