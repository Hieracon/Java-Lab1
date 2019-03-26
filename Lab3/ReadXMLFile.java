import java.io.File;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import Shapes.*;

public class ReadXMLFile
{
	public static void main(String[] args)
	{
		
		try
		{
			File inputFile = new File("src/info.xml");
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser saxParser = factory.newSAXParser();
			UserHandler userhandler = new UserHandler();
			saxParser.parse(inputFile, userhandler);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}   
}

class UserHandler extends DefaultHandler {
	boolean bnume = false;
	boolean blungime = false;
	boolean blatime = false;
	boolean blatura = false;
	boolean braza = false;
		
	public double lungime;
	public double latime;
	public double raza_latura;

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		if(qName.equalsIgnoreCase("nume"))
		{
			bnume = true;
		}
		else
		{
			if(qName.equalsIgnoreCase("lungime"))
			{
				blungime = true;
		    }
			else
			{
				if(qName.equalsIgnoreCase("latime"))
				{
					blatime = true;
			    }
				else
				{
					if(qName.equalsIgnoreCase("latura"))
					{
						blatura = true;
				    }
					else
					{
						if(qName.equalsIgnoreCase("raza"))
						{
							braza = true;
					    }
					}
				}
			}
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException
	{      
		if (qName.equalsIgnoreCase("data"))
		{
			System.out.println("End data :" + qName);
		}
	}

	@Override
	public void characters(char ch[], int start, int length) throws SAXException
	{
		if (bnume)
		{
			String temp;
			temp = new String(ch, start, length);
			
			System.out.println(temp);
			
			bnume = false;
		}
		else
		{
			if (blungime)
			{
				String temp;
				temp = new String(ch, start, length);
				lungime = Double.parseDouble(temp);
				
				blungime = false;
			}
			else
			{
				if (blatime)
				{
					String temp;
					temp = new String(ch, start, length);
					latime = Double.parseDouble(temp);
					
					Dreptunghi obj1 = new Dreptunghi(lungime,latime);
					
					System.out.println("Aria = " + obj1.aria());
					System.out.println("Perimetrul = " + obj1.perimetru());
					System.out.println();
					
					blatime = false;
				}
				else
				{
					if (blatura)
					{
						String temp;
						temp = new String(ch, start, length);
						raza_latura = Double.parseDouble(temp);
						
						Patrat obj2 = new Patrat(raza_latura);
						
						System.out.println("Aria = " + obj2.aria());
						System.out.println("Perimetrul = " + obj2.perimetru());
						System.out.println();
						
						blatura = false;
					}
					else
					{
						if (braza)
						{
							String temp;
							temp = new String(ch, start, length);
							raza_latura = Double.parseDouble(temp);
							
							Cerc obj3 = new Cerc(raza_latura);
							
							System.out.println("Aria = " + obj3.aria());
							System.out.println("Circumferinta = " + obj3.perimetru());
							System.out.println();
							
							braza = false;
						}
					}
				}
			}
		}
	}
}
	
