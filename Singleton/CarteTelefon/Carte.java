package CarteTelefon;

import java.util.ArrayList;

public class Carte
{
	private static Carte instance = null;
	ArrayList<Abonat> list = new ArrayList<Abonat>();
	
	private Carte() {}
	
	public static Carte getInstance()
	{
		if(instance == null)
		{
			instance = new Carte();
		}
		
		return instance;
	}
	
	public void adaugare_abonat(String nume, String adresa, String nr_tel)
	{
		Abonat obj = new Abonat(nume, adresa, nr_tel);
		list.add(obj);
	}
	
	public void cautare_nume(String nume)
	{
		boolean found = false;
		
		for(int it = 0; it < list.size(); ++it)
		{
			if(list.get(it).m_nume.equals(nume))
			{
				found = true;
				System.out.println("Numarul de telefon este:" + list.get(it).m_nr_tel);
			}
		}
		
		if(found != true)
		{
			System.out.println("Abonatul nu a putut fi gasit");
		}
	}
}
