package lab2;

import java.util.Vector;

public class Patrat extends Punct {
	private double m_latura;
	
	public double aria(Vector<String> data) {
		m_latura = Double.parseDouble(data.elementAt(1));
				
		return m_latura * m_latura;
	}
	
	public double perimetru(Vector<String> data) {
		m_latura = Double.parseDouble(data.elementAt(1));
		
		return 4*m_latura;
	}
}
