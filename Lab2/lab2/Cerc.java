package lab2;

import java.util.Vector;

public class Cerc extends Punct {
	private double m_raza;
	
	public double aria(Vector<String> data) {
		m_raza = Double.parseDouble(data.elementAt(1));
				
		return 3.14 * m_raza * m_raza;
	}
	
	public double perimetru(Vector<String> data) {
		m_raza = Double.parseDouble(data.elementAt(1));
		
		return 2 * 3.14 * m_raza;
	}
}
