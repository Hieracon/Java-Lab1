package Shapes;

public class Patrat extends Punct {
	public Patrat(double latura){
		super(latura);
	}
	
	public double aria() {
		return m_raza_latura * m_raza_latura;
	}
	
	public double perimetru() {
		return 4 * m_raza_latura;
	}
	
	
}