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
						FileWriter fw = new FileWriter("src/output1.txt");
						PrintWriter pw = new PrintWriter(fw);
						
						pw.println(data.elementAt(0) + ":");
						pw.println("Aria = " + obj1.aria(data));
						pw.println("Perimetrul = " + obj1.perimetru(data));
						pw.println();
						pw.println("Datele de intrare sunt:");
						for(int i = 0; i < data.size(); ++i) {
							pw.println(data.elementAt(i));
						}
						
						data.clear();
						pw.close();
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
							FileWriter fw = new FileWriter("src/output2.txt");
							PrintWriter pw = new PrintWriter(fw);
							
							pw.println(data.elementAt(0) + ":");
							pw.println("Aria = " + obj2.aria(data));
							pw.println("Perimetrul = " + obj2.perimetru(data));
							pw.println();
							pw.println("Datele de intrare sunt:");
							for(int i = 0; i < data.size(); ++i) {
								pw.println(data.elementAt(i));
							}
							
							data.clear();
							pw.close();
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
								FileWriter fw = new FileWriter("src/output3.txt");
								PrintWriter pw = new PrintWriter(fw);
								
								pw.println(data.elementAt(0) + ":");
								pw.println("Aria = " + obj3.aria(data));
								pw.println("Perimetrul = " + obj3.perimetru(data));
								pw.println();
								pw.println("Datele de intrare sunt:");
								for(int i = 0; i < data.size(); ++i) {
									pw.println(data.elementAt(i));
								}
								
								data.clear();
								pw.close();
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
