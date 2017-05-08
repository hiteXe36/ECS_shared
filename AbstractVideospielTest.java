import static org.junit.Assert.assertEquals;
import org.junit.Test;

public abstract class AbstractVideospielTest
{
    	protected static final String KOMMENTAR = "Kommentar";
    	protected static final String TITEL = "Titel";
        protected static final String SYSTEM = "System";
    	protected static String BEZEICHNUNG;
	    protected AbstractVideospiel _videoSpiel1;
	    protected AbstractVideospiel _videoSpiel2;

	    public AbstractVideospielTest()
	    {
	    	BEZEICHNUNG = "";
	        _videoSpiel1 = getMedium();
		    _videoSpiel2 = getMedium();
	    }

	    @Test
	    public abstract void testeVideospiel();

	    @Test
	    public void testGetMedienBezeichnung()
	    {
	    	String bezeichnung = BEZEICHNUNG;
	        assertEquals(bezeichnung, _videoSpiel1.getMedienBezeichnung());
	        assertEquals(bezeichnung, _videoSpiel2.getMedienBezeichnung());
	    }

	  
	    @Test
	    public final void testSetKommentar()
	    {
	        AbstractVideospiel medium = getMedium();
	        medium.setKommentar("Kommentar2");
	        assertEquals(medium.getKommentar(), "Kommentar2");
	    }

	    @Test
	    public final void testSetTitel()
	    {
	        AbstractVideospiel medium = getMedium();
	        medium.setTitel("Titel2");
	        assertEquals(medium.getTitel(), "Titel2");
	    }
	    
	    @Test
	    public void testKonstruktor()
	    {
	    	assertEquals(TITEL, _videoSpiel1.getTitel());
	        assertEquals(KOMMENTAR, _videoSpiel1.getKommentar());
	        assertEquals(SYSTEM, _videoSpiel1.getSystem());
	    	assertEquals(TITEL, _videoSpiel2.getTitel());
	        assertEquals(KOMMENTAR, _videoSpiel2.getKommentar());
	        assertEquals(SYSTEM, _videoSpiel2.getSystem());
	    }
	    public abstract void testBerechneMietgebuehr();
	    
	    protected abstract AbstractVideospiel getMedium();




}



