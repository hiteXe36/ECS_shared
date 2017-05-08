import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class KonsolenVideospielTest extends AbstractVideospielTest
{
	private KonsolenVideospiel _videospielKonsole;

    public KonsolenVideospielTest()
    {
        super();
        if(_videoSpiel1 instanceof KonsolenVideospiel)
        {
        	_videospielKonsole = (KonsolenVideospiel) _videoSpiel1;
        }
        BEZEICHNUNG = "Konsolen Videospiel";
    }

    @Test
    public void testeVideospiel()
    {
        assertEquals(TITEL, _videospielKonsole.getTitel());
        assertEquals(KOMMENTAR, _videospielKonsole.getKommentar());
        assertEquals(SYSTEM, _videospielKonsole.getSystem());
    }

    @Test
    public void testGetMedienBezeichnung()
    {
        assertEquals("Konsolen Videospiel", _videospielKonsole.getMedienBezeichnung());
    }

    protected AbstractVideospiel getMedium()
    {
        return new KonsolenVideospiel(TITEL, KOMMENTAR, SYSTEM);
    }
    
    /**
     * Variante mit der Methode getEuroAnteil;
     */
    @Test 
    public void testBerechneMietgebuehr()
    {
    	int miettage = 1;
    	assertEquals(Geldbetrag.get(200), _videospielKonsole.berechneMietgebuehr(miettage));
    	miettage = 3;
    	assertEquals(Geldbetrag.get(900), _videospielKonsole.berechneMietgebuehr(miettage));
    	miettage = 6;
    	assertEquals(Geldbetrag.get(1600), _videospielKonsole.berechneMietgebuehr(miettage));
    	miettage = 9;
    	assertEquals(Geldbetrag.get(2300), _videospielKonsole.berechneMietgebuehr(miettage));
    	miettage = 12;
    	assertEquals(Geldbetrag.get(3000), _videospielKonsole.berechneMietgebuehr(miettage));
    	miettage = 14;
    	assertEquals(Geldbetrag.get(3000), _videospielKonsole.berechneMietgebuehr(miettage));
    	miettage = 16;
    	assertEquals(Geldbetrag.get(3700), _videospielKonsole.berechneMietgebuehr(miettage));
    	miettage = 18;
    	assertEquals(Geldbetrag.get(4400), _videospielKonsole.berechneMietgebuehr(miettage));
    	miettage = 20;
    	assertEquals(Geldbetrag.get(4400), _videospielKonsole.berechneMietgebuehr(miettage));
    }

}


