import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PCVideospielTest extends AbstractVideospielTest
{
	private PCVideospiel _videospielPC;

    public PCVideospielTest()
    {
     	super();
        if(_videoSpiel2 instanceof PCVideospiel)
        {
        	_videospielPC = (PCVideospiel) _videoSpiel2;
        }
        BEZEICHNUNG = "PC Videospiel";
    }


    @Test
    public void testeVideospiel()
    {
        assertEquals(TITEL, _videospielPC.getTitel());
        assertEquals(KOMMENTAR, _videospielPC.getKommentar());
        assertEquals(SYSTEM, _videospielPC.getSystem());
    }

    @Test
    public void testGetMedienBezeichnung()
    {
    	super.testGetMedienBezeichnung();
        assertEquals("PC Videospiel", _videospielPC.getMedienBezeichnung());
    }

    
    protected AbstractVideospiel getMedium()
    {
        return new PCVideospiel(TITEL, KOMMENTAR, SYSTEM);
    }
    
    
    @Test 
    public void testBerechneMietgebuehr()
    {
    	int miettage = 1;
    	assertEquals(Geldbetrag.get(200), _videospielPC.berechneMietgebuehr(miettage));
    	miettage = 3;
    	assertEquals(Geldbetrag.get(200), _videospielPC.berechneMietgebuehr(miettage));
    	miettage = 6;
    	assertEquals(Geldbetrag.get(200), _videospielPC.berechneMietgebuehr(miettage));
    	miettage = 9;
    	assertEquals(Geldbetrag.get(700), _videospielPC.berechneMietgebuehr(miettage));
    	miettage = 12;
    	assertEquals(Geldbetrag.get(1200), _videospielPC.berechneMietgebuehr(miettage));
    	miettage = 14;
    	assertEquals(Geldbetrag.get(1200), _videospielPC.berechneMietgebuehr(miettage));
    	miettage = 16;
    	assertEquals(Geldbetrag.get(1200), _videospielPC.berechneMietgebuehr(miettage));
    	miettage = 18;
    	assertEquals(Geldbetrag.get(1700), _videospielPC.berechneMietgebuehr(miettage));
    	miettage = 25;
    	assertEquals(Geldbetrag.get(2200), _videospielPC.berechneMietgebuehr(miettage));
    }

}


