

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 */
public class VideospielTest
{
    private static final String KOMMENTAR = "Kommentar";
    private static final String TITEL = "Titel";
    private static final String BEZEICHNUNG = "Videospiel";
    private static final String SYSTEM = "System";
    private Videospiel _videoSpiel;

    public VideospielTest()
    {
        _videoSpiel = getMedium();
    }

    @Test
    public void testeVideospiel()
    {
        assertEquals(TITEL, _videoSpiel.getTitel());
        assertEquals(KOMMENTAR, _videoSpiel.getKommentar());
        assertEquals(SYSTEM, _videoSpiel.getSystem());
    }

    @Test
    public void testGetMedienBezeichnung()
    {
        assertEquals(BEZEICHNUNG, _videoSpiel.getMedienBezeichnung());
    }

    protected Videospiel getMedium()
    {
        return new Videospiel(TITEL, KOMMENTAR, SYSTEM);
    }
}
