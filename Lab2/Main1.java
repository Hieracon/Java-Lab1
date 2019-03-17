import java.io.*;
import java.util.*;

import lab2.*;

public class Main1 {

	public static void main(String[] args) {
		Vector<String> data = new Vector<String>();
		
		try {
			File fi = new File("src/input.txt");
			Scanner scan = new Scanner(fi);
			
			while(scan.hasNextLine()) {
				data.addElement(scan.nextLine());
				
				if(data.elementAt(0).equals("Dreptunghi")) {
					data.addElement(scan.nextLine());
					data.addElement(scan.nextLine());
					
					Dreptunghi obj1 = new Dreptunghi();
					
					obj1.display(data);
				}
				else {
					if(data.elementAt(0).equals("Patrat")) {
						data.addElement(scan.nextLine());
						
						Patrat obj2 = new Patrat();
						
						obj2.display(data);
					}
					else {
						if(data.elementAt(0).equals("Cerc")){
							data.addElement(scan.nextLine());
							
							Cerc obj3 = new Cerc();
							
							obj3.display(data);
						}
					}
				}
				
				System.out.println(data);
			}
			scan.close();
		}
		catch(Exception e) {
			System.out.println("A aparut o eroare");
			e.printStackTrace();
		}
	}
}
