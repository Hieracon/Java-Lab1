package lab2;

import java.io.FileWriter;
import java.util.Vector;

public abstract class Punct {
	abstract double aria(Vector<String> data);
	abstract double perimetru(Vector<String> data);
	
	public void display(Vector<String> data) {
		try {
			FileWriter fw = new FileWriter("src/output.txt",true);
			
			
			fw.write(data.elementAt(0) + ":\n");
			fw.write("Aria = " + aria(data) + "\n");
			fw.write("Perimetrul = " + perimetru(data) + "\n");
			fw.write("\n");
			fw.write("Datele de intrare sunt:\n");
			for(int i = 0; i < data.size(); ++i) {
				fw.write(data.elementAt(i) + "\n");
			}
			fw.write("\n");
			
			data.clear();
			fw.close();
		}
		catch(Exception e) {
			System.out.println("no se pueda");
			e.printStackTrace();
		}
	}
}
