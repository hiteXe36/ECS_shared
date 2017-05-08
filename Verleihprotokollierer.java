import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 * @author Paul Mathia u. Vadim Budagov
 * Die Klasse Verleihprotokollierer protokolliert Ausleih- und Rückgabe von Medien
 */
public class Verleihprotokollierer
{
	
	/**
	 * Eine Methode protokolliere die zwei Ereignisse protokolliert.
	 * Einmal die Ausleihe und einmal die Rückgabe eines Mediums 
	 * @param verleihkarte Verleihkarte die übergeben werden muss
	 * @param ereignis Eines von zwei möglichen Ereignissen: Ausleihe oder Rückgabe
	 * @require ereignis != null
	 * @require verleihkarte != null
	 */
	public void protokolliere(VerleihEreignis ereignis, Verleihkarte verleihkarte) throws ProtokollierException
	{
        assert ereignis != null : "Vorbedingung verletzt: ereignis != null";
        assert verleihkarte != null : "Vorbedingung verletzt: verleihkarte != null";
		try(FileWriter filewriter = new FileWriter("./protokoll.txt", true))
		{
			String ereignisProtokoll;
			switch(ereignis)
			{	
			case AUSLEIHE: 
				ereignisProtokoll = "AUSLEIHE: \n" + verleihkarte.getFormatiertenString();
				filewriter.write(ereignisProtokoll);
				break;
			case RUECKGABE: 
				ereignisProtokoll = "RUECKGABE: \n" + verleihkarte.getFormatiertenString();
				filewriter.write(ereignisProtokoll);	
				break;
			}


		}
		catch(IOException e)
		{
			throw new ProtokollierException("Protokollfehler");
		}
		
	}
	
}
