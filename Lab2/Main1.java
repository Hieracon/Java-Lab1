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
					
					try {
						FileWriter fw = new FileWriter("src/output.txt",true);
						
						
						fw.write(data.elementAt(0) + "\n");
						fw.write("Aria = " + obj1.aria(data) + "\n");
						fw.write("Perimetrul = " + obj1.perimetru(data) + "\n");
						fw.write("\n");
						fw.write("Datele de intrare sunt: \n");
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
				else {
					if(data.elementAt(0).equals("Patrat")) {
						data.addElement(scan.nextLine());
						
						Patrat obj2 = new Patrat();
						
						try {
							FileWriter fw = new FileWriter("src/output.txt",true);
							
							
							fw.write(data.elementAt(0) + ":\n");
							fw.write("Aria = " + obj2.aria(data) + "\n");
							fw.write("Perimetrul = " + obj2.perimetru(data) + "\n");
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
					else {
						if(data.elementAt(0).equals("Cerc")){
							data.addElement(scan.nextLine());
							
							Cerc obj3 = new Cerc();
							
							try {
								FileWriter fw = new FileWriter("src/output.txt",true);
								
								
								fw.write(data.elementAt(0) + ":\n");
								fw.write("Aria = " + obj3.aria(data) + "\n");
								fw.write("Perimetrul = " + obj3.perimetru(data) + "\n");
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
