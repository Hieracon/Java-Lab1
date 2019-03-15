package lab2;

import java.util.*;

public class Dreptunghi extends Punct {
	private double m_lungime;
	private double m_latime;
	
	public double aria(Vector<String> data) {
		m_lungime = Double.parseDouble(data.elementAt(1));
		m_latime = Double.parseDouble(data.elementAt(2));
				
		return m_lungime * m_latime;
	}
	
	public double perimetru(Vector<String> data) {
		m_lungime = Double.parseDouble(data.elementAt(1));
		m_latime = Double.parseDouble(data.elementAt(2));
		
		return 2*(m_lungime + m_latime);
	}
}
