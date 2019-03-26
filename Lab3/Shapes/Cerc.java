package Shapes;

public class Cerc extends Punct {
	public Cerc(double raza){
		super(raza);
	}
	
	public double aria() {
		return 3.14 * m_raza_latura * m_raza_latura;
	}
	
	public double perimetru() {
		return 2 * 3.14 * m_raza_latura;
	}
	
	
}
